package ej01;

public class Discos extends Producto {

	private String artista;
	private double duracion;

	public Discos(String nombre, double precio, int stock, String artista, double duracion) {
		super(nombre, precio, stock);
		this.artista = artista;
		this.duracion = duracion;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return super.toString() + "Discos [artista=" + artista + ", duracion=" + duracion + "]";
	}

}
