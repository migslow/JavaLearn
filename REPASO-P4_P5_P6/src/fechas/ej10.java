package fechas;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class ej10 {

	public static void main(String[] args) {
		GregorianCalendar gc = new GregorianCalendar(2000, 01, 01);
		System.out.println("La fecha es: " + gc.get(Calendar.DATE) + "/" + (gc.get(Calendar.MONTH) + 1) + "/"
				+ gc.get(Calendar.YEAR));
		
		GregorianCalendar gc2 = new GregorianCalendar(2000, 01, 01, 12, 00, 00);
		gc2.add(Calendar.HOUR, -5);
		System.out.println("La fecha es: " + gc2.getTime());
		
		
	}

}
