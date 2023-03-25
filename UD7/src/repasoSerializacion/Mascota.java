package repasoSerializacion;

import java.io.Serializable;

public class Mascota implements Serializable {
	private String nombre;
	private int edad;
	private String especie;

	public Mascota(String nombre, int edad, String especie) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.especie = especie;
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

	public String getEspecie() {
		return especie;
	}

	public void setEspecie(String especie) {
		this.especie = especie;
	}

	@Override
	public String toString() {
		return "Mascota [nombre=" + nombre + ", edad=" + edad + ", especie=" + especie + "]";
	}

}
