package Sesion_03;

import java.sql.SQLException;

public class MainDep {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosDepartamento bd = new AccesoBdatosDepartamento();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(10));
		System.out.println(bd.busquedaPorDname("DAM1"));
		System.out.println(bd.insertarConBean(new Departamento(70, "a", "a")));
		System.out.println(bd.actualizarDname(10, "dam1"));
		System.out.println(bd.borrarDepartamento(70));
	}

}
