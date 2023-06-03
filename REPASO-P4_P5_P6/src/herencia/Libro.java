package herencia;

public class Libro extends Biblioteca implements Prestable {
	private boolean prestado;

	public Libro(String codigo, String titulo, int anyo, boolean prestado) {
		super(codigo, titulo, anyo);
		this.prestado = false;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [prestado=" + prestado + "]";
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
