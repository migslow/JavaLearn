package ejercicios;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		java.util.Date fecha = null;
		java.sql.Date sqlFecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();

		System.out.println("Apartado C: ");
		System.out.println(abd.busquedaPorCodigo(100));
		System.out.println(abd.busquedaPorCodigo(7788));

		System.out.println("\nApartado D: ");
		System.out.println(abd.busquedaPorOficio("Profesor"));
		System.out.println(abd.busquedaPorOficio("CLERK"));

		System.out.println("\nApartado E: ");
		System.out.println("Empleados contratados antes del 22 de febrero de 1981");
		System.out.println("=====================================================");
		try {
			fecha = sdf.parse("1981/02/22");
			sqlFecha = new java.sql.Date(fecha.getTime());
		} catch (ParseException e) {
			System.out.println("Error al convertir fecha");
		}
		System.out.println(abd.busquedaPorAntiguedad(sqlFecha));

		System.out.println("\nApartado F: ");
		java.util.Date fecha1 = null;
		java.sql.Date sqlFecha1 = null;
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha1 = sdf1.parse("2020/03/18");
			sqlFecha1 = new java.sql.Date(fecha1.getTime());
		} catch (ParseException e) {
			System.out.println("Error al convertir fecha");
		}
		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, sqlFecha, 700, 0, 20);
		System.out.println(abd.insertarConBean(e1));

		System.out.println("\nApartado G: ");
		Empleado e2 = new Empleado(10, "CARRERA", "PROFESOR", 7788, sqlFecha, 700, 0, 20);
		System.out.println(abd.insertarConBean(e1));

		System.out.println("\nApartado I: ");
		System.out.println("Subir un 20% el salario de los empleados del Departamento 10");
		System.out.println(abd.actualizarSalarioconTransacciones(10, 0.2)); // →6
		//
		System.out.println("Subir un 15% el salario de los empleados del Departamento 44");
		System.out.println(abd.actualizarSalarioconTransacciones(44, 0.15));// →0
		// No existe el departamento 44

		System.out.println("\nApartado J: ");
		System.out.println(abd.borrarEmpleado(1));
		// 1 - Se ha borrado el empleado de código 1 de la tabla
		System.out.println(abd.borrarEmpleado(99));
		// 0 – No se ha borrado ninguno pues no existe el empleado 99
		System.out.println(abd.borrarEmpleado(7839));
		// 1 – Se ha borrado el empleado 7839.

		abd.desconectar();

	}

}
