package repaso;

import java.sql.SQLException;

public class MainVideojuegos {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosVideojuegos bd = new AccesoBdatosVideojuegos();
		bd.conectar();
		// System.out.println(bd.busquedaPorId(3));
	
		System.out.println(bd.busquedaPorIdArray(2));
		
		System.out.println(bd.busquedaPorTitulo("Minecraft"));

	}

}
