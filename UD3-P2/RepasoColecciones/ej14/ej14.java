package ej14;
import java.util.HashMap;

public class ej14 {

	public static void main(String[] args) {
		HashMap<Integer, String> hash = new HashMap<Integer, String>();
		hash.put(1000, "Juan");
		hash.put(3000, "Ana");
		hash.put(1500, "Pepe");
		System.out.println(hash);
		
		// obtener un dato en concreto
		System.out.println("\n" + hash.get(1000));
		
		// borrar un valor
		hash.remove(3000);
		System.out.println("\n" + hash);
		
		// devuelve un boolean si contiene el dato
		if(hash.containsKey(1500)) {
			System.out.println("Contiene un indice de 1500 y su valor es " + hash.get(1500));
		} else {
			System.out.println("El hash no contiene el valor " + hash.get(1500));
		}
		
		// recorrer el hashMap
		System.out.println();
		for(Integer indice : hash.keySet()) {
			System.out.println(hash.get(indice));
		}
	}

}
