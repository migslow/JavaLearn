package Sesion17oct22;
import java.util.Scanner;

public class _04NumerosPrimosv3 {

	public static void main(String[] args) {
		int numero, contador;
		Scanner s = new Scanner (System.in);
		System.out.println("Introduce n�mero");
		numero = s.nextInt();
		contador =0;
		for (int i=2; i<=numero/2;i++) {
			if (numero%i==0) {
				contador++;
			}
		}// del for
		if (contador ==0)
			System.out.println("El n�mero " + numero + " es primo");
		else
			System.out.println("El n�mero " + numero + " No es primo");

	}

}
