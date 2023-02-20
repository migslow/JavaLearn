package ejercicios;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;

public class ej11 {

	public static void main(String[] args) {
		String ruta1 = "Ficheros/persona1.txt";
		String ruta2 = "Ficheros/persona2.txt";
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
			BufferedReader br2 = new BufferedReader(new FileReader(ruta2));
			HashSet<String> hs = new HashSet<String>();
			while ((ruta1 = br1.readLine()) != null && (ruta2 = br2.readLine()) != null) {
				hs.add(ruta1);
				hs.add(ruta2);
				BufferedWriter bw = new BufferedWriter(new FileWriter("Ficheros/persona3.txt"));
				bw.write(ruta1);
				bw.write("\n");
				bw.write(ruta2);
				bw.close();
			}
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema " + e.getMessage());
		}

	}

}
