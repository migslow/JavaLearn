package repasoFicheros;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej04 {

	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("FicherosRepaso/datos5.txt");
			FileInputStream fis = new FileInputStream("Imagenes/calculadora.jpg");
			int aux;
			while((aux = fis.read()) != -1) {
				System.out.println((char) aux);
				aux = fis.read();
			}
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E/S" + e.getMessage());
		}

	}

}
