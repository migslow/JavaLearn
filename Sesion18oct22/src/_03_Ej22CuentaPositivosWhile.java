
import java.util.Scanner;

public class _03_Ej22CuentaPositivosWhile {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.println("Por favor, vaya introduciendo n�meros y pulsando INTRO.");
		System.out.println("Para terminar, introduzca un n�mero negativo.");

		int numeroIntroducido, cuentaNumeros = 0, suma = 0;
		numeroIntroducido = s.nextInt();
		while (numeroIntroducido >= 0) {
			cuentaNumeros++; //
			suma += numeroIntroducido; // suma = suma + numeroIntroducido;
			numeroIntroducido = s.nextInt();
		}

		System.out.println("Has introducido " + (cuentaNumeros) + " n�meros positivos.");
		System.out.println("La suma total de ellos es " + (suma));
	}
}
