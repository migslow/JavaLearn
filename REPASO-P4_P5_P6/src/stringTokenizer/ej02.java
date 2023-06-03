package stringTokenizer;

import java.util.StringTokenizer;

public class ej02 {

	public static void main(String[] args) {
		String frase = "Buenos dias miguel";
		StringTokenizer f = new StringTokenizer(frase, " ");
		while (f.hasMoreElements()) {
			System.out.println(f.nextElement());
		}

	}

}
