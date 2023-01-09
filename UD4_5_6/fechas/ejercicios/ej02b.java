package ejercicios;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ej02b {

	public static void main(String[] args) {
		GregorianCalendar f = new GregorianCalendar();

		System.out.println("Hoy es: " + f.get(Calendar.DAY_OF_MONTH) + " del " + (f.get(Calendar.MONTH) + 1) + " de "
				+ (f.get(Calendar.YEAR)));
		System.out.println(
				"Hora: " + f.get(Calendar.HOUR_OF_DAY) + ":" + f.get(Calendar.MINUTE) + ":" + f.get(Calendar.SECOND));

	}

}
