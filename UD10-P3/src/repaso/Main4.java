package repaso;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main4 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos4 bd = new AccesoBdatos4();
		bd.conectar();
		
		System.out.println("\nBusqueda por codigo: ");
		System.out.println(bd.busquedaPorCodigo(100));
		System.out.println(bd.busquedaPorCodigo(7788));
		
		System.out.println("\nBusqueda por oficio: ");
		System.out.println(bd.busquedaPorOficio("Profesor"));
		System.out.println(bd.busquedaPorOficio("Clerk"));
		
		java.util.Date fecha = null;
		java.sql.Date sqlFecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
		fecha = sdf.parse("2020/03/18");
		sqlFecha = new java.sql.Date(fecha.getTime());
		} catch (ParseException e) {
		System.out.println("Error al convertir fecha");
		}
		/*
		System.out.println("\nInsertar con bean: ");
		Empleado e1 = new Empleado(10, "CARRERA", "FOL", 7788, sqlFecha, 700, 0, 35);
		System.out.println(bd.insertarConBean(e1));
		*/
	}

}
