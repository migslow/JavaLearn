package ejerciciosPaqueteColecciones_II.ejercicios1y2;

import java.util.LinkedList;

import _03colecciones2.LinkedListLibros;

public class MainLinkedListPilaPalabras {

	public static void main(String[] args) {
		Palabra s1 = new Palabra("Hola");
		Palabra s2 = new Palabra("Adios");
		Palabra s3 = new Palabra("Como estas");
		
		LinkedListPilaPalabras a = new LinkedListPilaPalabras();
		System.out.println("Agregar Palabras");
		System.out.println(a.apilarPalabra(s1));
		System.out.println(a.apilarPalabra(s2));
		System.out.println(a.apilarPalabra(s3));
		System.out.println("Comprobar si el array esta vacio");
		System.out.println(a.pilaPalabrasVacia());
		System.out.println("Comprobar el tamaño del array");
		System.out.println(a.NumeropilaPalabras());
		System.out.println("Elimiar una palabra");
		System.out.println(a.desapilarPalabra(s1));
		System.out.println("Buscar una palabra");
		System.out.println(a.buscar("Adios"));
		System.out.println("Volver a comprobar si se a borrado bien y el numero del tamaño");
		System.out.println(a.NumeropilaPalabras());
		
		a.imprimirLista();
	}

}
