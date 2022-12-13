package ejerciciosPaqueteColecciones_II.ejercicios3y4;

public class MainArrayListProducto {

	public static void main(String[] args) {
		ArrayListProducto lista = new ArrayListProducto();
		System.out.println(lista.añadirProducto(new Producto(1234567, "Lampara", "Hogar", 127.99, 47)));
		System.out.println(lista.añadirProducto(new Producto(2345678, "Sofa", "Hogar", 723.99, 12)));
		System.out.println(lista.añadirProducto(new Producto(3456789, "Cantimplora", "Aventura", 27.99, 147)));
		System.out.println(lista.añadirProducto(new Producto(4567890, "Ruedas de Coche", "Automovilistico", 59.99, 234)));
		System.out.println();
		System.out.println(lista);
		System.out.println("Buscar por posicion");
		System.out.println(lista.buscarProductoPosicion(2));
		System.out.println("\nBuscar por codigo");
		System.out.println(lista.buscarProductoCodigo(1234567));
		System.out.println(lista.buscarProductoCodigo(123456));

	}

}
