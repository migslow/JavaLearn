package fechas;

import java.time.LocalTime;

public class ej09 {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		
		LocalTime lt2 = lt.plusHours(2).plusMinutes(30);
		System.out.println("La fecha es: " + lt2);
		
		// Diferencia de tiempo
		int tiempo = lt.getHour() - lt2.getHour();
		System.out.println("La diferencia en minutos: " + tiempo);

	}

}
