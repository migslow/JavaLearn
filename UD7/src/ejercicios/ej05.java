package ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*	
 	Escribe una clase con un método que pida al usuario una cadena de caracteres y la guarde
	al revés en un archivo de texto cuyo nombre se le pasará como segundo argumento.
	Incluye también el tratamiento de excepciones.
*/

public class ej05 {
	public static void main(String[] args) throws IOException {
		if (args.length >= 2) {
			String cadena = args[0];
			String fichero = args[1];
			StringBuilder builder = new StringBuilder(cadena);
			String reverse = builder.reverse().toString();
			FileWriter fw = new FileWriter(fichero);
			fw.write(reverse);
			fw.close();
		} else {
			System.out.println("No he recibido los argumentos");
			System.exit(-1);
		}

	}

}
