package Examen_5_Recuperacion;

public class Libro {

	private String autor;
	private String titulo;
	private String editorial;

	//
	public Libro() {

	}
	//
	//

	public Libro(String autor, String titulo, String editorial) {
		this.autor = autor;
		this.titulo = titulo;
		this.editorial = editorial;

	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	@Override
	public String toString() {
		return "Libro [autor=" + autor + ", titulo=" + titulo + ", editorial=" + editorial + "]";
	}

}
