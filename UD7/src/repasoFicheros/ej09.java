package repasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej09 {
	
	public static void conversor(String nombre1, String nombre2) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre1));
			BufferedWriter bw = new BufferedWriter(new FileWriter(nombre2));
			while((aux = br.readLine()) != null) {
				bw.write(aux.toUpperCase());
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String ruta1 = "FicherosRepaso/datos11.txt";
		String ruta2 = "FicherosRepaso/datos12.txt";
		conversor(ruta1, ruta2);

	}

}
