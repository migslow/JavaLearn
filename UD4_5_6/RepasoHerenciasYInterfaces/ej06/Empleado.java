package ej06;

public class Empleado extends Construccion {

	private String nombre;

	public Empleado(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return super.toString() + ", Empleado: " + nombre;
	}

}
