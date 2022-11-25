package ejerciciosPaqueteColecciones_I;

public class Cancion {
	private String titulo;
	private String autor;

	public Cancion(String titulo, String autor) {
		super();
		this.titulo = titulo;
		this.autor = autor;
	}

	public Cancion() {
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public void dameTitulo() {
		System.out.println(this.titulo);
	}

	public void dameAutor() {
		System.out.println(this.autor);
	}

	public void ponTitulo(String titulo) {
		this.titulo = titulo;
	}

	public void ponAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + autor + "]";
	}

}
