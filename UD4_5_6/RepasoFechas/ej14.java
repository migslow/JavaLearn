import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ej14 {

	public static void main(String[] args) {
		LocalTime lt = LocalTime.now();
		System.out.println("La hora actual en fromato 24 horas es: " + lt);

		LocalDate ld = LocalDate.now();
		System.out.println("La fecha actual es: " + ld.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

		LocalDateTime ldt = LocalDateTime.now();
		System.out.println("La fecha actual es: " + ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss")));

		LocalDate ld1 = LocalDate.of(2000, 01, 01);
		ld1.plusDays(5);
		System.out.println("La fecha modificada es: " + ldt.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
	}

}
