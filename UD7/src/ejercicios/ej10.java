package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;

public class ej10 {

	public static void duplicar(String nombre1) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre1));
			
		} catch (Exception e) {
			System.out.println("A ocurrido un problema" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String nombre1 = "Ficheros/quijote3.txt";

	}

}
