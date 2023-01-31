package ej01;

public class Libro extends Producto {

	private String autor;
	private String isbn;

	public Libro(String nombre, double precio, int stock, String autor, String isbn) {
		super(nombre, precio, stock);
		this.autor = autor;
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	@Override
	public String toString() {
		return super.toString() + "Libro [autor=" + autor + ", isbn=" + isbn + "]";
	}

}
