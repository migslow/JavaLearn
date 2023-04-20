package repaso;

public class Pelicula {
	private int id;
	private String titulo;
	private String director;
	private String productor;
	private int anyoEstreno;
	private String actorPrincipal;

	public Pelicula() {
		super();
	}

	public Pelicula(int id, String titulo, String director, String productor, int anyoEstreno, String actorPrincipal) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.director = director;
		this.productor = productor;
		this.anyoEstreno = anyoEstreno;
		this.actorPrincipal = actorPrincipal;
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

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getProductor() {
		return productor;
	}

	public void setProductor(String productor) {
		this.productor = productor;
	}

	public int getAnyoEstreno() {
		return anyoEstreno;
	}

	public void setAnyoEstreno(int anyoEstreno) {
		this.anyoEstreno = anyoEstreno;
	}

	public String getActorPrincipal() {
		return actorPrincipal;
	}

	public void setActorPrincipal(String actorPrincipal) {
		this.actorPrincipal = actorPrincipal;
	}

	@Override
	public String toString() {
		return "Pelicula [id=" + id + ", titulo=" + titulo + ", director=" + director + ", productor=" + productor
				+ ", anyoEstreno=" + anyoEstreno + ", actorPrincipal=" + actorPrincipal + "]";
	}

}
