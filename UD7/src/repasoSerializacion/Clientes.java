package repasoSerializacion;

import java.io.Serializable;

public class Clientes implements Serializable {
	private String nombreCompleto;
	private String telefono;
	private String direccion;
	private String nif;
	private boolean moroso;

	public Clientes(String nombreCompleto, String telefono, String direccion, String nif, boolean moroso) {
		super();
		this.nombreCompleto = nombreCompleto;
		this.telefono = telefono;
		this.direccion = direccion;
		this.nif = nif;
		this.moroso = moroso;
	}

	public String getNombreCompleto() {
		return nombreCompleto;
	}

	public void setNombreCompleto(String nombreCompleto) {
		this.nombreCompleto = nombreCompleto;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getNif() {
		return nif;
	}

	public void setNif(String nif) {
		this.nif = nif;
	}

	public boolean isMoroso() {
		return moroso;
	}

	public void setMoroso(boolean moroso) {
		this.moroso = moroso;
	}

	@Override
	public String toString() {
		return "Clientes [nombreCompleto=" + nombreCompleto + ", telefono=" + telefono + ", direccion=" + direccion
				+ ", nif=" + nif + ", moroso=" + moroso + "]";
	}

}
