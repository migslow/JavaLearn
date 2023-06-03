
public class Libro implements Comparable<Libro> {
	private int id;
	private String titulo;
	private String autor;
	private int paginas;

	public Libro(int id, String titulo, String autor, int paginas) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.autor = autor;
		this.paginas = paginas;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public int getPaginas() {
		return paginas;
	}

	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
	}

	@Override
	public int compareTo(Libro o) {
		return titulo.compareToIgnoreCase(titulo);
	}

}
