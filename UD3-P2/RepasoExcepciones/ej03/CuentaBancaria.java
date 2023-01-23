package ej03;

public class CuentaBancaria {
	private String nombre;
	private int saldo;

	public CuentaBancaria(String nombre, int saldo) {
		super();
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return nombre + ", " + saldo;
	}

}
