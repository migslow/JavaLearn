package ejercicios2;

import java.util.Scanner;

// 8.- Se desea conocer el sueldo de un empleado cuyo pago es por hora y del modo siguiente;

// Las horas menores o igual a 20 se pagan a una tarifa de S/. 12 la hora.
// Las horas mayores de 20 y menor de 30 se pagan a una tarifa de S/. 15 la hora.
// Las horas mayores de 30 se pagan a una tarifa de S/. 25 la hora.

public class ej06 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el numero de horas que trabaja: ");
		int horas = s.nextInt();
		int pagarTarifa;
		if (horas <= 20) {
			pagarTarifa = horas * 12;
			System.out.println("El sueldo del empleado es: " + pagarTarifa);
		}
		if (horas > 20 && horas < 30) {
			pagarTarifa = horas * 15;
			System.out.println("El sueldo del empleado es: " + pagarTarifa);
		}
		if (horas > 30) {
			pagarTarifa = horas * 25;
			System.out.println("El sueldo del empleado es: " + pagarTarifa);
		}

	}

}
