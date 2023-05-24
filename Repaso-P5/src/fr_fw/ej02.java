package fr_fw;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej02 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("ficheros/fichero2.txt");
			FileReader fr = new FileReader("ficheros/fichero2.txt");
			fw.write(77);
			fw.write(73);
			fw.write(71);
			fw.write(85);
			fw.write(69);
			fw.write(76);
			fw.close();
			int aux;
			while ((aux = fr.read()) !=-1) {
				System.out.print((char) aux);
				aux = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}

	}

}
