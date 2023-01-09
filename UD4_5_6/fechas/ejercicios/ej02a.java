package ejercicios;

import java.util.Date;

public class ej02a {

	public static void main(String[] args) {
		Date hoy = new Date();
		System.out.println("Fecha de hoy" + hoy);
		System.out.println("Anyo: " + hoy.getYear());
		// System.out.println("Mes: " + hoy.);
		System.out.println("Semana: " + hoy.getMonth() + 7);
		System.out.println("Dia: " + hoy.getDay());
		System.out.println("Horas: " + hoy.getHours());
		System.out.println("Minutos: " + hoy.getMinutes());
		System.out.println("Segundos: " + hoy.getSeconds());

	}

}
