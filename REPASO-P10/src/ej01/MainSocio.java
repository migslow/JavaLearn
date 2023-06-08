package ej01;

import java.sql.SQLException;

public class MainSocio {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosBaloncesto bd = new AccesoBdatosBaloncesto();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(1248));
		System.out.println(bd.busquedaPorNombre("Bermúdez Espada, Ana María"));
		System.out.println(bd.insertarConBean(new Baloncesto(10, "Miguel", 165, 23, "Huesca")));
		System.out.println(bd.actualizarNombre(10, "Miguel Ovejero"));
		System.out.println(bd.borrarSocio(1240));
		System.out.println(bd.actualizarNombreConTransacciones(10, "Maria Lopez Morla"));
		System.out.println(bd.insertarConBeanTransacciones(new Baloncesto(20, "Jose", 181, 43, "Zaragoza")));

	}

}
