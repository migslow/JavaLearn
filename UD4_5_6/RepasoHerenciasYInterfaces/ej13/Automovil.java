package ej13;

public class Automovil extends Vehiculo {
	private int puertas;
	private int asientos;

	public Automovil(String marca, String modelo, int anyo, int velocidadActual, int puertas, int asientos) {
		super(marca, modelo, anyo, velocidadActual);
		this.puertas = puertas;
		this.asientos = asientos;
	}

	public int getPuertas() {
		return puertas;
	}

	public void setPuertas(int puertas) {
		this.puertas = puertas;
	}

	public int getAsientos() {
		return asientos;
	}

	public void setAsientos(int asientos) {
		this.asientos = asientos;
	}

	@Override
	public String toString() {
		return super.toString() + "Automovil [puertas=" + puertas + ", asientos=" + asientos + "]";
	}

}
