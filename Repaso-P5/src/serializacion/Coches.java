package serializacion;

import java.io.Serializable;

public class Coches implements Serializable {
	private int numeroID;
	private String matricula;
	private String modelo;
	private String marca;
	private int cv;

	public Coches(int numeroID, String matricula, String modelo, String marca, int cv) {
		super();
		this.numeroID = numeroID;
		this.matricula = matricula;
		this.modelo = modelo;
		this.marca = marca;
		this.cv = cv;
	}

	public int getNumeroID() {
		return numeroID;
	}

	public void setNumeroID(int numeroID) {
		this.numeroID = numeroID;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Coches [numeroID=" + numeroID + ", matricula=" + matricula + ", modelo=" + modelo + ", marca=" + marca
				+ ", cv=" + cv + "]";
	}
}
