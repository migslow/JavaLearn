package apren;

public class Vehiculo {
	private String modelo;
	private boolean peso;

	public Vehiculo() {

	}

	public Vehiculo(String modelo) {
		this.modelo = modelo;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public boolean isPeso() {
		return peso;
	}

	public void setPeso(boolean peso) {
		this.peso = peso;
	}

	public void conducir() {
		System.out.println("Estoy conduciendo");
	}

	@Override
	public String toString() {
		return "vehiculo [modelo=" + modelo + ", peso=" + peso + "]";
	}
}
