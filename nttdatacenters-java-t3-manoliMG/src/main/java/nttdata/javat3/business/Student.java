package nttdata.javat3.business;

/**
 * Clase Estudiante que hereda de la clase Person.
 * 
 * @author manoli
 *
 */
public class Student extends Person {

	/** Nombre del instituto del estudiante */
	private String school;

	/** Modalidad que cursa el estudiante */
	private String modality;

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param dni
	 * @param name
	 * @param school
	 * @param modality
	 */
	public Student(int dni, String name, String school, String modality) {
		super(dni, name);
		this.school = school;
		this.modality = modality;
	}

	/**
	 * @return the school
	 */
	public String getSchool() {
		return school;
	}

	/**
	 * @param school the school to set
	 */
	public void setSchool(String school) {
		this.school = school;
	}

	/**
	 * @return the modality
	 */
	public String getModality() {
		return modality;
	}

	/**
	 * @param modality the modality to set
	 */
	public void setModality(String modality) {
		this.modality = modality;
	}

	/**
	 * Método que muestra todos los atributos.
	 */
	@Override
	public String showDetails() {
		return "[Estudiante] Dni " + dni + ". Nombre: " + name + ". Instituto: " + school + ". Modalidad: " + modality;
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
