package ej06;

public class Oficial extends Operario {
	private String trabajo;
	private String dirije;

	public Oficial(String nombre, String trabajo, String dirije) {
		super(nombre);
		this.trabajo = trabajo;
		this.dirije = dirije;
	}

	public String getTrabajo() {
		return trabajo;
	}

	public void setTrabajo(String trabajo) {
		this.trabajo = trabajo;
	}

	public String getDirije() {
		return dirije;
	}

	public void setDirije(String dirije) {
		this.dirije = dirije;
	}

	@Override
	public String toString() {
		return super.toString() + this.getNombre() + ", Oficial: " + trabajo + ", dirije: " + dirije;
	}

}
