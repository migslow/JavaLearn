package ej24;

import java.util.HashMap;

public class HashMapLibreta {
	
	static HashMap<String, String> lista = new HashMap<String, String>();

	public static void main(String[] args) {
		agregarContacto("Miguel", "1234");
		agregarContacto("Jaime", "123465");
		System.out.println();
		obtenerNumero("Miguel");
		eliminarContacto("Jaime");
		mostrarLista();

	}
	
	public static void agregarContacto(String nombre, String numero) {
		lista.put(nombre, numero);
		System.out.println(lista);
	}
	
	public static void obtenerNumero(String nombre) {
		System.out.println(lista.get(nombre));
	}
	
	public static void eliminarContacto(String nombre) {
		System.out.println(lista.remove(nombre));
	}
	
	public static void mostrarLista() {
		for(String nombre : lista.keySet()) {
			System.out.println(nombre + ": " + lista.get(nombre));
		}
	}
	
	

}
