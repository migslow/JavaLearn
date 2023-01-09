package ejercicios;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class ej02c {

	public static void main(String[] args) {
		System.out.println("Dia de hoy: ");
		
		System.out.println("\nAño, mes y dia: ");
		LocalDate hoy2 = LocalDate.now();
        System.out.println(hoy2);
		
        System.out.println("\nHoras, minutos y segundos: ");
		LocalTime hoy1 = LocalTime.now();
        System.out.println(hoy1);
        

	}

}
