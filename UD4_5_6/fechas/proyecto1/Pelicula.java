package proyecto1;

public class Pelicula extends Multimedia{
	private String actorPrincipal;
	private String actrizPrincipal;
	
	public Pelicula(String titulo, String autor, String formato, double duracion) {
		super(titulo, autor, formato, duracion);
		this.actorPrincipal = actorPrincipal;
		this.actrizPrincipal = actrizPrincipal;
	}
	
	
}
