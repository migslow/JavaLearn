package ej03;

public class Cuenta {

	private long numero;
	private String nombre;
	private double saldo;

	public Cuenta(long numero, String nombre, double saldo) {
		super();
		this.numero = numero;
		this.nombre = nombre;
		this.saldo = saldo;
	}

	public long getNumero() {
		return numero;
	}

	public void setNumero(long numero) {
		this.numero = numero;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

}
