package fr_fw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej01 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("ficheros/fichero1.txt");
			fw.write("Esto es una prueb");
			fw.write(97);
			fw.close();
			FileReader fr = new FileReader("ficheros/fichero1.txt");
			int aux = fr.read();
			while (aux !=-1) {
				System.out.print((char)aux);
				aux = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}

	}

}
