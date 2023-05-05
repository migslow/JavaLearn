package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class AccesoBdatosLibro {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "libros";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta = null;
	}
	
	

}
