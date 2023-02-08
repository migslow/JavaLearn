package MANEJO_DE_FICHEROS;

import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class EjemploFiltro3 {
	public static void main(String[] args) {
		try {
			BufferedWriter fichero = new BufferedWriter(new FileWriter("d:\\Ejemplo.txt"));
			for (int i = 1; i < 6; i++) {
				fichero.write("Fila n�mero: " + i);
				fichero.newLine();
			}
			fichero.close();
		} catch (FileNotFoundException fn) {
			System.out.println("No se encuentra el fichero");
		} catch (IOException e) {
			System.out.println("Error de E/S");
		}
	}
}
