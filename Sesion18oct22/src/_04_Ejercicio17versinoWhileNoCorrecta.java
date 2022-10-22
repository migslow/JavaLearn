
import java.util.Scanner;

public class _04_Ejercicio17versinoWhileNoCorrecta {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numeroLeido, numeroAnterior = 0, contador = 0;
		boolean esCreciente = true;
		while (true) {
			System.out.println("Introduce un n�mero (finalizar con 0");
			numeroLeido = s.nextInt();
			if (numeroLeido == 0) {
				break;
			}
			contador++;
			if (contador == 1) {
				numeroAnterior = numeroLeido;
			} else {
				if (numeroLeido < numeroAnterior) {
					esCreciente = false;
				}
				numeroAnterior = numeroLeido;
			}
		} // Del While
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
