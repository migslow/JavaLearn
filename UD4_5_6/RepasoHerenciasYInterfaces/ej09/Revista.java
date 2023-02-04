package ej09;

public class Revista extends Biblioteca {
	private int numero;

	public Revista(String codigo, String titulo, int anyoPublicacion, int numero) {
		super(codigo, titulo, anyoPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return super.toString() + "Revista [numero=" + numero + "]";
	}

}
