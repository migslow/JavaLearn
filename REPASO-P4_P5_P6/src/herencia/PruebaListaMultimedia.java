package herencia;

public class PruebaListaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia lista = new ListaMultimedia();

		lista.insertar(new Disco("Highway To Hell", "AC/DC", "MP4", 3.27, "Hard rock"));
		lista.insertar(new Disco("Memories", "David Guetta", "MP4", 3.28, "House"));
		lista.insertar(new Disco("Summertime", "Lana del Rey", "MP4", 4.06, "Aria, Jazz"));

		lista.insertar(new Pelicula("El odio", "Mathieu Kassovitz", "mpeg", 98, "Vicent Cassel", null));
		lista.insertar(new Pelicula("Torrente", "Santiago Segura", "mpeg", 99, "Santiago Segura", null));
		lista.insertar(new Pelicula("Tesis", "Alejandro Amenabar", "mpeg", 100, "Eduardo Noriega", "Ana Torrent"));

		lista.imprimeLista();
		
		System.out.println("\nDuracion total: ");
		System.out.println(lista.duracionTotal());
		
		System.out.println("\nCanciones por el genero rock: ");
		System.out.println(lista.buscarPorGenero("rock"));
		
		System.out.println("\nCuantas peliculas no tienes actriz principal: ");
		System.out.println(lista.peliculasSinActriz());

	}

}
