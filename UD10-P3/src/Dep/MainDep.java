package Dep;

import java.sql.SQLException;

public class MainDep {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBDDep bd = new AccesoBDDep();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(10));
		System.out.println("Busqueda por dname: " + bd.busquedaPorDname("Sales"));
		System.out.println("Busqueda por loc: " + bd.busquedaPorLoc("Dallas"));
		/*
		Dep d1 = new Dep(50, "SALES", "NEVADA");
		System.out.println(bd.insertarConBean(d1));
		*/
		/*
		Dep d2 = new Dep(60, "SALES", "LOS ANGELES");
		System.out.println(bd.insertarConBeanConTransacciones(d2));
		*/
		System.out.println("Actualizar el Loc " + bd.actualizarLoc(40, "LAS VEGAS"));
		System.out.println("Actualizar dname " + bd.actualizarDnameConTransacciones(30, "MANAGER"));
		System.out.println("Borrar empleado con transacciones: " + bd.borrarEmpleadoConTransacciones(30));
		System.out.println(bd.funcionActualizarNombreDepartamento(10, "COLORADO"));
	}

}
