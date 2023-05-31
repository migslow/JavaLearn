

public class MainLinkedListProducto {

	public static void main(String[] args) {
		LinkedListProducto lista = new LinkedListProducto();
		System.out.println(lista.anyadir(new Producto(1234567, "Lampara", "Hogar", 127.99, 47)));
		System.out.println(lista.anyadir(new Producto(2345678, "Sofa", "Hogar", 723.99, 12)));
		System.out.println(lista.anyadir(new Producto(3456789, "Cantimplora", "Aventura", 27.99, 147)));
		System.out.println(lista.anyadir(new Producto(4567890, "Ruedas de Coche", "Automovilistico", 59.99, 234)));
		System.out.println();
		System.out.println(lista);

		System.out.println(lista.buscarProducto(1234567));
		System.out.println(lista.buscarProducto(123456));
		/*
		System.out.println("Buscar por posicion");
		System.out.println(lista.buscarProductoPosicion(2));
		System.out.println("\nBuscar por codigo");
		System.out.println(lista.cambiarPrecio(1234567, 99.99));
		System.out.println(lista);
		*/

	}

}
