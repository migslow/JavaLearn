package ejercicios;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/*	
 	Escribe una clase con un método que pida al usuario una cadena de caracteres y la guarde
	al revés en un archivo de texto cuyo nombre se le pasará como segundo argumento.
	Incluye también el tratamiento de excepciones.
*/

public class ej05v2 {
	public static void main(String[] args) throws IOException {
		String cadena = args[0];
		String fichero = args[1];
		char[] cadChar = cadena.toCharArray();
		String rev = "";
		for (int i = cadChar.length - 1; i >= 0; i--) {
			rev = rev + cadChar[i];
		}
		FileWriter fw = new FileWriter(fichero);
		fw.write(rev);
		fw.close();
	}

}
