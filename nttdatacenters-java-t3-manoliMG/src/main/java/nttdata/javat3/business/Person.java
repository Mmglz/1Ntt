package nttdata.javat3.business;

import java.util.Objects;

/**
 * Clase abstracta de la que heredan métodos las clases Student y Employee.
 * 
 * @author manoli
 *
 */
public abstract class Person {

	/** Dni de las personas */
	protected int dni;

	/** Nombre de las personas */
	protected String name;

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param dni
	 * @param name
	 */
	protected Person(int dni, String name) {
		super();
		this.dni = dni;
		this.name = name;
	}

	/**
	 * @return the dni
	 */
	protected int getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	protected void setDni(int dni) {
		this.dni = dni;
	}

	/**
	 * @return the name
	 */
	protected String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	protected void setName(String name) {
		this.name = name;
	}

	/**
	 * Método que muestra todos los atributos.
	 * 
	 */
	protected abstract String showDetails();

	@Override
	public int hashCode() {
		return Objects.hash(dni);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		return dni == other.dni;
	}
}
