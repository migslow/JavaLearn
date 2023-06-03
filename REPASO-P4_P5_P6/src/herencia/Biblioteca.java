package herencia;

public class Biblioteca {
	private String codigo;
	private String titulo;
	private int anyo;

	public Biblioteca(String codigo, String titulo, int anyo) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyo = anyo;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

	@Override
	public String toString() {
		return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", anyo=" + anyo + "]";
	}

}
