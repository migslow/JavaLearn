package ejerciciosPaquetesExcepciones;

import java.util.Scanner;

public class ej02 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Introduce el correo electronico: ");
		String correo = s.next();
		enviarMensaje(correo);

	}

	public static void enviarMensaje(String correo) {
		try {
			if (correo.contains("@")) {
				System.out.println("El correo electronico valido");
			} else {
				System.out.println("No ha escrito bien la direccion de correo electronico");
			}
		} catch (Exception e) {
			System.out.println("Error");
		}

	}

}
