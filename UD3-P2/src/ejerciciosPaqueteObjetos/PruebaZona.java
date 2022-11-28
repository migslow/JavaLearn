package ejerciciosPaqueteObjetos;

import java.util.Scanner;

public class PruebaZona {

	public static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		Zona SalaPrincipal = new Zona(1000);
		Zona Compra_Venta = new Zona(200);
		Zona VIP = new Zona(25);

		int elegir = 0;
		do {
			System.out.println("Menu: ");
			System.out.println("1. Mostrar numero de entradas libres");
			System.out.println("2. Vender entradas");
			System.out.println("3. Salir");
			System.out.println("Elige opcion entre 1 y 3: ");
			elegir = s.nextInt();
			if (elegir == 1) {
				System.out.println("Sala Principal: " + SalaPrincipal.getEntradasPorVender());
				System.out.println("Compra-Venta: " + Compra_Venta.getEntradasPorVender());
				System.out.println("Vip: " + VIP.getEntradasPorVender());
				elegir = s.nextInt();
			}
			if (elegir == 2) {
				System.out.println("Para que zona quiereas las entradas: ");
				int zona = s.nextInt();
				System.out.println("Cuantas entradas quieres: ");
				int entradas = s.nextInt();
				if (zona == 1) {
					SalaPrincipal.vender(entradas);
				}

				if (zona == 2) {
					Compra_Venta.vender(entradas);
				}

				if (zona == 3) {
					VIP.vender(entradas);
				}
				elegir = s.nextInt();
			}
			if (elegir == 3) {
				System.out.println("Has salido del programa");
				System.exit(0);
			}
		} while (elegir <= 1 && elegir >= 3);
	}

}
