import java.util.Scanner;

public class _06_100PrimerosNumerosPrimos {

	public static void main(String[] args) {
		int numero = 1, contadorPrimos = 0;
		boolean esPrimo;

		while (contadorPrimos <100) {
			esPrimo = true;
			for (int i = 2; i <= numero / 2; i++) {
				if (numero % i == 0) {
					esPrimo = false;
					break;
				}
			} // del for

			if (esPrimo) {// (esPrimo==true)
				System.out.print(numero + "-");
				contadorPrimos++;

			} 
			numero++;

		} // del while

	}

}
