package metodos_alumnos;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n, contador = 0, suma = 0;
		System.out.println("Introduce cuantos numeros trinagulares desea obtener: ");
		n = s.nextInt();

		for (int i = 1; i <= n; i++) {
			suma = suma + i;
			contador++;
			System.out.println("El tringular de nº " + contador + " es " + suma);
		}
	}
}
