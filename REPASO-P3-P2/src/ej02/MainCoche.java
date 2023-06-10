package ej02;

public class MainCoche {

	public static void main(String[] args) {
		LinkedListCoche lista = new LinkedListCoche();
		lista.anyadir(new Coche(1, "Audi", "RS6", 2021, 200.000));
		lista.anyadir(new Coche(2, "Ford", "Mustang GT", 2020, 127.854));
		lista.anyadir(new Coche(3, "Seat", "Toledo", 2006, 2100.00));
		
		lista.mostrarIterator();
		
		System.out.println("\nBusqueda por marca :");
		System.out.println(lista.buscarPorMarca("A"));
		System.out.println(lista.eliminarPorId(3));
		System.out.println(lista.cambiarPrecio(2, 128.234));
		lista.mostrarLista();

	}

}
