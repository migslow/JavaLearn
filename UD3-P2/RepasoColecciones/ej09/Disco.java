package ej09;

import java.util.Objects;

public class Disco implements Comparable<Disco> {
	private int codigo;
	private String titulo;
	private String autor;
	private String genero;
	private String formato;
	private double duracion;

	public Disco(int codigo, String titulo, String autor, String genero, String formato, double duracion) {
		super();
		this.codigo = codigo;
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
		this.formato = formato;
		this.duracion = duracion;
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

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public double getDuracion() {
		return duracion;
	}

	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}

	@Override
	public String toString() {
		return codigo + ", " + titulo + ", " + autor + ", " + genero + ", " + formato + ", " + duracion;
	}

	@Override
	public boolean equals(Object obj) {
		Disco other = (Disco) obj;
		return Objects.equals(autor, other.autor) && codigo == other.codigo
				&& Double.doubleToLongBits(duracion) == Double.doubleToLongBits(other.duracion)
				&& Objects.equals(formato, other.formato) && Objects.equals(genero, other.genero)
				&& Objects.equals(titulo, other.titulo);
	}

	@Override
	public int compareTo(Disco o) {
		return titulo.compareToIgnoreCase(getTitulo());
	}

}
