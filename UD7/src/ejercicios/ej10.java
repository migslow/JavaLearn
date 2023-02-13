package ejercicios;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;

public class ej10 {

	public static void duplicar(String nombre1, String nombre2) {
		try {
			FileInputStream origen = new FileInputStream(nombre1);
			FileOutputStream destino = new FileOutputStream(nombre2);
			int i = origen.read();
			while (i != -1) {
				destino.write(i);
				i = origen.read();
			}
			origen.close();
			destino.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String nombre1 = "Ficheros/prueba.dat";
		String nombre2 = "Ficheros/copia_prueba.dat";
		duplicar(nombre1, nombre2);

	}

}
