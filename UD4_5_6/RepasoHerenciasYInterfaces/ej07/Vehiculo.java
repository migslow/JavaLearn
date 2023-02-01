package ej07;

public class Vehiculo {
	private int numeroRuedas;
	private String color;
	private int numeroPasajeros;

	public Vehiculo(int numeroRuedas, String color, int numeroPasajeros) {
		super();
		this.numeroRuedas = numeroRuedas;
		this.color = color;
		this.numeroPasajeros = numeroPasajeros;
	}

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getNumeroPasajeros() {
		return numeroPasajeros;
	}

	public void setNumeroPasajeros(int numeroPasajeros) {
		this.numeroPasajeros = numeroPasajeros;
	}

	@Override
	public String toString() {
		return "Vehiculo [numeroRuedas=" + numeroRuedas + ", color=" + color + ", numeroPasajeros=" + numeroPasajeros
				+ "]";
	}

}
