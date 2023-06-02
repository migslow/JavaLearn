package ComparatorYcomparable;

public class MainLibro {

	public static void main(String[] args) {
		ArrayListLibro lista = new ArrayListLibro();
		lista.anayir(new Libro(1, "a", "a", "a", 300));
		lista.anayir(new Libro(2, "b", "b", "b", 250));
		lista.anayir(new Libro(3, "c", "c", "c", 900));
		
		lista.mostrarLista();
		
		System.out.println("\nComparar por titulo: ");
		lista.ordenarPorTitulo();
		lista.mostrarLista();
		
		System.out.println("\nComparar por paginas: ");
		lista.ordenarPorPaginas();
		lista.mostrarLista();

	}

}
