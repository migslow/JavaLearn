package ejercicios02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import ejercicios01.Socio;

public class ControlAccesoV2 {

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

	public String comprobarCredenciales(String usu, String pass) throws SQLException {
		PreparedStatement consulta = conecta
				.prepareStatement("select * from usuario where username = '" + usu + "' and password='" + pass + "'");
		ResultSet res = consulta.executeQuery();
		if (res.next()) {
			return res.getString(3);
		} else {
			return "No existe el Usuario / Contraseña";
		}

	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
