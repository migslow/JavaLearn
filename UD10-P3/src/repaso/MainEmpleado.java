package repaso;

import java.sql.SQLException;

public class MainEmpleado {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosEmpleado bd = new AccesoBdatosEmpleado();
		bd.conectar();
		System.out.println("\nBuscar por codigo: ");
		System.out.println(bd.busquedaPorCodigo(7369));
		
		System.out.println("\nBusqueda por nombre: ");
		System.out.println(bd.busquedaPorNombre("JONES"));
		
		System.out.println("\nBusqueda por oficio: ");
		System.out.println(bd.busquedaPorOficio("SALESMAN"));
		
		System.out.println("\nBusqueda por codigo con array list: ");
		System.out.println(bd.busquedaPorCodigoArrayList(7844));
		
		System.out.println("\nBusqueda por nombre con array list: ");
		System.out.println(bd.busquedaPorNombre("Jones"));

		System.out.println("\nBusqueda por oficio con array list: ");
		System.out.println(bd.busquedaPorOficioArrayList("SALESMAN"));
	}

}
