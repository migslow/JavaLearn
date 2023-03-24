package repasoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej34 {

	static Scanner s = new Scanner(System.in);

	public static void convertirABytes(String nombre1, String nombre2) {
		try {
			int aux;
			FileInputStream fis = new FileInputStream(nombre1);
			FileOutputStream fos = new FileOutputStream(nombre2);
			while ((aux = fis.read()) != -1) {
				fos.write(aux);
			}
			fis.close();
			fos.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el primer fichero con extension: ");
		String nombre1 = s.nextLine();
		System.out.println("Introduce el segundo fichero con extension: ");
		String nombre2 = s.nextLine();
		String ruta1 = "FicherosRepaso/" + nombre1;
		String ruta2 = "FicherosRepaso/" + nombre2;
		convertirABytes(ruta1, ruta2);
	}

}
