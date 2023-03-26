package repasoXStream;

import java.io.Serializable;

public class Paciente implements Serializable {
	private String nombre;
	private int edad;
	private String sintoma;

	public Paciente(String nombre, int edad, String sintoma) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sintoma = sintoma;
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

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	@Override
	public String toString() {
		return "Paciente [nombre=" + nombre + ", edad=" + edad + ", sintoma=" + sintoma + "]";
	}

}
