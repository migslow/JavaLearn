package ejerciciosFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;
import java.util.TreeSet;

public class ej08 {
	
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el primer fichero con extension: ");
		String f1 = s.next();
		System.out.println("Introduce el segundo fichero con extension: ");
		String f2 = s.next();
		String ruta1 = "ficheros/" + f1;
		String ruta2 = "ficheros/" + f2;
		juntar(ruta1, ruta2);

	}
	
	public static void juntar(String ruta1, String ruta2) {
		try {
			BufferedReader br1 = new BufferedReader(new FileReader(ruta1));
			BufferedReader br2 = new BufferedReader(new FileReader(ruta2));
			BufferedWriter bw = new BufferedWriter(new FileWriter("ficheros/personas3.txt"));
			TreeSet<String> ts = new TreeSet<String>();
			while ((ruta1 = br1.readLine()) != null && (ruta2 = br2.readLine()) != null) {
				ts.add(ruta1);
				ts.add(ruta2);
				bw.write(ruta1);
				bw.write("\n");
				bw.write(ruta2);
				bw.close();
			}
		} catch (Exception e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

}
