package ej10;

public class MainListaMultimedia {

	public static void main(String[] args) {
		ListaMultimedia lista = new ListaMultimedia();
		
		Multimedia l1 = new DiscoPrestable("Back in black", "AC/DC", "MP4", 4.23, "Rock", false);
		Multimedia l2 = new DiscoPrestable("Thriller", "Michael Jackson", "MP4", 5.58, "Pop", false);
		Multimedia l3 = new DiscoPrestable("Memories", "David Guetta", "MP4", 3.12, "House", false);
		lista.crearObjeto(l1);
		lista.crearObjeto(l2);
		lista.crearObjeto(l3);

		((DiscoPrestable) l1).prestar();
		((DiscoPrestable) l2).prestar();
		lista.mostrarInformacion();
		System.out.println("\nDiscos prestados: ");
		System.out.println(lista.cuentaPrestados());

	}

}
