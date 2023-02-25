package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej07 {
	
	public static void calcular(String nombre) {
		try {
			int aux = 0;
			int contador = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while((aux = br.read()) != -1) {
				if((char) aux == 32) {
					contador++;
				}
			}
			br.close();
			System.out.println("Hay " + contador + " palabras");
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String ruta = "FicherosRepaso/datos9.txt";
		calcular(ruta);
	}

}
