package ejercicios;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ej06 {

	public static void conversor(String nombre) {
		try {
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			PrintWriter pw = new PrintWriter(new FileWriter("Ficheros/mayusculas.txt"));
			while ((aux = br.readLine()) != null)
				pw.println(aux.toUpperCase());
			br.close();
			pw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema." + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String f = "Ficheros/quijote2.txt";
		conversor(f);

	}

}
