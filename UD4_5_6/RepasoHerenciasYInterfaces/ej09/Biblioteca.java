package ej09;

public class Biblioteca {
	private String codigo;
	private String titulo;
	private int anyoPublicacion;

	public Biblioteca(String codigo, String titulo, int anyoPublicacion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.anyoPublicacion = anyoPublicacion;
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

	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}

	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}

	@Override
	public String toString() {
		return "Biblioteca [codigo=" + codigo + ", titulo=" + titulo + ", anyoPublicacion=" + anyoPublicacion + "]";
	}

}
