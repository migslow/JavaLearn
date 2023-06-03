package stringTokenizer;

import java.util.StringTokenizer;

public class ej03 {

	public static void main(String[] args) {
		String frase = "Java es divertido";
		StringTokenizer f = new StringTokenizer(frase, " ");
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
		}

	}

}
