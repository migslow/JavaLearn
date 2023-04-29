package repaso;

import java.sql.SQLException;

public class MainVideojuegos {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosVideojuegos bd = new AccesoBdatosVideojuegos();
		bd.conectar();
		System.out.println(bd.busquedaPorId(3));

		System.out.println(bd.busquedaPorIdArray(2));

		System.out.println(bd.busquedaPorTitulo("Minecraft"));

		System.out.println("\nBusqueda por anyo: ");
		System.out.println(bd.busquedaPorAnyo(2016));

		System.out.println("\nInsertar videojuego: ");
		Videojuego v1 = new Videojuego(11, "Las vegas city", "Yo mismo", "Accion", 2023, "Unreal Engine 5", "PC", 79);
		System.out.println(bd.insertarConBean(v1));

		System.out.println("\nActualizar titulo: ");
		System.out.println(bd.actualizarTitulo(2, "Super Luigi bros"));
		
		System.out.println("\nBorrar por titulo: ");
		System.out.println(bd.borrarTitulo("Minecraft"));

	}

}
