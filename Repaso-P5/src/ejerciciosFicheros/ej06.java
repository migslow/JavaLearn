package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Scanner;

public class ej06 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el primer fichero con extension: ");
		String f1 = s.next();
		System.out.println("Introduce el segundo fichero con extension: ");
		String f2 = s.next();
		
		String ruta1 = "ficheros/" + f1;
		String ruta2 = "ficheros/" + f2;
		compruebaFicheros(ruta1, ruta2);
	}
	
	public static void compruebaFicheros(String ruta1, String ruta2) {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
			BufferedReader br2 = new BufferedReader(new FileReader(ruta2));
			String aux1, aux2;
			while ((aux1 = br1.readLine()) != null && (aux2 = br2.readLine()) != null) {
				if (aux1.equals(aux2)) {
					System.out.println("Los ficheros son iguales");
				} else {
					System.out.println("Los ficheros no son iguales");
				}
			}
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}

}
