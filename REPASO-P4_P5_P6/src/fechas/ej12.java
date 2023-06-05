package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ej12 {

	public static void main(String[] args) {
		GregorianCalendar fechaActual = new GregorianCalendar();
		GregorianCalendar fechaFutura = new GregorianCalendar();
		fechaFutura.set(Calendar.YEAR, 2024);
		fechaFutura.set(Calendar.MONTH, 12);
		fechaFutura.set(Calendar.DATE, 18);
		long calculo = fechaFutura.getTimeInMillis() - fechaActual.getTimeInMillis();
		long resultado = calculo / (1000 * 60 * 60 * 24);
		System.out.println("La diferencia entre dias son: " + resultado);

	}

}
