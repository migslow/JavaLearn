package proyecto2;

public class Biblioteca {

	private int codigo;
	private String titulo;
	private int añoPublicacion;

	public Biblioteca(int codigo, String titulo, int añoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.añoPublicacion = añoPublicacion;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getAñoPublicacion() {
		return añoPublicacion;
	}

	public void setAñoPublicacion(int añoPublicacion) {
		this.añoPublicacion = añoPublicacion;
	}

	@Override
	public String toString() {
		return codigo + ", " + titulo + ", " + añoPublicacion;
	}

}
