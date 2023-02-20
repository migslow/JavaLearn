package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class ej11 {

	public static void main(String[] args) {
		String ruta1 = "Ficheros/persona1.txt";
		String ruta2 = "Ficheros/persona2.txt";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
			BufferedReader br2 = new BufferedReader(new FileReader(ruta2));
			String nombre1 = "", nombre2 = "";
			while ((ruta1 = br1.readLine()) != null && (ruta2 = br2.readLine()) != null) {
				
			}
		} catch (Exception e) {
			System.out.println("Ha ocurrido un problema " + e.getMessage());
		}

	}

}
