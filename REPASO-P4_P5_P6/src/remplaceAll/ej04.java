package remplaceAll;

import java.util.Scanner;

public class ej04 {

	public static void main(String[] args) {
		String cadena = "En|un|lugar|de|la|mancha";
		String frase = cadena.replaceAll("\\|", " "); 
		System.out.println(frase);

	}

}
