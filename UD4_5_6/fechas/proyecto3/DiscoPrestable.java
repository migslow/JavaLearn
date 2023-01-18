package proyecto3;

public class DiscoPrestable extends Disco implements Prestable{
	
	private boolean prestado;

	public DiscoPrestable(String titulo, String autor, String formato, double duracion, String genero, boolean prestado) {
		super(titulo, autor, formato, duracion, genero);
		this.prestado = false;
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

	@Override
	public String toString() {
		return super.toString() + prestado;
	}
	
	

}
