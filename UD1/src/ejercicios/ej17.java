package ejercicios;

import java.util.Scanner;

public class ej17 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Cantidad prestada: ");
		double x = s.nextDouble();
		System.out.println("Inter�s anual: ");
		double y = s.nextDouble();
		System.out.println("Duracion del prestamo en a�os: ");
		int z = s.nextInt();
		double intMes = y / 100 / 12;
		double pagoMes = ((x * intMes) / (1 - (1 / (double) (Math.pow((1 + intMes), (z * 12))))));
		System.out.println("RESULTADO DE LA OPERACION:  ");
		System.out.println("Cantidad prestada:  " + x + "Euros");
		System.out.println("Inter�s anual: " + y + "%");
		System.out.println("Duraci�n en a�os del pr�stamo " + z);
		System.out.println("N�mero de pagos: " + (z * 12));
		System.out.printf("Pago mensual: %.2f \n", pagoMes);
		System.out.printf("Cantidad total a pagar: %.2f Euros  ", (pagoMes * (z * 12)));
	}

}
