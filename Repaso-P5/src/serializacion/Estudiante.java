package serializacion;

import java.io.Serializable;

public class Estudiante implements Serializable {
	private int id;
	private String nombre;
	private int edad;
	private boolean activo;
	private double media;

	public Estudiante(int id, String nombre, int edad, boolean activo, double media) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.edad = edad;
		this.activo = activo;
		this.media = media;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public boolean isActivo() {
		return activo;
	}

	public void setActivo(boolean activo) {
		this.activo = activo;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", edad=" + edad + ", activo=" + activo + ", media="
				+ media + "]";
	}

}
