package proyecto2;

public class Revista extends Biblioteca {

	private int numero;

	public Revista(int codigo, String titulo, int añoPublicacion, int numero) {
		super(codigo, titulo, añoPublicacion);
		this.numero = numero;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	@Override
	public int getCodigo() {
		return super.getCodigo();
	}

	@Override
	public int getAñoPublicacion() {
		return super.getAñoPublicacion();
	}

	@Override
	public String toString() {
		return super.toString() + ", " + numero;
	}

}
