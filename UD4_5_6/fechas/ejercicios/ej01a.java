package ejercicios;

import java.util.Scanner;

public class ej01a {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Fecha f = new Fecha();
		
		f.leer();
		
		if(f.diaSemana() == 1) {
			System.out.println("Lunes");
		}
		if(f.diaSemana() == 2) {
			System.out.println("Martes");
		}
		if(f.diaSemana() == 3) {
			System.out.println("Miercoles");
		}
		if(f.diaSemana() == 4) {
			System.out.println("Jueves");
		}
		if(f.diaSemana() == 5) {
			System.out.println("Viernes");
		}
		if(f.diaSemana() == 6) {
			System.out.println("Sabado");
		}
		if(f.diaSemana() == 7) {
			System.out.println("Domingo");
		}
	}

}
