package serializacion;

import java.io.Serializable;

public class Libro implements Serializable {
	private int id;
	private String autor;
	private String genero;
	private int anyoPubli;

	public Libro(int id, String autor, String genero, int anyoPubli) {
		super();
		this.id = id;
		this.autor = autor;
		this.genero = genero;
		this.anyoPubli = anyoPubli;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnyoPubli() {
		return anyoPubli;
	}

	public void setAnyoPubli(int anyoPubli) {
		this.anyoPubli = anyoPubli;
	}

	@Override
	public String toString() {
		return "Libro [id=" + id + ", autor=" + autor + ", genero=" + genero + ", anyoPubli=" + anyoPubli + "]";
	}

}
