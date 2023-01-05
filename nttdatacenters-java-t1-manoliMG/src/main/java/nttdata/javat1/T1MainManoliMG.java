package nttdata.javat1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import nttdata.javat1.game.Game;

/**
 * Clase principal
 * 
 * @author manoli
 *
 */
public class T1MainManoliMG {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(T1MainManoliMG.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LOG.info("TRAZA DE INICIO");

		final Game pinball = new Game();

		// Inicio del juego.
		pinball.launchAndStart();

		LOG.info("TRAZA FIN");
	}
}
