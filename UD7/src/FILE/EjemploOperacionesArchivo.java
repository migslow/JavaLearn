package FILE;

import java.io.*;

public class EjemploOperacionesArchivo {
	public static void main(String arg[]) {
		try {
			File file = new File("D:\\Alberto.txt");
			boolean resultado = file.createNewFile();
			if (resultado) {
				System.out.println("Archivo creado");
			} else {
				System.out.println("No se pudo crear el archivo");
			}
		} catch (IOException e) {
			System.out.println("Se produjo el error: " + e.getMessage());
		}
		try {
			File file = new File("D:\\Alberto.txt");
			boolean resultado = file.delete();
			if (resultado) {
				System.out.println("Archivo borrado");
			} else {
				System.out.println("No se pudo borrar el archivo");
			}
		} catch (Exception e) {
			System.out.println("Se produjo el error: " + e.getMessage());
		}
	}
}
