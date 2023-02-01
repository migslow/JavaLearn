package ej06;

public class Directivo extends Empleado {
	private String supervisaDepartamento;

	public Directivo(String nombre, String supervisaDepartamento) {
		super(nombre);
		this.supervisaDepartamento = supervisaDepartamento;
	}

	public String getSupervisaDepartamento() {
		return supervisaDepartamento;
	}

	public void setSupervisa(String supervisaDepartamento) {
		this.supervisaDepartamento = supervisaDepartamento;
	}

	@Override
	public String toString() {
		return super.toString() + ", directivo: " + supervisaDepartamento;
	}

}
