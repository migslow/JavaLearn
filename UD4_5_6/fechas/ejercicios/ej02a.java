package ejercicios;

import java.util.Date;

public class ej02a {

	public static void main(String[] args) {
		Date hoy = new Date();
		System.out
				.println("Hoy es: " + hoy.getDate() + " del " + (hoy.getMonth() + 1) + " de " + (hoy.getYear() + 1900));
		System.out.println("Hora: " + hoy.getHours() + ":" + hoy.getMinutes() + ":" + hoy.getSeconds());

	}

}
