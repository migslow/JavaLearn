package ej04;

public class CantanteFamoso {

	private String nombre;
	private String discoConMasVentas;

	public CantanteFamoso(String nombre, String discoConMasVentas) {
		super();
		this.nombre = nombre;
		this.discoConMasVentas = discoConMasVentas;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDiscoConMasVentas() {
		return discoConMasVentas;
	}

	public void setDiscoConMasVentas(String discoConMasVentas) {
		this.discoConMasVentas = discoConMasVentas;
	}

	@Override
	public String toString() {
		return nombre + ", " + discoConMasVentas;
	}

}
