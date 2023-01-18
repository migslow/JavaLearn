package proyecto3;

import java.util.ArrayList;

import proyecto2.Biblioteca;
import proyecto2.Libro;

public class Main {
	public static void main(String[] args) {
		ArrayList<Multimedia> lista = new ArrayList<Multimedia>();
		Multimedia l1 = new DiscoPrestable("Back in black", "AC/DC", "MP4", 4.23, "Rock", false);
		Multimedia l2 = new DiscoPrestable("Thriller", "Michael Jackson", "MP4", 5.58, "Pop", false);
		Multimedia l3 = new DiscoPrestable("Memories", "David Guetta", "MP4", 3.12, "House", false);
		lista.add(l1);
		lista.add(l2);
		lista.add(l3);

		((DiscoPrestable) l1).prestar();
		((DiscoPrestable) l2).prestar();
		System.out.println(lista);
		System.out.println("\nDiscos prestados: ");
		System.out.println(cuentaPrestados(lista));
	}

	public static int cuentaPrestados(ArrayList<Multimedia> p) {
		int prestados = 0;
		for (Multimedia b : p)
			if (b instanceof Disco)
				if (((DiscoPrestable) b).prestado())
					prestados++;
		return prestados;
	}
}
