package ejerciciosPaqueteColecciones_I.ejercicios3y4;

/*
 * Atributos Libro:
 * 	private String titulo;
	private int edicion;
	private Persona autor;
	private String isbn;
	private String editorial;
	private String lugar;
	private Fecha fecha;
	private int paginas;
 */

public class PruebaListaLibro {

	public static void main(String[] args) {
		Persona persona1 = new Persona(1241262346, 28, "Liang, Y. Daniel", "");
		Persona persona2 = new Persona(1234563456, 18, "Alberto, P. Lacasta", "");
		Persona persona3 = new Persona(1345234523, 56, "Maria, M. Palma", "");
		Fecha fecha1 = new Fecha(16, 11, 2001);
		Fecha fecha2 = new Fecha(6, 3, 2011);
		Fecha fecha3 = new Fecha(21, 6, 2022);
		Libro l1 = new Libro("Introduction to Java Programming", 3, persona1, "0-13-031997-X", "Prentice-Hall",
				"New Jersey (USA)", fecha1, 784);
		Libro l2 = new Libro("Advanced Java Programming", 3, persona1, "0-13-2345231997-X", "Santillana",
				"Madrid (España)", fecha2, 478);
		Libro l3 = new Libro("Big Data Programming", 3, persona1, "0-23133-031231997-H", "Tokio-Shall", "Tokio (Japan)",
				fecha3, 1384);

		ListaLibro lib = new ListaLibro();
		lib.insertar(l1);
		lib.insertar(l2);
		lib.insertar(l3);
		
		System.out.println(lib.eliminarLibro(2));
		System.out.println();
		System.out.println(lib);
		System.out.println();
		System.out.println(lib.buscarLibro("Big Data"));
	}

}
