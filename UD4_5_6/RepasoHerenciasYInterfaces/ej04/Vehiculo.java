package ej04;

public class Vehiculo {
	private String marca;
	private String modelo;
	private int anyo;
	private int numeroRuedas;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String marca, String modelo, int numeroRuedas) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.numeroRuedas = numeroRuedas;
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

	public int getNumeroRuedas() {
		return numeroRuedas;
	}

	public void setNumeroRuedas(int numeroRuedas) {
		this.numeroRuedas = numeroRuedas;
	}

	@Override
	public String toString() {
		return marca + ", " + modelo + ", " + anyo + ", " + numeroRuedas;
	}

}
