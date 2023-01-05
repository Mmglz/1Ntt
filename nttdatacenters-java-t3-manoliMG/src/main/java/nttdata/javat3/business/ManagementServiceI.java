package nttdata.javat3.business;

/**
 * Interfaz implementada por la clase ManagementServiceImpl.
 * 
 * @author manoli
 *
 */
public interface ManagementServiceI {
	
	/**
	 * Método para dar de alta a personas.
	 * 
	 * @param typePerson
	 * @param dni
	 * @param name
	 * @param school
	 * @param modality
	 * @param rank
	 * @param project
	 */
	public void addNewPerson(String typePerson, int dni, String name, String school, String modality, String rank, String project);
	
	/**
	 * Método para mostrar todas las personas del sistema.
	 */
	public void printAllPersons();
}
