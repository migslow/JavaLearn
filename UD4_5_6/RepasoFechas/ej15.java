import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ej15 {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.of(10, 30, 15);
		lt = lt.plusHours(2).plusMinutes(15);
		System.out.println("La fecha modificada es: " + lt.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

		LocalDate ld = LocalDate.of(2000, 01, 01);
		ld = ld.minusYears(10);
		System.out.println("La fecha modificada es: " + ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalDateTime ldt = LocalDateTime.of(2000, 01, 01, 10, 30, 15);
		ldt = ldt.minusDays(3).minusHours(2).minusMinutes(15);
		System.out.println("La fecha modificada es: " + ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

		LocalTime lt1 = LocalTime.of(10, 30, 15);
		lt1 = lt1.minusMinutes(30);
		System.out.println("La fecha modificada es: " + lt1.format(DateTimeFormatter.ofPattern("HH:mm:ss")));

	}

}
