
package ej05;

import java.sql.SQLException;

public class MainCiudad {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosCiudad bd = new AccesoBdatosCiudad();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(10));
	}
}
