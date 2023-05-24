package br_bw;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class ej01 {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new FileReader("ficheros/fichero3.txt"));
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/fichero3.txt"));
			bw.write("Esto es una prueba usando Buffered");
			bw.newLine();
			bw.write("Seguimos usando Buffered");
			bw.close();
			String aux;
			while ((aux = br.readLine()) != null) {
				System.out.println(aux);
				aux = br.readLine();
			}
			br.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}

	}

}
