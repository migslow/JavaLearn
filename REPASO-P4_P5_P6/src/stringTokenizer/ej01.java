package stringTokenizer;

import java.util.StringTokenizer;

public class ej01 {

	public static void main(String[] args) {
		String lenguaje = "Hola como esta";
		StringTokenizer l = new StringTokenizer(lenguaje, " ");
		while (l.hasMoreElements()) {
			System.out.println("Particion: " + l.nextElement());
		}

	}

}
