package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Este programa comprueba si dos ficheros son iguales contando el numero de caracteres de ambos
 */

public class ej20 {

	static Scanner s = new Scanner(System.in);

	public static void comprobarFicheros(String nombre1, String nombre2) {
		try {
			String aux1 = null, aux2 = null;
			int contador1 = 0, contador2 = 0;
			BufferedReader br1 = new BufferedReader(new FileReader(nombre1));
			BufferedReader br2 = new BufferedReader(new FileReader(nombre2));
			while ((aux1 = br1.readLine()) != null && (aux2 = br2.readLine()) != null) {
				contador1 = contador1 + Integer.parseInt(aux1);
				contador2 = contador2 + Integer.parseInt(aux2);
			}
			System.out.println("El primer fichero tiene una longitud de " + contador1 + " caracteres");
			System.out.println("El segundo fichero tiene una longitud de " + contador2 + " caracteres");
			if (contador1 == contador2) {
				System.out.println("Los dos ficheros tienen la misma longitud");
			} else {
				System.out.println("Los dos ficheros no tienen la misma longitud");
			}
			br1.close();
			br2.close();
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
