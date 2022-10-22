import java.util.Scanner;

public class _02NumerosPrimosv1 {

	public static void main(String[] args) {
		int numero, contador;
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce n�mero");
		numero = s.nextInt();
		contador = 0;
		for (int i = 1; i <= numero; i++) {
			if (numero % i == 0) {
				contador++;
			}
		} // del for
		if (contador == 2)
			System.out.println("El n�mero " + numero + " es primo");
		else
			System.out.println("El n�mero " + numero + " No es primo");

	}

}
