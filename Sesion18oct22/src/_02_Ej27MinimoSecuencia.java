
import java.util.Scanner;

// Quedarse con el m�nimo
public class _02_Ej27MinimoSecuencia {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Por favor, vaya introduciendo n�meros y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un 0.");

		int numeroIntroducido, minimo;
		numeroIntroducido = s.nextInt();
		minimo = numeroIntroducido;
		while (numeroIntroducido != 0) {
			if (minimo > numeroIntroducido)
				minimo = numeroIntroducido;
			System.out.println("Siguiente:");
			numeroIntroducido = s.nextInt();
		}
		System.out.println();
		System.out.println("El m�nimo es: " + minimo);
		// Arreglarlo para que no imprima el 0
	}
}
