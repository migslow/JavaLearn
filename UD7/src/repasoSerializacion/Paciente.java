package repasoSerializacion;

import java.io.Serializable;

public class Paciente implements Serializable {
	private int IDSeguridadSocial;
	private String nombre;
	private int edad;
	private String direccion;
	private String sintamas;

	public Paciente(int iDSeguridadSocial, String nombre, int edad, String direccion, String sintamas) {
		super();
		IDSeguridadSocial = iDSeguridadSocial;
		this.nombre = nombre;
		this.edad = edad;
		this.direccion = direccion;
		this.sintamas = sintamas;
	}

	public int getIDSeguridadSocial() {
		return IDSeguridadSocial;
	}

	public void setIDSeguridadSocial(int iDSeguridadSocial) {
		IDSeguridadSocial = iDSeguridadSocial;
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

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getSintamas() {
		return sintamas;
	}

	public void setSintamas(String sintamas) {
		this.sintamas = sintamas;
	}

	@Override
	public String toString() {
		return "Paciente [IDSeguridadSocial=" + IDSeguridadSocial + ", nombre=" + nombre + ", edad=" + edad
				+ ", direccion=" + direccion + ", sintamas=" + sintamas + "]";
	}

}
