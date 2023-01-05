package nttdata.javat3;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import nttdata.javat3.business.ManagementServiceImpl;

/**
 * Clase principal
 * 
 * @author manoli
 *
 */
public class T3MainMMG {
	
	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(T3MainMMG.class);

	/**
	 * Método principal que invoca a los métodos de la clase ManagementServiceImpl.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		LOG.info("TRAZA DE INICIO");

		ManagementServiceImpl m = new ManagementServiceImpl();

		// Imprime todas las personas.
		m.printAllPersons();

		// Añade personas a la base de datos.
		m.addNewPerson("Estudiante", 12345678, "Maria", "Sotero Hernandez", "DAW", null, null);
		m.addNewPerson("Estudiante", 58136479, "Pedro", "Cesur", "DAW", null, null);
		m.addNewPerson("Estudiante", 21548936, "Pepa", "Salesianas", "DAM", null, null);
		
		m.addNewPerson("Empleado", 98765432, "Daniel", null, null, "Jefe de proyecto", "Naturgy");
		m.addNewPerson("Empleado", 84123970, "Paco", null, null, "Programador Junior", "Santander");
		m.addNewPerson("Empleado", 32014587, "Luisa", null, null, "Experto tecnológico", "Naturgy");
		
		m.addNewPerson("Estudiante", 68413947, "Pepa", "Salesianas", "ASIR", null, null);
		m.addNewPerson("", 68413946, "Pepe", "Salesianas", "DAW", null, null);

		// Imprime todas las personas.
		m.printAllPersons();

		// Imprime el número total de personas.
		m.printPersonTotalNum();

		// Elimina personas de la base de datos.
		m.deletePerson(21548936);

		m.deletePerson(1234);

		// Busca empleados por su id en el mapa.
		 m.searchPerson(98765432);
		 m.searchPerson(58136479);
		 m.searchPerson(1234);

		// Imprime el número total de personas.
		m.printPersonTotalNum();
		
		LOG.info("TRAZA FIN");
	}
}
