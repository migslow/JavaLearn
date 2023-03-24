package repasoFicheros;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej35 {

	static Scanner s = new Scanner(System.in);

	public static void convertirALegible(String nombre1, String nombre2) {
		try {
			int aux;
			DataInputStream dis = new DataInputStream(new FileInputStream(nombre1));
			DataOutputStream dos = new DataOutputStream(new FileOutputStream(nombre2));
			while ((aux = dis.read()) != -1) {
				dos.write(aux);
			}
			dis.close();
			dos.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el primer fichero con extension: ");
		String nombre1 = s.nextLine();
		System.out.println("Introduce el segundo fichero con extension: ");
		String nombre2 = s.nextLine();
		String ruta1 = "FicherosRepaso/" + nombre1;
		String ruta2 = "FicherosRepaso/" + nombre2;
		convertirALegible(ruta1, ruta2);

	}

}
