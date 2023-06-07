package ej04;

public class Edificio implements Comparable<Edificio> {
	private int id;
	private String direccion;
	private int numeroPisos;
	private boolean tieneAncensor;

	public Edificio(int id, String direccion, int numeroPisos, boolean tieneAncensor) {
		super();
		this.id = id;
		this.direccion = direccion;
		this.numeroPisos = numeroPisos;
		this.tieneAncensor = tieneAncensor;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getNumeroPisos() {
		return numeroPisos;
	}

	public void setNumeroPisos(int numeroPisos) {
		this.numeroPisos = numeroPisos;
	}

	public boolean isTieneAncensor() {
		return tieneAncensor;
	}

	public void setTieneAncensor(boolean tieneAncensor) {
		this.tieneAncensor = tieneAncensor;
	}

	@Override
	public String toString() {
		return "Edificio [id=" + id + ", direccion=" + direccion + ", numeroPisos=" + numeroPisos + ", tieneAncensor="
				+ tieneAncensor + "]";
	}

	@Override
	public int compareTo(Edificio o) {
		return direccion.compareToIgnoreCase(o.getDireccion());
		// return this.getDireccion().compareToIgnoreCase(o.getDireccion());
	}

}
