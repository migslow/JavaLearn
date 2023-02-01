package ej07;

public class Coche extends Vehiculo {

	private int potencia;

	public Coche(int potencia, String color) {
		super(4, color, 6);
		this.potencia = potencia;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	@Override
	public String toString() {
		return "Coche potencia=" + potencia + ", " + this.getColor();
	}

}
