package ejercicios;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ej12 {

	public static void main(String[] args) {
		try {
			int aux;
			FileReader fr = new FileReader("Ficheros/personas.dat");
			FileWriter fw = new FileWriter("Ficheros/personasEncriptado.dat");
			while ((aux = fr.read()) != -1) {
				if (aux < ('Z') && aux >= ('A') || aux < ('z') && aux >= ('a')) {
					fw.write(aux + 1);
				} else {
					fw.write(aux);
				}
			}
			fw.close();
			fr.close();

		} catch (FileNotFoundException e) {
			System.out.println("La ruta introducida no existe");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema " + e.getMessage());
		}
	}

}
