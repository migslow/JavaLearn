package proyecto2;

public class Libro extends Biblioteca implements Prestable {

	private boolean prestado;

	public Libro(int codigo, String titulo, int añoPublicacion) {
		super(codigo, titulo, añoPublicacion);
		this.prestado = false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
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
		return super.toString() + ", " + prestado;
	}

	@Override
	public void prestar() {
		prestado = true;

	}

	@Override
	public void devolver() {
		prestado = false;

	}

	@Override
	public boolean prestado() {
		return prestado;
	}

}
