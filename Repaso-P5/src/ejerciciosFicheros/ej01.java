package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

/*
 *  Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
	texto que contiene varias líneas con una cantidad real en cada una de ellas (que habrás
	creado con anterioridad), y calcule su suma y media. Incluye también el tratamiento de
	excepciones.
 */

public class ej01 {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el nombre con extension del fichero: ");
		String f = s.next();
		String ruta = "ficheros/" + f;
		calcularReal(ruta);
	}

	public static void calcularReal(String ruta) {

		try {
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			int contador = 0;
			double suma = 0, media = 0;
			String aux;
			while ((aux = br.readLine()) != null) {
				suma = suma + Double.parseDouble(aux);
				contador++;
			}
			media = suma / contador;
			System.out.println("La suma es: " + suma);
			System.out.println("La media es: " + media);
			br.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}

}
