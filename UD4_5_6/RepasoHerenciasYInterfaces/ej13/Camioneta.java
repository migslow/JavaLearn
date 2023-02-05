package ej13;

public class Camioneta extends Automovil {
	private double tamanyoCajaCarga;
	private boolean traccionTodoTerreno;

	public Camioneta(String marca, String modelo, int anyo, int velocidadActual, int puertas, int asientos,
			double tamanyoCajaCarga, boolean traccionTodoTerreno) {
		super(marca, modelo, anyo, velocidadActual, puertas, asientos);
		this.tamanyoCajaCarga = tamanyoCajaCarga;
		this.traccionTodoTerreno = traccionTodoTerreno;
	}

	public double getTamanyoCajaCarga() {
		return tamanyoCajaCarga;
	}

	public void setTamanyoCajaCarga(double tamanyoCajaCarga) {
		this.tamanyoCajaCarga = tamanyoCajaCarga;
	}

	public boolean isTraccionTodoTerreno() {
		return traccionTodoTerreno;
	}

	public void setTraccionTodoTerreno(boolean traccionTodoTerreno) {
		this.traccionTodoTerreno = traccionTodoTerreno;
	}

	@Override
	public String toString() {
		return super.toString() + "Camioneta [tamanyoCajaCarga=" + tamanyoCajaCarga + ", traccionTodoTerreno="
				+ traccionTodoTerreno + "]";
	}

}
