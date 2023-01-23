package ej22;

import java.util.Objects;

public class Libro implements Comparable<Libro>{
	private String titulo;
	private String autor;
	private int anyoPublicacion;
	public Libro(String titulo, String autor, int anyoPublicacion) {
		super();
		this.titulo = titulo;
		this.autor = autor;
		this.anyoPublicacion = anyoPublicacion;
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
	public int getAnyoPublicacion() {
		return anyoPublicacion;
	}
	public void setAnyoPublicacion(int anyoPublicacion) {
		this.anyoPublicacion = anyoPublicacion;
	}
	@Override
	public String toString() {
		return titulo + " - " + autor + " - " + anyoPublicacion;
	}
	@Override
	public int hashCode() {
		return Objects.hash(anyoPublicacion, autor, titulo);
	}
	@Override
	public boolean equals(Object obj) {
		Libro other = (Libro) obj;
		return anyoPublicacion == other.anyoPublicacion && Objects.equals(autor, other.autor)
				&& Objects.equals(titulo, other.titulo);
	}
	@Override
	public int compareTo(Libro o) {
		return titulo.compareToIgnoreCase(o.getTitulo());
	}
	
	

}
