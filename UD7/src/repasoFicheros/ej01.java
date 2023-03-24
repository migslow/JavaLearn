package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej01 {

	public static void calculo(String nombre) {
		try {
			String aux;
			int contador = 0;
			double suma = 0;
			double media = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while ((aux = br.readLine()) != null) {
				suma = suma + Double.parseDouble(aux);
				contador++;
			}
			media = suma / contador;
			br.close();
			System.out.println("La suma de todos los numeros es " + suma + " y la media es " + media);
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String ruta = "FicherosRepaso/datos7.txt";
		calculo(ruta);

	}

}
