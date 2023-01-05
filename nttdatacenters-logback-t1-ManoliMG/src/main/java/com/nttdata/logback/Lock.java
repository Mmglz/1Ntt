package com.nttdata.logback;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase principal
 * 
 * @author manoli
 *
 */
public class Lock {

	/** LOGGER **/
	private static final Logger LOG = LoggerFactory.getLogger(Lock.class);

	/**
	 * Método principal
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		LOG.info("TRAZA DE INICIO");

		try (Scanner scanner = new Scanner(System.in)) {

			int secretNum;

			// Se pide un número comprendido entre el 2000 y el 9999
			do {
				
				System.out.println("Dime un número secreto entre 2000 y 9999");
				secretNum = scanner.nextInt();

				if (secretNum < 2000 || secretNum > 9999) {
					System.out.println("Error, tiene que estar comprendido entre 2000 y 9999");
				
				}

			} while (secretNum < 2000 || secretNum > 9999);

			tryOpen(secretNum);
		}
		LOG.info("TRAZA FIN");
	}

	/**
	 * Método para comprobar cada número 
	 * 
	 * @param secretNum
	 */
	private static void tryOpen(int secretNum) {
		int check = 0;

		// Comprueba cada número hasta llegar al número introducido por teclado
		do {

			if (secretNum != check) {
				LOG.info("No se abre con el número {}", check);
				check++;
			}

		} while (secretNum != check);

		LOG.info("Se abrió con el número {}", check);
	}
}