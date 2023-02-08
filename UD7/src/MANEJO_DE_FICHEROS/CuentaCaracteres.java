package MANEJO_DE_FICHEROS;

import java.io.IOException;

class CuentaCaracteres {

	public static void main(String args[]) throws IOException {
		int contador = 0;
		while (System.in.read() != '\n')
			contador++;
		System.out.println();
		System.out.println("Tecleados " + contador + " caracteres.");
	}
}
