package nttdata.javat1.game;

import java.util.InputMismatchException;
import java.util.Scanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase Game
 * 
 * @author manoli
 *
 */
public class Game {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(Game.class);

	/** Nombre del jugador */
	private String playerName;

	/** Objetos Scanner */
	Scanner scName = new Scanner(System.in);
	Scanner scOption = new Scanner(System.in);

	/** Objeto Ball */
	Ball ball = new Ball();

	/** Constantes String para Logger */
	private static final String LOG_START = "TRAZA DE INICIO";
	private static final String LOG_END = "TRAZA FIN";

	/**
	 * Inicio del juego
	 */
	public void launchAndStart() {

		LOG.info(LOG_START);

		System.out.println("Bienvenido/a al juego del pinball");
		System.out.println("Introduce tu nombre de jugador");

		// Guarda el nombre del jugador.
		playerName = scName.next();

		play();

		LOG.info(LOG_END);
	}

	/**
	 * Menú del juego
	 */
	private void play() {

		LOG.info(LOG_START);

		int option;

		try {

			// El dato introducido solo puede ser número 1 o 2
			do {

				// Menú para empezar o terminar el juego.
				System.out.println("\nMENÚ");
				System.out.println("1. Empezar");
				System.out.println("2. Finalizar");

				option = scOption.nextInt();

				switch (option) {

				case 1:
					System.out.println("¡El juego ha empezado!");
					System.out.println("Tienes 3 bolas");

					start();
					break;

				case 2:
					System.out.println("El juego ha finalizado. ¡Hasta pronto!");
					break;

				default:
					LOG.warn("Opción incorrecta");
					System.out.println("Opción incorrecta");
				}

			} while (option != 1 && option != 2);

		} catch (InputMismatchException e) {

			LOG.error("Tipo de dato introducido incorrecto");

			System.out.println("Solo puedes escoger el 1 o el 2. Empieza de nuevo");
		}

		LOG.info(LOG_END);
	}

	/**
	 * Lanzamiento de la bola
	 */
	private void start() {

		LOG.info(LOG_START);

		// Inicia las vidas a 3.
		ball.setLife(3);

		// Inicia la puntuación a 0.
		ball.setScore(0);

		// Ejecuta el método bounce() mientras la vida sea superior a 0.
		do {

			ball.bounce();

		} while (ball.getLife() > 0);

		System.out.println("\nLa partida se ha acabado");

		end();

		LOG.info(LOG_END);
	}

	/**
	 * Fin del juego
	 */
	private void end() {

		LOG.info(LOG_START);

		System.out.println("\n" + playerName + " HAS OBTENIDO EN TOTAL " + ball.getScore() + " PUNTOS");
		System.out.println("¿Quieres volver a jugar?");

		play();

		LOG.info(LOG_END);
	}
}
