package ejerciciosPaquetesColecciones_III.ejercicio3_4_5;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
	private String titulo;
	private Persona autor;
	private String isbn;
	private int paginas;
	private int edicion;
	private String editorial;
	private String lugar;
	private Fecha fechaEdicion;

	public Libro() {
		titulo = new String("");
		autor = new Persona();
		isbn = new String("");
		paginas = 0;
		edicion = 0;
		editorial = new String("");
		lugar = new String("");
		fechaEdicion = new Fecha();
	}

	public Libro(String t, Persona p, String i, int pa, int e, String ed, String l, Fecha f) {
		titulo = t;
		autor = p;
		isbn = i;
		paginas = pa;
		edicion = e;
		editorial = ed;
		lugar = l;
		fechaEdicion = f;
	}

	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		return Objects.equals(autor, other.autor) && edicion == other.edicion
				&& Objects.equals(editorial, other.editorial) && Objects.equals(fechaEdicion, other.fechaEdicion)
				&& Objects.equals(isbn, other.isbn) && Objects.equals(lugar, other.lugar) && paginas == other.paginas
				&& Objects.equals(titulo, other.titulo);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Persona getAutor() {
		return autor;
	}

	public void setAutor(Persona autor) {
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Fecha getFechaEdicion() {
		return fechaEdicion;
	}

	public void setFechaEdicion(Fecha fechaEdicion) {
		this.fechaEdicion = fechaEdicion;
	}

	public String toString() {
		return ("Titulo :" + titulo + "\n" + edicion + "a. edicion\n" + "Autor : " + autor + "ISBN  : " + isbn + "\n"
				+ editorial + ", " + lugar + ", " + fechaEdicion + "\n" + paginas + " paginas");
	}

	public void mostrarDatos() {
		System.out.println(titulo + " - " + paginas + " paginas");
	}

	// Comparando por editorial
	@Override
	public int compareTo(Libro o) {
		return editorial.compareToIgnoreCase(editorial);
	}

}
