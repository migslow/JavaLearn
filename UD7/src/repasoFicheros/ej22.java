package repasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej22 {

	static Scanner s = new Scanner(System.in);

	public static void conjuntoTexto(String nombre1, String nombre2, String nombre3) {
		try {
			String aux1, aux2;
			BufferedReader br1 = new BufferedReader(new FileReader(nombre1));
			BufferedReader br2 = new BufferedReader(new FileReader(nombre2));
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre3));
			while ((aux1 = br1.readLine()) != null && (aux2 = br2.readLine()) != null) {
				bw.write(aux1);
				bw.write(aux2);
				br1.readLine();
				br2.readLine();
			}
			br1.close();
			br2.close();
			bw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del primer fichero con extension: ");
		String nombre1 = s.nextLine();
		System.out.println("Introduce el nombre del segundo fichero con extension: ");
		String nombre2 = s.nextLine();
		System.out.println("Introduce el nombre del tercer fichero con extension: ");
		String nombre3 = s.nextLine();
		String ruta1 = "FicherosRepaso/" + nombre1;
		String ruta2 = "FicherosRepaso/" + nombre2;
		String ruta3 = "FicherosRepaso/" + nombre3;
		conjuntoTexto(ruta1, ruta2, ruta3);
	}

}
