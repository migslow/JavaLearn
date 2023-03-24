package repasoFicheros;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej02 {

	public static void main(String[] args) {
		try {
			FileWriter fw = new FileWriter("FicherosRepaso/datos2.txt");
			fw.write("Esto es una prueba");
			fw.write(97);
			fw.close();
			FileReader fr = new FileReader("FicherosRepaso/datos2.txt");
			int aux;
			while ((aux = fr.read()) != -1) {
				System.out.println((char) aux);
				aux = fr.read();
			}
			fr.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
