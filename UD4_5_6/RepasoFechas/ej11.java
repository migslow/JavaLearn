import java.time.LocalDate;

public class ej11 {
	public static void main(String[] args) {
		LocalDate horaActual = LocalDate.now();
		System.out.println("Hora actual: " + horaActual);
		LocalDate horaEspecifica = LocalDate.of(15, 30, 45);
		System.out.println("Hora específica: " + horaEspecifica);

	}
}
