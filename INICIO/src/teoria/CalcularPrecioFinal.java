package teoria;

import java.util.Scanner;

public class CalcularPrecioFinal {
	/*
	 * Algoritmo CalcularPrecioConDescuento en Clase
	 * 
	 * @author Miguel Ovejero
	 * 
	 * @date 21/09/2022
	 * 
	 * Versión con entrada de datos por teclado.
	 * 
	 */

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		double precio, descuento;
		double calculoDescuento, calculoFinal;

		System.out.println("Introduce el precio del producto: ");
		precio = s.nextDouble();
		System.out.println("Introduce el descuento que se aplicará al producto (20%, 10%): ");
		descuento = s.nextDouble();

		System.out.println("------------------------------------------------------------");

		System.out.println("El precio del producto sin descuento es de: " + precio + "€");
		calculoDescuento = (descuento * precio) / 100;
		System.out.println(calculoDescuento);
		calculoFinal = precio - calculoDescuento;
		System.out.println("El precio del producto con el 20% de descuento es de: " + calculoFinal + "€");
	}

}
