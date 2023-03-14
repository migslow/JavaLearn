package ejercicios;

import java.io.Serializable;

public class Departamento implements Serializable {
	private int numDepartamento;
	private String nombre;
	private String localidad;

	public Departamento() {
		super();
	}

	public Departamento(int numDepartamento, String nombre, String localidad) {
		super();
		this.numDepartamento = numDepartamento;
		this.nombre = nombre;
		this.localidad = localidad;
	}

	public int getNumDepartamento() {
		return numDepartamento;
	}

	public void setNumDepartamento(int numDepartamento) {
		this.numDepartamento = numDepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	@Override
	public String toString() {
		return "Departamento [numDepartamento=" + numDepartamento + ", nombre=" + nombre + ", localidad=" + localidad
				+ "]";
	}

}
