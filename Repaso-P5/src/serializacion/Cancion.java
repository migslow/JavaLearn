package serializacion;

import java.io.Serializable;

public class Cancion implements Serializable {
	private int id;
	private String titulo;
	private String genero;
	private String artista;
	private int duracion;

	public Cancion(int id, String titulo, String genero, String artista, int duracion) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.genero = genero;
		this.artista = artista;
		this.duracion = duracion;
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return "Cancion [id=" + id + ", titulo=" + titulo + ", genero=" + genero + ", artista=" + artista
				+ ", duracion=" + duracion + "]";
	}

}
