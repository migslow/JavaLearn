package Examen_5;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Pregunta1 {
	public static void main(String[] args) throws IOException {

		// COMPLETAR

		ArrayList<String> lista = new ArrayList<>();

		BufferedReader br = new BufferedReader(new FileReader("Ficheros/alumnos.dat"));
		String linea;
		while ((linea = br.readLine()) != null) {
			lista.add(linea);
		}
		br.close();

		Collections.sort(lista);

		BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/alumnos2.dat"));
		for (String nombre : lista) {
			bw.write(nombre + "\n");
		}
		bw.close();
		// imprimir
		BufferedReader br2 = new BufferedReader(new FileReader("Ficheros/alumnos2.dat"));
		System.out.println("lista");
		while ((linea = br2.readLine()) != null) {
			System.out.println(linea);
		}
		br2.close();

	} // del main
} // de la clase Pregunta1
