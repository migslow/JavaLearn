package ej02;

import java.util.Objects;

public class Cuenta implements Comparable<Cuenta>{

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
	
	

	@Override
	public int hashCode() {
		return Objects.hash(nombre, numero, saldo);
	}

	@Override
	public boolean equals(Object obj) {
		Cuenta other = (Cuenta) obj;
		return Objects.equals(nombre, other.nombre) && numero == other.numero
				&& Double.doubleToLongBits(saldo) == Double.doubleToLongBits(other.saldo);
	}

	@Override
	public int compareTo(Cuenta o) {
		return (int) (numero - o.getNumero());
	}

}
