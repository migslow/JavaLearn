package serializacion01;

import java.io.Serializable;

public class Coche implements Serializable {
	private int numeroID;
	private String matricula;
	private String marca;
	private String modelo;
	private int cv;

	public Coche() {
		super();
	}

	public Coche(int numeroID, String matricula, String marca, String modelo, int cv) {
		super();
		this.numeroID = numeroID;
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
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

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	@Override
	public String toString() {
		return "Coche [numeroID=" + numeroID + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", cv=" + cv + "]";
	}

}
