package ej05;

public class Ordenador implements Comparable<Ordenador>{
	private int id;
	private String marca;
	private String modelo;
	private int ram;
	private int almacenamiento;

	public Ordenador() {
		super();
	}

	public Ordenador(int id, String marca, String modelo, int ram, int almacenamiento) {
		super();
		this.id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.ram = ram;
		this.almacenamiento = almacenamiento;
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

	public int getRam() {
		return ram;
	}

	public void setRam(int ram) {
		this.ram = ram;
	}

	public int getAlmacenamiento() {
		return almacenamiento;
	}

	public void setAlmacenamiento(int almacenamiento) {
		this.almacenamiento = almacenamiento;
	}

	@Override
	public String toString() {
		return "Ordenador [id=" + id + ", marca=" + marca + ", modelo=" + modelo + ", ram=" + ram + ", almacenamiento="
				+ almacenamiento + "]";
	}
	/*
	@Override
	public int compareTo(Ordenador o) {
		return marca.compareToIgnoreCase(o.getMarca());
	}
	*/

	@Override
	public int compareTo(Ordenador o) {
		return marca.compareToIgnoreCase(o.getMarca());
	}

}
