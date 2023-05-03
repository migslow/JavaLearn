package repaso;

import java.sql.SQLException;

public class MainCoche {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosCoche bd = new AccesoBdatosCoche();
		bd.conectar();
		System.out.println("Todos los registros de la BD: ");
		System.out.println(bd.recorrerTodosLosRegistros());
		System.out.println("\nBusqueda por codigo: " + bd.busquedaPorCodigo(2));
		System.out.println("\nBusqueda por marca: " + bd.busquedaPorMarca("Toyota"));
		System.out.println("\nBusqueda por modelo: " + bd.busquedaPorModelo("Fiesta"));

	}

}
