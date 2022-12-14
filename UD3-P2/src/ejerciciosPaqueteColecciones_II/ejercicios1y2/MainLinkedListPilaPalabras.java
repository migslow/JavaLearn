package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.LinkedList;

import _03colecciones2.LinkedListLibros;

public class MainLinkedListPilaPalabras {

	public static void main(String[] args) {
		LinkedListPilaPalabras a = new LinkedListPilaPalabras();
		System.out.println("Agregar Palabras");
		a.apilarPalabra("Hola");
		a.apilarPalabra("Adios");
		a.apilarPalabra("Como estas");
		System.out.println(a);
		System.out.println("\nComprobar si el array esta vacio");
		System.out.println(a.pilaPalabrasVacia());
		System.out.println("\nComprobar el tamaño del array");
		System.out.println(a.NumeropilaPalabras());
		System.out.println("\nElimiar una palabra");
		System.out.println(a.desapilarPalabra());
		System.out.println(a);
		System.out.println("\nBuscar palabra cima");
		System.out.println(a.obtenerPalabraCima());
		System.out.println("\nVolver a comprobar si se a borrado bien y el numero del tamaño");
		System.out.println(a);

	}

}
