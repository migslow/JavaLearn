package ej02;

public class Vehiculo {
	private int Id;
	private String marca;
	private String modelo;
	private String propietario;
	private int cv;
	private int kilometrosRecorridos;

	public Vehiculo() {
		super();
	}

	public Vehiculo(int id, String marca, String modelo, String propietario, int cv, int kilometrosRecorridos) {
		super();
		Id = id;
		this.marca = marca;
		this.modelo = modelo;
		this.propietario = propietario;
		this.cv = cv;
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
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

	public String getPropietario() {
		return propietario;
	}

	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public int getCv() {
		return cv;
	}

	public void setCv(int cv) {
		this.cv = cv;
	}

	public int getKilometrosRecorridos() {
		return kilometrosRecorridos;
	}

	public void setKilometrosRecorridos(int kilometrosRecorridos) {
		this.kilometrosRecorridos = kilometrosRecorridos;
	}

	@Override
	public String toString() {
		return "Vehiculo [Id=" + Id + ", marca=" + marca + ", modelo=" + modelo + ", propietario=" + propietario
				+ ", cv=" + cv + ", kilometrosRecorridos=" + kilometrosRecorridos + "]";
	}

}
