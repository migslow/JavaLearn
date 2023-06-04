package stringTokenizer;

import java.util.StringTokenizer;

public class ej05 {

	public static void main(String[] args) {
		String frase = "Hay'es'domingo";
		StringTokenizer f = new StringTokenizer(frase, "'");
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
		}

	}

}
