package ejercicios02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControlAcceso {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static Connection conecta;
	public static ResultSet res;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public static Usuario comprobarCredenciales(String usu, String pass) throws SQLException {
		try {
			PreparedStatement ps = conecta.prepareStatement("SELECT * FROM usuario WHERE username=? AND password=?");
			ps.setString(1, usu);
			ps.setString(2, pass);

			ResultSet rs = ps.executeQuery();
			Usuario u = null;
			if (rs.next()) {
				u = new Usuario(rs.getString(1), rs.getString(2), rs.getString(3));
			}
			rs.close();
			ps.close();
			return u;
		} finally {
			if (conecta != null) {
				conecta.close();
			}
		}

	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
