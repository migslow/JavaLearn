import HashSet.Persona;

public class MainLibro2 {

	public static void main(String[] args) {
		Libro l1 = new Libro(1, "a", "a", 120);
		Libro l2 = new Libro(2, "b", "b", 130);
		Libro l3 = new Libro(3, "c", "c", 140);

		TreeSetLibro lista = new TreeSetLibro();
		
		System.out.println("Libros añadidos a la lista");
		System.out.println(lista.insertar(l1));
		System.out.println(lista.insertar(l2));
		System.out.println(lista.insertar(l3));
		System.out.println("\nLa lista esta vacia?");
		System.out.println(lista.vacia());
		System.out.println("\nCuantos elementos tiene la lista?");
		System.out.println(lista.tamanyo());
		System.out.println("\nBuscar el titulo de un libro por una parte");
		lista.contieneTitulo("a");
		System.out.println();
		lista.contieneTitulo("A");
		System.out.println();
		lista.contieneTitulo("aaaa");
		System.out.println();
		System.out.println("\nLa lista contiene un libro");
		System.out.println(lista.contiene(l2));
		System.out.println("\nMuestra todos los libros");
		lista.mostrarLista();

	}

}
