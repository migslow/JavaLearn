package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej06 {

	static Scanner s = new Scanner(System.in);

	public static void conversor(String nombre) {
		try {
			System.out.println("Introduce el nombre del nuevo fichero donde quieres almacenar la cadena convertida a mayusculas: ");
			String n1 = s.nextLine();
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			BufferedWriter pw = new BufferedWriter(new FileWriter("Ficheros/" + n1 + ".txt"));
			while ((aux = br.readLine()) != null)
				pw.write(aux.toUpperCase());
			br.close();
			pw.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema." + e.getMessage());
		}
	}

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero: ");
		String nombre = s.nextLine();
		String f = "Ficheros/" + nombre + ".txt";
		conversor(f);

	}

}
