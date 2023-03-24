package repasoFicheros;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ej03 {

	public static void main(String[] args) {
		try {
			BufferedWriter bw = new BufferedWriter(new FileWriter("FicherosRepaso/datos3.txt"));
			BufferedReader br = new BufferedReader(new FileReader("FicherosRepaso/datos3.txt"));
			bw.write("Esto es una prueba usando Buffered");
			bw.newLine();
			bw.write("Seguimos usando Buffered");
			bw.flush();
			String aux;
			while((aux = br.readLine()) != null) {
				System.out.println(aux);
				aux = br.readLine();
			}
			bw.close();
			br.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E/S" + e.getMessage());
		}

	}

}
