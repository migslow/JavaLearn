package _04ordenando_colecciones;

import java.util.ArrayList;
import java.util.Collections;

public class PruebaUsuario1 {

	public static void main(String[] args) {
		ArrayList<Usuario1> lista = new ArrayList<Usuario1>();
		lista.add(new Usuario1("uno", 11));
		lista.add(new Usuario1("dos", 2));
		lista.add(new Usuario1("tres", 3));
		lista.add(new Usuario1("cuatro", 44));
		Usuario1 u1 = new Usuario1("Luis", 23);
		Usuario1 u2 = new Usuario1("Alberto", 45);
		
		System.out.println("\nImprimo el objeto lista directamente:");
		System.out.println(lista);
		System.out.println("\nImprimo el objeto lista con m�todo;");
		imprimirLista(lista);
		System.out.println("\nAhora ordenados por nombre...");
		Collections.sort(lista, new NombreComparator());
		// metodo que imprime la lista
		imprimirLista(lista);
		System.out.println("\n y ahora ordenados por edad...");
		Collections.sort(lista, new EdadComparator());
		// metodo que imprime la lista
		imprimirLista(lista);
		System.out.println("\nComparando los nombres");
		System.out.println(u1.compareTo(u2));

	}

	private static void imprimirLista(ArrayList<Usuario1> lista) {
		for (Usuario1 usu : lista)
			System.out.println(usu);
	}
}
