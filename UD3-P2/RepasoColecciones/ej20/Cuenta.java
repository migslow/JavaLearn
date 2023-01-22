package ej20;

public class Cuenta {
	private long numero;
	private int cantidad;

	public Cuenta(long numero, int cantidad) {
		super();
		this.numero = numero;
		this.cantidad = cantidad;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	@Override
	public String toString() {
		return numero + ", " + cantidad;
	}

}
