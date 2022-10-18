import java.util.Scanner;

public class _05NumerosPrimosv4 {

	public static void main(String[] args) {
		int numero;
		boolean esPrimo;
		Scanner s = new Scanner (System.in);
		System.out.println("Introduce número");
		numero = s.nextInt();
		esPrimo=true;
		for (int i=2; i<=numero/2;i++) {
			if (numero%i==0) {
				esPrimo=false;
				break;
			}
		}// del for
		if (esPrimo) //(esPrimo==true)
			System.out.println("El número " + numero + " es primo");
		else
			System.out.println("El número " + numero + " No es primo");

	}

}
