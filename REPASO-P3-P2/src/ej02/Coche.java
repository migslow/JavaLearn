package ej02;

public class Coche {
	private int id;
	private String marca;
	private String modelo;
	private int anyo;
	private double precio;

	public Coche(int id, String marca, String modelo, int anyo, double precio) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.anyo = anyo;
		this.precio = precio;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Coche [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", anyo=" + anyo + ", precio=" + precio
				+ "]";
	}

}
