package repaso;

import java.sql.SQLException;

public class Main2 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos2 bd = new AccesoBdatos2();
		bd.conectar();
		System.out.println("\nBuscar por condigo: ");
		System.out.println(bd.buscarPorCodigo(100));
		System.out.println(bd.buscarPorCodigo(7788));

	}

}
