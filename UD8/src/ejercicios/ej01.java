package ejercicios;

import java.util.Scanner;

public class ej01 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean continuar = true;
		while (continuar) {
			System.out.println("\n============MENU============");
			System.out.println("1. Validar Telefono");
			System.out.println("2. Validar Telefono Internacional");
			System.out.println("3. Validar Código Postal");
			System.out.println("4. Validar Fecha formato dd/mm/aaaa");
			System.out.println("5. Salir");

			System.out.println("\nIntroduce un numero entre 1 y 5: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				// Apartado A
				System.out.println("\nIntroduce el numero de telefono: ");
				String cadena1 = s.next();
				if (cadena1.matches("[\\d]{9}")) {
					System.out.println("El numero de telefono es valido");
				} else {
					System.out.println("El numero de telefono no es valido");
				}
				break;
			case 2:
				// Apartado B
				System.out.println("\nIntroduce el numero de telefono internacional: ");
				String cadena2 = s.next();
				if (cadena2.matches("\\(\\+\\d{2,3}\\)\\d{9}")) {
					System.out.println("El numero de telefono internacional es valido");
				} else {
					System.out.println("El numero de telefono internacional no es valido");
				}
				break;
			case 3:
				// Apartado C
				System.out.println("\nIntroduce el numero postal: ");
				String cadena3 = s.next();
				if (cadena3.matches("[\\d]{5}")) {
					System.out.println("El codigo postal es valido");
				} else {
					System.out.println("El codigo postal no es valido");
				}
				break;
			case 4:
				// Apartado D
				System.out.println("\nIntroduce la fecha en formato dd/mm/aaaa: ");
				String cadena4 = s.next();
				if (cadena4.matches("(([0][1-9])|([1-2][0-9])|([3][0-1]))/(([0][1-9])|([1][0-2]))/([0-9]{4})" + "")) {
					System.out.println("La fecha es valida");
				} else {
					System.out.println("La fecha no es valida");
				}
				break;
			case 5:
				System.exit(-1);
			default:
				System.out.println("No has introducido un numero entre el 1 y el 5");
				break;
			}

		}
	}

}
