package ejercicios02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ejercicios01.Socio;

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
	static ResultSet res;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public String comprobarCredenciales(String usu, String pass) throws SQLException {
		Statement consulta = conecta.createStatement();
		res = consulta
				.executeQuery("Select * from usuario where username = '" + usu + "' and password = '" + pass + "'");
		if (res.next()) {
			return res.getString(3);
		} else {
			return "Usuario no encontrado";
		}

	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
