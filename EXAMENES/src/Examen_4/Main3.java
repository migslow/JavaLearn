package Examen_4;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main3 {

	public static void main(String[] args) {

		System.out.println("Primer resultado: ");

		LocalDateTime fechaHuesca1 = LocalDateTime.now();

		System.out.println("En Huesca es: " + fechaHuesca1.getDayOfMonth() + "/" + fechaHuesca1.getMonthValue() + "/"
				+ fechaHuesca1.getYear() + " - Hora local: " + fechaHuesca1.getHour() + " horas");

		fechaHuesca1 = fechaHuesca1.plusHours(10);
		System.out.println("En Sydney es: " + fechaHuesca1.getDayOfMonth() + "/" + fechaHuesca1.getMonthValue() + "/"
				+ fechaHuesca1.getYear() + " - Hora local: " + fechaHuesca1.getHour() + " horas");

		System.out.println("\nSegundo resultado: ");

		LocalDateTime fechaHuesca2 = LocalDateTime.of(2023, 01, 03, 23, 01);

		System.out.println("En Huesca es: " + fechaHuesca2.getDayOfMonth() + "/" + fechaHuesca2.getMonthValue() + "/"
				+ fechaHuesca2.getYear() + " - Hora local: " + fechaHuesca2.getHour() + " horas");

		fechaHuesca2 = fechaHuesca2.plusHours(10);
		System.out.println("En Sydney es: " + fechaHuesca2.getDayOfMonth() + "/" + fechaHuesca2.getMonthValue() + "/"
				+ fechaHuesca2.getYear() + " - Hora local: " + fechaHuesca2.getHour() + " horas");
	}

}
