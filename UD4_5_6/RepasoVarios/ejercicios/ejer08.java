package ejercicios;

import java.util.StringTokenizer;

public class ejer08 {

	public static void main(String[] args) {
		int contador = 0;
		String texto = "123 Main St, Springfield, IL 62704";
		
		StringTokenizer delimitador = new StringTokenizer(texto, ", ");
		while (delimitador.hasMoreElements()) {
			System.out.println("Particiones: " + delimitador.nextElement());
			contador++;
		}
		
		System.out.println("Hay " + contador + " palabras");

	}

}
