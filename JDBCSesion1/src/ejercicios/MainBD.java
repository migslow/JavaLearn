package ejercicios;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class MainBD {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws SQLException {
		AccesoBdatos bd = new AccesoBdatos();

		try {
			bd.conectar();
		} catch (ClassNotFoundException | SQLException e) {
			System.out.println("NO SE PUDO ESTABLECER CONEXI�N");
			System.exit(-1);
		}

		System.out.println("Introduce el nombre de la localidad a buscar (Tiene que ser exacta al escribirla ): ");
		String nombreLocalidad = s.nextLine();
		ArrayList<Socio> todosSocios1 = bd.consultarPorLocalidad(nombreLocalidad);
		if (todosSocios1.size() != 0) {
			System.out.println("Listado de todos los socios: ");
			for (Socio l : todosSocios1)
				System.out.println(l);
		}

		ArrayList<Socio> todosSocios2 = bd.consultarTodos();
		if (todosSocios2.size() != 0) {
			System.out.println("\nListado de todos los socios");
			for (Socio l : todosSocios2)
				System.out.println(l);
		} else
			System.out.println("Lista de todos los libros vacia");
		
		ResultSet todosSocios3 = bd.consultarTodosResultSet();
		

		try {
			bd.desconectar();
		} catch (SQLException e) {
			System.out.println("NO SE PUDO DESCONECTAR - NO SE LLEG� A ESTABLECER CONEXI�N");
			System.exit(-1);
		}
	}

}
