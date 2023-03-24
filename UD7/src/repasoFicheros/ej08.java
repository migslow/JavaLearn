package repasoFicheros;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ej08 {
	
	public static void muestraSinEspacios(String nombre) {
		try {
			int aux = 0;
			BufferedReader br = new BufferedReader(new FileReader(nombre));
			while((aux = br.read()) != -1) {
				if((char) aux != 32) {
					System.out.print((char) aux);
				}
			}
			br.close();
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S" + e.getMessage());
		}
	}

	public static void main(String[] args) {
		String ruta = "FicherosRepaso/datos10.txt";
		muestraSinEspacios(ruta);

	}

}
