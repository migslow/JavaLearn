package ej07;

public class Bicicleta extends Vehiculo {
	private String marca;

	public Bicicleta(String color, String marca) {
		super(2, color, 1);
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	@Override
	public String toString() {
		return "Bicicleta marca=" + marca + ", " + this.getColor();
	}

}
