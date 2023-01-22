package ej17;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class HashSetVehiculo {

	static Scanner s = new Scanner(System.in);

	HashSet<Vehiculo> lista = new HashSet<Vehiculo>();

	public void listado() {
		boolean salir = false;
		while (!salir) {
			System.out.println(" INGRESE LA OPCION ");
			System.out.println(" 1 - Crear vehiculo ");
			System.out.println(" 2 - Listar vehiculos ingresados");
			System.out.println(" 0 - Salir ");

			int n = s.nextInt();

			switch (n) {
			case 1:
				Vehiculo a = new Vehiculo();
				System.out.println("Introduce la marca del vehiculo");
				String m = s.next();
				a.setMarca(m);
				System.out.println("Introduce la patente del vehiculo");
				String p = s.next();
				a.setMarca(m);
				System.out.println("Introduce el color del vehiculo");
				String c = s.next();
				a.setMarca(m);
				a.setPatente(p);
				a.setColor(c);

				System.out.println("Vehiculo Creado: ");
				System.out.println("Marca" + a.getMarca());
				System.out.println("Patente" + a.getPatente());
				System.out.println("Color" + a.getColor());

			case 2:
				for (Vehiculo v : lista) {
					System.out.println("Marca" + v.getMarca());
					System.out.println("Patente" + v.getPatente());
					System.out.println("Color" + v.getColor());
				}
			 case 0:
                 salir = true;
                 System.out.println("Saliendo del programa");
                 break;
			default:
				break;
			}
		}
	}

}
