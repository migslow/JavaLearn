package repaso;

import java.sql.SQLException;

public class Main3 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos3 bd = new AccesoBdatos3();
		bd.conectar();
		System.out.println("Busqueda por ID: ");
		System.out.println(bd.buscarPorID(2));
		System.out.println(bd.buscarPorID(100));
		
		System.out.println("\nBusqueda por titulo: ");
		System.out.println(bd.buscarPorTitulo("El Club de la Pelea"));
		System.out.println(bd.buscarPorTitulo("Mimado"));
		
		System.out.println("\nBusqueda por año: ");
		System.out.println(bd.buscarPorAnyoEstreno(1000));
		System.out.println(bd.buscarPorAnyoEstreno(1972));
		
		System.out.println("\nInsertar Pelicula: ");
		Pelicula p = new Pelicula(11, "Tu y yo", "Yo mismo", "Alberto Lores", 2023, "Miguel Ovejero");
		System.out.println(bd.insertarConBean(p));
		
		System.out.println("\nActualizar titulo: ");
		System.out.println(bd.actualizarTitulo(11, "Mil y una maravillas"));
		
		System.out.println("\nActualizar el titulo con transacciones: ");
		System.out.println(bd.actualizarTituloTransacciones(9, "Resaca en Budapest"));

		System.out.println("\nBorrarTitulo: ");
		System.out.println(bd.borrarTitulo("Interestelar"));
		
		System.out.println("\nActualizar con procedimiento: ");
		bd.procedimientoActualizar(5, "El peñas");
	}

}
