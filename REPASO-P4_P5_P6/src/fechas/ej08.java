package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ej08 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar();
		gc.set(2021, 6, 21);
		System.out.println("La fecha es: " + gc.getTime());

		// Obtener dia de la semana
		int dia = gc.get(Calendar.DAY_OF_WEEK);
		System.out.println("El dia de la semana es: " + dia);

	}

}
