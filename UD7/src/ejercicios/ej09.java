package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class ej09 {

	public static void comparar(String nombre1, String nombre2) {
		try {
			String cadena1, cadena2;
			BufferedReader br1 = new BufferedReader(new FileReader(nombre1));
			BufferedReader br2 = new BufferedReader(new FileReader(nombre2));
			while ((cadena1 = br1.readLine()) != null && (cadena2 = br2.readLine()) != null) {
				if (cadena1.equals(cadena2)) {
					System.out.println("Los ficheros son iguales");
				} else {
					System.out.println("Los ficheros no son iguales");
				}
			}
		} catch (Exception e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String nombre1 = "Ficheros/quijote.txt";
		String nombre2 = "Ficheros/quijote3.txt";
		comparar(nombre1, nombre2);

	}

}
