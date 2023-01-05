package nttdata.javat3.business;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Clase que implementa la interfaz ManagementServiceI.
 * 
 * @author manoli
 *
 */
public class ManagementServiceImpl implements ManagementServiceI {

	/** LOGGER */
	private static final Logger LOG = LoggerFactory.getLogger(ManagementServiceImpl.class);
	
	/** Constantes String para Logger */
	private static final String LOG_START = "TRAZA DE INICIO";
	private static final String LOG_END = "TRAZA FIN\n";
	
	/** Mapa database de clave integer y de valor un objeto Persona */
	private Map<Integer, Person> database = new HashMap<>();

	/**
	 * Método para dar de alta a personas.
	 */
	@Override
	public void addNewPerson(String typePerson, int dni, String name, String school, String modality, String rank, String project) {
		
		LOG.info(LOG_START);

		// Si el tipo es Estudiante y la modalidad es correcta, añade una persona de tipo estudiante.
		if (typePerson.equalsIgnoreCase("Estudiante") && validateModality(modality)) {

			Person s = new Student(dni, name, school, modality);

			database.put(dni, s);
			
			LOG.info("El estudiante {}, con dni {}, ha sido dado de alta.", s.getName(), s.getDni());

			// Si el tipo es Empleado, añade una persona de tipo empleado.
		} else if (typePerson.equalsIgnoreCase("Empleado")) {

			Person e = new Employee(dni, name, rank, project);

			database.put(dni, e);
			
			LOG.info("El empleado {}, con dni {}, ha sido dado de alta.", e.getName(), e.getDni());

		} else {
			
			LOG.error("Se ha introducido algún dato incorrecto.");
		}
		
		LOG.info(LOG_END);
	}

	/**
	 * Método para mostrar todas las personas del sistema.
	 */
	@Override
	public void printAllPersons() {

		// Muestra si el mapa está vacío.
		if (database.isEmpty()) {

			System.out.println("\nActualmente no hay registros en la base de datos.\n");

			// Recorre el mapa y muestra a todas las personas de la base de datos.
		} else {

			Iterator<Integer> iter = database.keySet().iterator();

			while (iter.hasNext()) {

				Integer key = iter.next();

				System.out.println(database.get(key).showDetails());
			}
		}
	}

	/**
	 * Método para mostrar el número total de personas.
	 */
	public void printPersonTotalNum() {

		System.out.println("\nEn total hay " + database.size() + " personas registradas.\n");
	}

	/**
	 * Método para dar de baja a personas.
	 * 
	 * @param dni
	 */
	public void deletePerson(int dni) {

		 LOG.info(LOG_START);

		// Comprueba si el dni está en el mapa y borra a la persona.
		if (database.containsKey(dni)) {

			database.remove(dni);

			 LOG.info("La persona con dni {} ha sido dada de baja.", dni);

		} else {

			 LOG.warn("No hay ninguna persona con dni {}.", dni);
		}

		 LOG.info(LOG_END);
	}

	/**
	 * Método para buscar a una persona por su dni.
	 * 
	 * @param dni
	 */
	public void searchPerson(int dni) {

		// Comprueba si el dni está en el mapa e imprime la información de la persona.
		if (database.containsKey(dni)) {

			System.out.println("El dni " + dni + " corresponde a " + database.get(dni).showDetails());

		} else {

			System.out.println("No hay ninguna persona con el dni " + dni);
		}
	}

	/**
	 * Método para validad la modalidad.
	 * 
	 * @param modality
	 * @return
	 */
	public boolean validateModality(String modality) {
		
		boolean estado = false;

		// Comprueba que la modalidad sólo pueda ser DAW o DAM
		if (modality.equalsIgnoreCase("DAW") || modality.equalsIgnoreCase("DAM")) {
			estado = true;

		} else {
			estado = false;
		}
		
		return estado;
	}
}
