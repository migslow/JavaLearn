package ejercicios;

import java.io.FileWriter;

/*
  	Escribe una clase con un método que reciba por parámetro el nombre de un fichero de
	texto que contiene varias líneas con una cantidad real en cada una de ellas (que habrás
	creado con anterioridad), y calcule su suma y media. Incluye también el tratamiento de
	excepciones.
*/

public class ej01 {

	public static void main(String[] args) {
		int suma = 0, media = 0;
		if (args.length >= 1) {
			String ficheroCreado = args[0];
			FileWriter fw = new FileWriter(ficheroCreado);
			while(fw.)
			fw.close();
		} else {
			System.out.println("No he recibido los argumentos");
			System.exit(-1);
		}
	}

}
