package ej03;

public class Gerente extends Empleado {

	private double bonificacion;

	public Gerente(String nombre, double salario, double bonificacion) {
		super(nombre, salario);
		this.bonificacion = bonificacion;
	}

	public double getBonificacion() {
		return bonificacion;
	}

	@Override
	public String toString() {
		return "Gerente [bonificacion=" + bonificacion + "]";
	}

}
