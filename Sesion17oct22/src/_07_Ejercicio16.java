import java.util.Scanner;

public class _07_Ejercicio16 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero, suma = 0;
		System.out.println("Introduzca el n�mero");
		numero = s.nextInt();
		if (numero < 0) {
			System.out.println("El n�mero debe ser positivo");
			System.exit(-1);
		}
		while (numero >= 10) {
			suma = suma + (numero % 10);
			numero = numero / 10;
		}
		suma = suma + numero;
		System.out.println("La suma vale: " + suma);
	}
}