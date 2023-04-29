package repaso;

public class Videojuego {
	private int id;
	private String titulo;
	private String desarrollador;
	private String genero;
	private int anyoEstreno;
	private String motorGrafico;
	private String plataformas;
	private int precio;

	public Videojuego() {
		super();
	}

	public Videojuego(int id, String titulo, String desarrollador, String genero, int anyoEstreno, String motorGrafico,
			String plataformas, int precio) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.desarrollador = desarrollador;
		this.genero = genero;
		this.anyoEstreno = anyoEstreno;
		this.motorGrafico = motorGrafico;
		this.plataformas = plataformas;
		this.precio = precio;
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

	public String getDesarrollador() {
		return desarrollador;
	}

	public void setDesarrollador(String desarrollador) {
		this.desarrollador = desarrollador;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	public String getMotorGrafico() {
		return motorGrafico;
	}

	public void setMotorGrafico(String motorGrafico) {
		this.motorGrafico = motorGrafico;
	}

	public String getPlataformas() {
		return plataformas;
	}

	public void setPlataformas(String plataformas) {
		this.plataformas = plataformas;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", titulo=" + titulo + ", desarrollador=" + desarrollador + ", genero=" + genero
				+ ", anyoEstreno=" + anyoEstreno + ", motorGrafico=" + motorGrafico + ", plataformas=" + plataformas
				+ ", precio=" + precio + "]";
	}

}
