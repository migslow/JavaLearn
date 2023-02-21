package repasoFicheros;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ej01 {

	public static void main(String[] args) {
		try {
			int aux;
			int suma = 0, contador = 0;
			FileReader fr = new FileReader("FicherosRepaso/datos.txt");
			while((aux = fr.read()) != -1){
				if(char(aux))
			}
		} catch (FileNotFoundException e) {
			System.out.println("No has escrito bien la ruta del fichero");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E/S" + e.getMessage());
		}

	}

}
