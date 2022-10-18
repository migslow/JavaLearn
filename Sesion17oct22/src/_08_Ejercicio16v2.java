import java.util.Scanner;
public class _08_Ejercicio16v2 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int numero, suma = 0;
		System.out.println("Introduzca el número");
		numero = s.nextInt();
		if (numero <0) {
			System.out.println("El número debe ser positivo");
			System.exit(-1);
		}
		while (numero > 0) {
			suma = suma + (numero % 10);
			numero = numero / 10;
		}
		System.out.println("La suma vale: " + suma);
	}
}