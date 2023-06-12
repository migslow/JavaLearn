package Comparable;

public class Persona implements Comparable<Persona> {
	private String nombre;
	private int edad;

	public Persona(String nombre, int edad) {
		this.nombre = nombre;
		this.edad = edad;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}

	@Override
	public int compareTo(Persona o) {
		return this.nombre.compareToIgnoreCase(o.getNombre());
	}

}
