package Sesion17oct22;
import java.util.Scanner;

public class _03NumerosPrimosv1_1 {

	public static void main(String[] args) {
		int numero, contador, i;
		Scanner s = new Scanner (System.in);
		System.out.println("Introduce n�mero");
		numero = s.nextInt();
		contador =0;
		i=1;
		while (i<=numero) {
			if (numero%i==0) {
				contador++;
			}
			i++;
		}// del while
		if (contador ==2)
			System.out.println("El n�mero " + numero + " es primo");
		else
			System.out.println("El n�mero " + numero + " No es primo");

	}

}
