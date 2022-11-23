package _01objetos;

public class Libro {
	private String isbn;
	private String titulo;
	private String autor;
	private int numeroPaginas;
	private boolean prestado;

	public Libro() {
		prestado = false;
	}

	public Libro(String isbn) {
		super();
		this.isbn = isbn;
	}

	public Libro(String isbn, String titulo, String autor, int numeroPaginas) {
		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
		this.numeroPaginas = numeroPaginas;
		this.prestado = false;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
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

	public int getNumeroPaginas() {
		return numeroPaginas;
	}

	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}

	public boolean isPrestado() {
		return prestado;
	}

	public void setPrestado(boolean prestado) {
		this.prestado = prestado;
	}
	
	public void prestar() {
		if(prestado == true) {
			System.out.println("No se puede prestar. Todavia no ha sido devuelto");
		} else {
			prestado = true;
		}
	}
	
	public void devolverprestamo() {
		this.prestado = false;
	}

	@Override
	public String toString() {
		return "Libro [isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas
				+ ", prestado=" + prestado + "]";
	}

}
