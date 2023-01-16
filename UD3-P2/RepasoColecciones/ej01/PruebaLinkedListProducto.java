package ej01;

public class PruebaLinkedListProducto {

	public static void main(String[] args) {
		LinkedListProducto lista = new LinkedListProducto();
		
		lista.anyadir(new Producto(1, "Lampara", "Iluminacion", 119.99, 45));
		lista.anyadir(new Producto(2, "Sofa", "Casa", 119.99, 45));
		lista.anyadir(new Producto(3, "Cantimplora", "Montaña", 119.99, 45));
		lista.anyadir(new Producto(4, "Mochila", "Montaña", 119.99, 45));
		lista.anyadir(new Producto(5, "Monitor", "Oficina", 119.99, 45));
		
		lista.mostrarLista();
		
		System.out.println("\nBuscar por posicion: ");
		System.out.println(lista.buscarPosicion1(2));
		System.out.println(lista.buscarPosicion2(3));
		/*
		System.out.println("\nEliminar por posicion: ");
		System.out.println(lista.eliminarPosicion1(5));
		System.out.println(lista.eliminarPosicion2(4));
		*/
		System.out.println();
		lista.mostrarLista();
		
		System.out.println(lista.buscarPorCodigo(1));
		System.out.println(lista.eliminarPorCodigo(3));

		System.out.println();
		lista.mostrarLista();
		
		System.out.println(lista.cambiarPrecio(4, 200));
		
		System.out.println();
		lista.mostrarLista();
	}

}
