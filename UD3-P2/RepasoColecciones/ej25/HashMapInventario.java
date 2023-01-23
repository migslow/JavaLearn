package ej25;

import java.util.HashMap;

public class HashMapInventario {

	static HashMap<String, Integer> lista = new HashMap<String, Integer>();

	public static void main(String[] args) {
		System.out.println("Agregar");
		agregarArticulo("Lampara", 2);
		agregarArticulo("Cama", 1);
		agregarArticulo("Sofa", 4);
		System.out.println("\nEliminar");
		eliminarArticulo("Cama");
		eliminarArticulo("a");
		System.out.println("\nModificar");
		modificarCantidad("Sofa", 7);
		System.out.println("\nMostrar");
		listarArticulos();

	}

	public static void agregarArticulo(String nombre, Integer cantidad) {
		lista.put(nombre, cantidad);
		System.out.println(lista);
	}

	public static void eliminarArticulo(String nombre) {
		for (int i = 0; i < lista.size(); i++) {
			if (lista.containsKey(nombre)) {
				lista.remove(nombre);
				System.out.println("El articulo ha sido eliminado");
			}
		}
	}

	public static void modificarCantidad(String nombre, Integer cantidad) {
		if (lista.containsKey(nombre)) {
			lista.put(nombre, cantidad);
		} else {
			System.out.println("El articulo no se encuentra en la lista");
		}
	}

	public static void listarArticulos() {
		for (String nombre : lista.keySet()) {
			System.out.println(nombre + ": " + lista.get(nombre));
		}
	}

}
