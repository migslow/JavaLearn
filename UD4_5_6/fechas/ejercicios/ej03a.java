package ejercicios;

import java.util.StringTokenizer;

public class ej03a {

	public static void main(String[] args) {
		String nombreCompleto = "Miguel Ovejero Piedrafita";
		
		StringTokenizer st = new StringTokenizer(nombreCompleto);
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken());
		}

	}

}
