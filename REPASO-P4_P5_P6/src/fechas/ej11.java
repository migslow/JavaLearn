package fechas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ej11 {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.of(10, 30, 15);
		lt = lt.plusHours(3).plusMinutes(20);
		System.out.println("La fecha modificada es: " + lt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDate ld = LocalDate.of(2000, 01, 01);
		ld = ld.plusDays(3).minusYears(2);
		System.out.println("La fecha modificada es: " + ld.format(DateTimeFormatter.ofPattern("dd:MM:yyyy")));
		
		LocalDateTime ldt = LocalDateTime.of(2000, 01, 01, 10, 30, 15);
		ldt = ldt.minusMinutes(120).plusDays(6);
		System.out.println("La fecha modificada es: " + ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));
	}

}
