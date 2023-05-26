package serializacion;

import java.io.Serializable;

public class Ciudad implements Serializable{
	private int id;
	private String pais;
	private String nombre;
	private int poblacion;

	public Ciudad(int id, String pais, String nombre, int poblacion) {
		super();
		this.id = id;
		this.pais = pais;
		this.nombre = nombre;
		this.poblacion = poblacion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPoblacion() {
		return poblacion;
	}

	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}

	@Override
	public String toString() {
		return "Ciudad [id=" + id + ", pais=" + pais + ", nombre=" + nombre + ", poblacion=" + poblacion + "]";
	}

}
