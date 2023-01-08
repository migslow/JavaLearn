package FullRepaso;

import java.util.Objects;

public class Vehiculo {
	private String Fabricante;
	private String Nombre;
	private String Color;
	private int kilometros;
	private int velocidadMaxima;
	private int numPuertas;
	private int numRuedas;
	private int caballosPotencia;

	public Vehiculo(String fabricante, String nombre, String color, int kilometros, int velocidadMaxima, int numPuertas,
			int numRuedas, int caballosPotencia) {
		super();
		Fabricante = fabricante;
		Nombre = nombre;
		Color = color;
		this.kilometros = kilometros;
		this.velocidadMaxima = velocidadMaxima;
		this.numPuertas = numPuertas;
		this.numRuedas = numRuedas;
		this.caballosPotencia = caballosPotencia;
	}

	public String getFabricante() {
		return Fabricante;
	}

	public void setFabricante(String fabricante) {
		Fabricante = fabricante;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getKilometros() {
		return kilometros;
	}

	public void setKilometros(int kilometros) {
		this.kilometros = kilometros;
	}

	public int getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(int velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}

	public int getNumPuertas() {
		return numPuertas;
	}

	public void setNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	public int getCaballosPotencia() {
		return caballosPotencia;
	}

	public void setCaballosPotencia(int caballosPotencia) {
		this.caballosPotencia = caballosPotencia;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Color, Fabricante, Nombre, caballosPotencia, kilometros, numPuertas, numRuedas,
				velocidadMaxima);
	}

	@Override
	public boolean equals(Object obj) {
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(Color, other.Color) && Objects.equals(Fabricante, other.Fabricante)
				&& Objects.equals(Nombre, other.Nombre) && caballosPotencia == other.caballosPotencia
				&& kilometros == other.kilometros && numPuertas == other.numPuertas && numRuedas == other.numRuedas
				&& velocidadMaxima == other.velocidadMaxima;
	}

	@Override
	public String toString() {
		return Fabricante + ", " + Nombre + ", " + Color + ", " + kilometros + ", " + velocidadMaxima + ", "
				+ numPuertas + ", " + numRuedas + ", " + caballosPotencia;
	}

}
