package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Este programa comprueba si dos ficheros son iguales
 */

public class ej19 {

	static Scanner s = new Scanner(System.in);

	public static void comprobarFicheros(String nombre1, String nombre2) {
		try {
			String aux1, aux2;
			BufferedReader br1 = new BufferedReader(new FileReader(nombre1));
			BufferedReader br2 = new BufferedReader(new FileReader(nombre2));
			while ((aux1 = br1.readLine()) != null && (aux2 = br2.readLine()) != null) {
				if (aux1.equals(aux2)) {
					System.out.println("Los dos ficheros son iguales");
				} else {
					System.out.println("Los dos ficheros no son iguales");
				}
			}
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del primer fichero con extension: ");
		String nombre1 = s.nextLine();
		System.out.println("Introduce el nombre del segundo fichero con extension: ");
		String nombre2 = s.nextLine();
		String ruta1 = "FicherosRepaso/" + nombre1;
		String ruta2 = "FicherosRepaso/" + nombre2;
		comprobarFicheros(ruta1, ruta2);

	}

}
