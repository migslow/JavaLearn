package ej04;

public class Main1 {
	public static void main(String[] args) {
		ArrayListEdificio lista = new ArrayListEdificio();
		
		System.out.println("\nAnyadir");
		System.out.println(lista.anyadirEdificio(new Edificio(1, "calle1", 4, false)));
		System.out.println(lista.anyadirEdificio(new Edificio(2, "calle2", 7, true)));
		System.out.println(lista.anyadirEdificio(new Edificio(3, "calle3", 2, false)));
		
		System.out.println("\nInsertar: ");
		Edificio e1 = new Edificio(4, "calle4", 4, true);
		Edificio e2 = new Edificio(5, "calle5", 8, true);
		System.out.println(lista.insertarEdificio(e1));
		System.out.println(lista.insertarEdificio(e2));
		
		System.out.println("\nElminar: ");
		System.out.println(lista.eliminarEdificio(3));
		
		System.out.println("\nOrdenar por direccion");
		lista.ordenarPorDireccion();
		lista.mostrarIterator();
		System.out.println("\nOrdenar por numero de pisos");
		lista.ordenarPorNumeroPisos();
		lista.mostrarLista();
		
		
		System.out.println(lista.buscarPorDireccion("calle1"));
	}
}
