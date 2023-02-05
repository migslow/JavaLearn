package ej13;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anyo;
	private int velocidadActual;

	public Vehiculo(String marca, String modelo, int anyo, int velocidadActual) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.velocidadActual = velocidadActual;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	public int getVelocidadActual() {
		return velocidadActual;
	}

	public void setVelocidadActual(int velocidadActual) {
		this.velocidadActual = velocidadActual;
	}

	@Override
	public String toString() {
		return "Vehiculo [marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", velocidadActual="
				+ velocidadActual + "]";
	}

	public int acelerar() {
		velocidadActual = velocidadActual + 10;
		return velocidadActual;
	}

	public int frenar() {
		velocidadActual = velocidadActual - 10;
		return velocidadActual;
	}

}
