package repaso;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class MainEmpleado {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosEmpleado bd = new AccesoBdatosEmpleado();
		bd.conectar();
		System.out.println("\nBuscar por codigo: ");
		System.out.println(bd.busquedaPorCodigo(7369));

		System.out.println("\nBusqueda por nombre: ");
		System.out.println(bd.busquedaPorNombre("JONES"));

		System.out.println("\nBusqueda por oficio: ");
		System.out.println(bd.busquedaPorOficio("SALESMAN"));

		System.out.println("\nBusqueda por salario: ");
		System.out.println(bd.busquedaPorSalario(800));

		System.out.println("\nBusqueda por codigo con array list: ");
		System.out.println(bd.busquedaPorCodigoArrayList(7844));

		System.out.println("\nBusqueda por nombre con array list: ");
		System.out.println(bd.busquedaPorNombre("Jones"));

		System.out.println("\nBusqueda por oficio con array list: ");
		System.out.println(bd.busquedaPorOficioArrayList("SALESMAN"));

		System.out.println("\nBusqueda por salario con array list: ");
		System.out.println(bd.busquedaPorSalarioArrayList(1500));
		/*
		System.out.println("\nIntroduce el salario que quieres buscar: ");
		double salario = s.nextDouble();
		System.out.println("\nBusqueda por salario menor que: ");
		System.out.println(bd.busquedaPorSalarioMenorQue(salario));
	*/
		System.out.println("\nInsertar empleado: ");
		java.util.Date fecha = null;
		java.sql.Date sqlFecha = null;
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		try {
			fecha = sdf.parse("2020/03/18");
			sqlFecha = new java.sql.Date(fecha.getTime());
		} catch (ParseException e) {
			System.out.println("Error al convertir fecha");
		}
		Empleado e1 = new Empleado(1, "CARRERA", "PROFESOR", 7788, sqlFecha, 700, 0, 20);
		System.out.println(bd.insertarConBean(e1));

		System.out.println("\nActualizar salario: ");
		System.out.println(bd.actualizarSalario(20, 1));
		
		System.out.println("\nActualizar nombre: ");
		System.out.println(bd.actualizarNombre(7566, "Alberto"));

		System.out.println("\nActualizar salario con transacciones: ");
		System.out.println(bd.actualizarSalario(10, 5));
		
		System.out.println("\nActualizar nombre con transacciones: ");
		System.out.println(bd.actualizarNombreConTransacciones(20, "Alberto Carrera"));

		System.out.println("\nBorrar empleado: ");
		System.out.println(bd.borrarEmpleadoPorCodigo(7369));
		
		System.out.println("\nFuncion mysql actualizar nombre: ");
		System.out.println(bd.funcionActualizarNombre(7499, "Lola"));
	}

}
