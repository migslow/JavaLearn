package repaso;

import java.sql.SQLException;
import java.util.ArrayList;

public class MainCoche {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosCoche bd = new AccesoBdatosCoche();
		bd.conectar();
		ArrayList<Coche> coches2 = bd.recorrerTodosLosRegistrosArray();
		System.out.println("Todos los registros de la BD:");
		for (Coche c : coches2) {
			System.out.println(c);
		}
		System.out.println("\nBusqueda por codigo: " + bd.busquedaPorCodigo(3));
		System.out.println("\nBusqueda por marca: " + bd.busquedaPorMarca("Toyota"));
		System.out.println("\nBusqueda por modelo: " + bd.busquedaPorModelo("A4"));
		System.out.println("\nBusqueda por propietario: " + bd.busquedaPorPropietario("Pedro Gomez"));
		System.out.println("\nBusqueda por cv: " + bd.busquedaPorCV(110));
		System.out.println("\nBusqueda por ArrayList por modelo: " + bd.busquedaPorModeloArray("civic"));
		System.out.println("\nBusqueda por caballos de potencia mayor que: ");
		ArrayList<Coche> c1 = bd.busquedaPorCVMayorQue(200);
		for (Coche c : c1) {
			System.out.println(c);
		}
		System.out.println("\nBusqueda por marca que empiece por: " + bd.busquedaPorMarcaArray2("F"));
		System.out.println("\nMedia de kilometros recorridos de todos los coches " + bd.mediaDeKilometrosRecorridos());
		System.out.println("\nMaximo de caballos de potencia que tiene un coche: " + bd.maxCV());
		System.out.println("\nBusqueda por modelo que contenga una letra: ");
		ArrayList<Coche> coche3 = bd.busquedaPorContieneModelo("C");
		for (Coche c : coche3) {
			System.out.println(c);
		}
		/*
		 * System.out.println("\nInsertar Coche: "); Coche coche1 = new Coche(11, "BMW",
		 * "E30", "Miguel Ovejero", 110, 12000);
		 * System.out.println(bd.insertarConBean1(coche1)); Coche coche2 = new Coche(12,
		 * "Toyota", "Supra", "Alberto Lores", 1200, 7000);
		 * System.out.println(bd.insertarConBean1(coche2));
		 * System.out.println("\nInsertar con bean: "); Coche cp1 = new Coche(2,
		 * "Ferrari", "LaFerrari", "Franchesco Birgolini", 1000, 1500);
		 * System.out.println(bd.insertarConBean3(cp1));
		 */

		System.out.println("\nActualizar marca: ");
		System.out.println(bd.actualizarMarca(13, "Opel"));
		
		System.out.println("\nActualizar marca con transacciones: ");
		System.out.println(bd.actualizarMarcaConTransacciones(9, "Audi Sport"));

		System.out.println("\nActualizar modelo: ");
		System.out.println(bd.actualizarModelo(13, "Astra"));
		
		System.out.println("\nActualizar por cv: ");
		System.out.println(bd.actualizarCv(4, 220));

		System.out.println("\nActualizar todos los campos de un coche: ");
		System.out.println(bd.actualizarTodosLosCampos(13, "Opel", "Astra", "Maria Pilar", 90, 210000));
		System.out.println("\nActualizar todos los campos de un coche con transacciones: ");
		System.out.println(bd.actualizarTodosLosCamposConTransacciones(6, "Nissan", "Skyline R34", "David Cano", 1300, 150000));

		System.out.println("\nEliminar un coche: ");
		System.out.println(bd.borrarCoche(1));
		
		System.out.println("\nEliminar un coche con transacciones: ");
		System.out.println(bd.borrarCocheConTransacciones(9));

		System.out.println("\nEliminar un coche por kilometros recorridos: ");
		System.out.println(bd.borrarCochePorKilometros(100000));

		System.out.println("\nFuncion media Kilometros: " + bd.funcionMediaKilometros());

	}

}
