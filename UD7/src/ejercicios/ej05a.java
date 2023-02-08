package ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class ej05a {

	public static void main(String[] args) throws IOException {
		String cad = args[0];
		StringBuilder builder = new StringBuilder(cad);
		String cadRev = builder.reverse().toString();
		String fich = args[1];
		FileWriter fw = new FileWriter(fich);
		fw.write(cadRev);
		fw.close();

	}

}
