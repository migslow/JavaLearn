package ejercicios;

import java.io.FileWriter;
import java.io.IOException;

public class ej05b {
	public static void main(String[] args) throws IOException {
		String cad = args[0];
		char[] cadChar = cad.toCharArray();
		String rev = "";
		for (int i = cadChar.length - 1; i >= 0; i--) {
			rev = rev + cadChar[i];
		}
		String fich = args[1];
		FileWriter fw = new FileWriter(fich);
		fw.write(rev);
		fw.close();
	}

}
