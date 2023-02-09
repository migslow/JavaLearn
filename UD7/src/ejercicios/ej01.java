package ejercicios;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej01 {

	public static void calculo(String nombre) {
		try {
			int contador = 0;
			double media = 0, suma = 0;
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.readLine()) != null) {
				contador++;
				suma = suma + Double.parseDouble(aux);
			}
			media = suma / contador;
			System.out.println("La suma total es " + suma + " y la media es " + media);
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("El archivo no existe");
		} catch (IOException e) {
			System.out.println("Error de entrada/salida");
		} catch (NumberFormatException e) {
			System.out.println("Formato numérico incorrecto");
		}
	}

	public static void main(String[] args) {
		String nombre = "Ficheros/VariasLineas.txt";
		calculo(nombre);
	}

}
