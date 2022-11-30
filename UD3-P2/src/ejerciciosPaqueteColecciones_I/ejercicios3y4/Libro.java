package ejerciciosPaqueteColecciones_I.ejercicios3y4;

public class Libro {

	private String titulo;
	private int edicion;
	private Persona autor;
	private String isbn;
	private String editorial;
	private String lugar;
	private Fecha fecha;
	private int paginas;

	public Libro(String titulo, int edicion, Persona autor, String isbn, String editorial, String lugar, Fecha fecha,
			int paginas) {
		super();
		this.titulo = titulo;
		this.edicion = edicion;
		this.autor = autor;
		this.isbn = isbn;
		this.editorial = editorial;
		this.lugar = lugar;
		this.fecha = fecha;
		this.paginas = paginas;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edicion) {
		this.edicion = edicion;
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

	public Fecha getFecha() {
		return fecha;
	}

	public void setFecha(Fecha fecha) {
		this.fecha = fecha;
	}

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return ("Titulo : " + titulo + "\n" + edicion + "a. edicion\n" + "Autor : " + autor + "ISBN  : " + isbn + "\n"
				+ editorial + ", " + lugar + ", " + fecha + "\n" + paginas + " paginas");
	}

}
