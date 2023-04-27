package Examen_5;

public class CD {
	private String titulo;
	private String artista;
	private String pais;
	private String empresa;
	private double precio;
	private int anyo;

//
	public CD() {
	}

	public CD(String titulo, String artista, String pais, String empresa, double precio, int anyo) {
		this.titulo = titulo;
		this.artista = artista;
		this.pais = pais;
		this.empresa = empresa;
		this.precio = precio;
		this.anyo = anyo;
	}

	//
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getAnyo() {
		return anyo;
	}

	public void setAnyo(int anyo) {
		this.anyo = anyo;
	}

//
	@Override
	public String toString() {
		return titulo + ", " + artista + ", " + pais + ", " + empresa + ", " + precio + ", " + anyo;
	}

}
