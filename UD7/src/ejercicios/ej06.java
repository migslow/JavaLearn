package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej06 {

	public static void conversor(String nombre) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while((aux = br.readLine()) != null) {
				if()
			}
			
		} catch(IOException e){
			System.out.println("A ocurrido un problema." + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String f = "Ficheros//quijote2.txt";
		conversor(f);

	}

}
