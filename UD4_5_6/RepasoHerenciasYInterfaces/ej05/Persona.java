package ej05;

public class Persona {
	private String nombre;
	private String apellido;
	private int edad;
	private String nacionalidad;

	public Persona(int edad, String nacionalidad) {
		super();
		this.edad = edad;
		this.nacionalidad = nacionalidad;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getNacionalidad() {
		return nacionalidad;
	}

	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellido() {
		return apellido;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", edad=" + edad + ", nacionalidad="
				+ nacionalidad + "]";
	}

}
