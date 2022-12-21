package _01arraylist;
// Cuenta.java

public class Cuenta {
	private long numero;
	private String nombre;
	private double saldo;

	public Cuenta(long num, String prop, double saldo) {
		numero = num;
		nombre = prop;
		this.saldo = saldo;
	}

	public long getNumero() {
		return numero;
	}

	public String getNombre() {
		return nombre;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setNumero(long n) {
		numero = n;
	}

	public void setNombre(String nom) {
		nombre = nom;
	}

	public void setSaldo(double s) {
		saldo = s;
	}

	void imprimeCuenta() {
		System.out.println(numero + " " + nombre + " " + saldo);
	}

	@Override
	public String toString() {
		return "Cuenta [numero=" + numero + ", nombre=" + nombre + ", saldo=" + saldo + "]";
	}

}
