package Ex;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

public class MainEx {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		BDEX bd = new BDEX();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(7566));

		System.out.println("\nBusqueda por oficio: ");
		ArrayList<Ex> ex1 = bd.busquedaPorOficio("Salesman");
		for (Ex e : ex1) {
			System.out.println(e);
		}
		
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
		System.out.println("\nInsertar Con Bean: ");
		Ex ex2 = new Ex(100, "Miguel", "Alumno", 7645, sqlFecha, 2000, 100, 10);
		Ex ex3 = new Ex(101, "Alberot", "Alumno", 7345, sqlFecha, 2100, 101, 10);
		Ex ex4 = new Ex(102, "Luis", "Alumno", 7545, sqlFecha, 1900, 102, 10);
		Ex ex5 = new Ex(103, "Mario", "Alumno", 2545, sqlFecha, 1800, 103, 10);
		System.out.println(bd.insertarConBean(ex5));
		*/
		System.out.println("\nActualizar nombre: ");
		System.out.println(bd.actualizarNombre(100, "Yo"));
		
		System.out.println("\nBorrar por id: ");
		System.out.println(bd.borrarEmpleado(103));
		
		System.out.println("\nInsertar Con Transacciones: ");
		Ex ex6 = new Ex(104, "Casas", "Alumno", 1545, sqlFecha, 1850, 105, 10);
		System.out.println(bd.insertarConBeanConTransacciones(ex6));
		
		System.out.println("\nActualizar con transacciones: ");
		System.out.println(bd.actualizarNombreConTransacciones(7654, "Paula"));
		
		System.out.println("\nBorrar con transacciones: ");
		System.out.println(bd.borrarEmpleadoConTransacciones(104));
	}
}
