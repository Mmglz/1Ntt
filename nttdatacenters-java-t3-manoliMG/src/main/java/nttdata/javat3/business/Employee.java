package nttdata.javat3.business;

/**
 * Clase Empleado que hereda de la clase Person.
 * 
 * @author manoli
 *
 */
public class Employee extends Person {

	/** Categoría del empleado */
	private String rank;

	/** Proyecto al que pertenece el empleado */
	private String project;

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param dni
	 * @param name
	 * @param rank
	 * @param project
	 */
	public Employee(int dni, String name, String rank, String project) {
		super(dni, name);
		this.rank = rank;
		this.project = project;
	}

	/**
	 * @return the rank
	 */
	public String getRank() {
		return rank;
	}

	/**
	 * @param rank the rank to set
	 */
	public void setRank(String rank) {
		this.rank = rank;
	}

	/**
	 * @return the project
	 */
	public String getProject() {
		return project;
	}

	/**
	 * @param project the project to set
	 */
	public void setProject(String project) {
		this.project = project;
	}

	/**
	 * Método que muestra todos los atributos.
	 */
	@Override
	public String showDetails() {
		return "[Empleado] Dni " + dni + ". Nombre: " + name + ". Categoria: " + rank + ". Proyecto: " + project;
	}

	@Override
	public int hashCode() {
		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		return super.equals(obj);
	}
}
