package stringTokenizer;

import java.util.StringTokenizer;

public class ej04 {

	public static void main(String[] args) {
		String frase = "Me,gusta,programar";
		StringTokenizer f = new StringTokenizer(frase, ",");
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
		}

	}

}
