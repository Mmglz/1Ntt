package nttdata.javat1.game;

import java.util.Random;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase Ball
 * 
 * @author manoli
 *
 */
public class Ball {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(Ball.class);

	/** Puntuación */
	private int score;

	/** Vidas */
	private int life;

	/** Creación de un objeto Random */
	final Random r = new Random();

	/**
	 * Rebotes de la bola
	 */
	public void bounce() {

		LOG.info("TRAZA DE INICIO");

		// Iteración de los 4 rebotes.
		for (int i = 1; i < 5; i++) {

			LOG.info("Rebote número {}", i);

			System.out.println("\nRebote número " + i);

			// Genera un número al alzar entre el 1 y el 10.
			int randomNum = r.nextInt(10) + 1;

			// Obtención de puntos dependiendo del número al azar.
			if (randomNum <= 2) {
				score -= 10;
				System.out.println("Has perdido -10 puntos");

			} else if (randomNum > 2 && randomNum <= 4) {
				score -= 20;
				System.out.println("Has perdido -20 puntos");

			} else if (randomNum > 4 && randomNum <= 6) {
				score += 100;
				System.out.println("Has obtenido 100 puntos");

			} else if (randomNum > 6 && randomNum <= 8) {
				score += 200;
				System.out.println("Has obtenido 200 puntos");

			} else if (randomNum == 9) {
				score += 500;
				System.out.println("Has obtenido 500 puntos");

			} else {
				if (score == 0) {
					score += 1000;
					System.out.println("Has obtenido 1000 puntos, ¡que buen comienzo!");

				} else {
					score *= 2;
					System.out.println("¡Tu puntuación se ha multiplicado por 2!");
				}
			}
		}

		life--;

		System.out.println("\nHas perdido una bola, te quedan " + life + " bolas");

		LOG.info("TRAZA FIN");
	}

	/**
	 * @param score the score to set
	 */
	public void setScore(int score) {
		this.score = score;
	}

	/**
	 * @param life the life to set
	 */
	public void setLife(int life) {
		this.life = life;
	}

	/**
	 * @return the score
	 */
	public int getScore() {
		return score;
	}

	/**
	 * @return the life
	 */
	public int getLife() {
		return life;
	}
}
