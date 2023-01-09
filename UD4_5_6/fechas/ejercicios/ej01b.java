package ejercicios;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class ej01b {

	public static void main(String[] args) throws ParseException {
		Scanner s = new Scanner(System.in);
		SimpleDateFormat formato = new SimpleDateFormat("dd/mm/yyyy");
		System.out.println("Introduce la fecha: ");
		Date f = formato.parse(s.nextLine());
		
		if(f.getDay() == 1) {
			System.out.println("Lunes");
		}
		if(f.getDay() == 2) {
			System.out.println("Martes");
		}
		if(f.getDay() == 3) {
			System.out.println("Miercoles");
		}
		if(f.getDay() == 4) {
			System.out.println("Jueves");
		}
		if(f.getDay() == 5) {
			System.out.println("Viernes");
		}
		if(f.getDay() == 6) {
			System.out.println("Sabado");
		}
		if(f.getDay() == 7) {
			System.out.println("Domingo");
		}

	}

}
