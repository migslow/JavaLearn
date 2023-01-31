import java.time.LocalTime;

public class ej10 {

	public static void main(String[] args) {
		LocalTime horaActual = LocalTime.now();
		System.out.println("Hora actual: " + horaActual);
		LocalTime horaEspecifica = LocalTime.of(15, 30, 45);
		System.out.println("Hora específica: " + horaEspecifica);

	}

}
