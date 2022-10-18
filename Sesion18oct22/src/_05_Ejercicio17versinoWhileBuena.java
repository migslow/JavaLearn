
import java.util.Scanner;

public class _05_Ejercicio17versinoWhileBuena {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numeroLeido, numeroAnterior = 0, contador = 0;
		boolean esCreciente = true;
		System.out.println("Introduce un número (finalizar con 0");
		numeroLeido = s.nextInt();
		while (numeroLeido != 0) {
			contador++;
			if (contador == 1) {
				numeroAnterior = numeroLeido;
			} else {
				if (numeroLeido < numeroAnterior) {
					esCreciente = false;
				}
				numeroAnterior = numeroLeido;
			}
			System.out.println("Introduce un número (finalizar con 0");
			numeroLeido = s.nextInt();
		} // del while
		if (contador <= 1) {
			System.out.println("No has llegado a introducir una serie");
			System.exit(1);
		}
		if (esCreciente == true) {
			System.out.println("Es creciente");
		} else {
			System.out.println("NO Es creciente");
		}
	}
}
