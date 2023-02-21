package ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej13 {
	public static void main(String[] args) {
		try {
			int aux;
			FileReader fr = new FileReader("Ficheros/miguelEncriptado.txt");
			while ((aux = fr.read()) != -1) {
				System.out.println((char)(aux-1));
				fr.read();
			}
			fr.close();
		} catch (FileNotFoundException e) {
			System.out.println("La ruta introducida no existe");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema " + e.getMessage());
		}
	}
}
