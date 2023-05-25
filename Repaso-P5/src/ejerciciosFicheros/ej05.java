package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class ej05 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extensión que vas a crear: ");
		String fc = s.next();
		System.out.println("Introduce el nombre del fichero con extensión: ");
		String fl = s.next();
		String rutac = "ficheros/" + fc;
		String rutal = "ficheros/" + fl;
		convertirMayus(rutac, rutal);

	}
	
	public static void convertirMayus(String rutac, String rutal) {
		try {
			BufferedReader br = new BufferedReader(new FileReader(rutal));
			BufferedWriter bw = new BufferedWriter(new FileWriter(rutac));
			String aux;
			while ((aux = br.readLine()) != null) {
				bw.write(aux.toUpperCase());
			}
			br.close();
			bw.close();
			
		} catch (Exception e) {
			System.out.println("Ha ocurrido un problema de E/S " + e);
		}
	}

}
