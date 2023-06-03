package fechas;

import java.util.Date;

public class ej02 {

	public static void main(String[] args) {
		Date d1 = new Date(116, 5, 3);
		Date d2 = new Date();

		long resultado = d2.getTime() - d1.getTime();
		long calculo = resultado / (24 * 60 * 60 * 1000);
		System.out.println("La diferencia es: " + calculo);

	}

}
