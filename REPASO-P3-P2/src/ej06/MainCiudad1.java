package ej06;

public class MainCiudad1 {

	public static void main(String[] args) {
		ArrayListCiudad lista = new ArrayListCiudad();
		System.out.println("Insertar ciudades: ");
		lista.insertar(new Ciudad(1, "Huesca", "España", 50000));
		lista.insertar(new Ciudad(2, "Zaragoza", "España", 200000));
		lista.insertar(new Ciudad(3, "Teruel", "España", 74000));
		lista.mostrarLista();
		System.out.println("\nBusqueda por posicion: ");
		System.out.println(lista.buscarPorPosicion(2));
		System.out.println("\nBusqueda por pais: ");
		System.out.println(lista.busquedaPorPais("España"));
		System.out.println("\nBusqueda por pais y poblacion: ");
		System.out.println(lista.busquedaPorPaisPoblacion("España", 100000));
		System.out.println("\nCambiar nombre de ciudad: ");
		System.out.println(lista.cambiarNombreCiudad(3, "Toledo"));
		System.out.println("\nAumentar poblacion: ");
		System.out.println(lista.aumentarPoblacion(1, 5000));
		lista.mostrarLista();
		
		System.out.println("\nOrdenar por nombre: ");
		lista.ordenarPorNombre();
		lista.mostrarIterator();

	}

}
