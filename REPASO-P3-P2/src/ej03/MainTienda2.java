package ej03;

public class MainTienda2 {

	public static void main(String[] args) {
		HashSetTienda lista = new HashSetTienda();
		lista.anyadirArticulo(new Tienda(1, "Lampara", 120, 39.99));
		lista.anyadirArticulo(new Tienda(2, "Sofa", 41, 799.99));
		lista.anyadirArticulo(new Tienda(3, "Sabanas", 34, 24.99));
		lista.anyadirArticulo(new Tienda(4, "Perchero", 86, 12.99));
		
		System.out.println(lista.vacia());
		System.out.println(lista.tamanyo());
		lista.mostrarLista();
		
		System.out.println(lista.buscarPorNombre("of"));
		System.out.println(lista.cambiarPrecio(2, 1199.99));
		lista.mostrarIterator();
		System.out.println(lista.eliminarPorId(3));
		lista.mostrarIterator();
		
		/*
		System.out.println("\nOrdenar por nombre: ");
		lista.ordenarPorNombre();
		lista.mostrarIterator();
		System.out.println("\nOrdenar por precio: ");
		lista.ordenarPorPrecio();
		lista.mostrarIterator();
		*/
		
		System.out.println(lista.comprarArticulo(1));
		lista.mostrarIterator();
		
		System.out.println(lista.comprarArticulo(1));
		lista.mostrarIterator();
	}

}
