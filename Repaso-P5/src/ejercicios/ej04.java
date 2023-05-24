package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 * Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
   texto (que habrás creado con anterioridad) y lo muestre por pantalla sin espacios en
   blanco. Incluye también el tratamiento de excepciones.
 */

public class ej04 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String f = s.next();
		String ruta = "ficheros/" + f;
		muestraSinEspacios(ruta);

	}
	
	public static void muestraSinEspacios(String ruta) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			int aux;
			while ((aux = br.read()) != -1) {
				if((char) aux !=32) {
					System.out.print((char)aux);
				}
			}
			br.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}

}
