package herencia;

public class Revista extends Biblioteca {
	private int numero;

	public Revista(String codigo, String titulo, int anyo, int numero) {
		super(codigo, titulo, anyo);
		this.numero = 0;
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
