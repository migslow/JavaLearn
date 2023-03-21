package ejercicios;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import paquete1_mejorado.Libro;

public class AccesoBdatos {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public static ArrayList<Socio> consultarPorLocalidad(String nombre) {
		ArrayList<Socio> lista = new ArrayList<Socio>();
		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio WHERE localidad = '" + nombre + "'");

			while (reg.next()) {
				Socio socio = new Socio(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(socio);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("error en la consulta" + e.getMessage());
		}
		return lista;
	}

	public static ArrayList<Socio> consultarTodos() {
		ArrayList<Socio> lista = new ArrayList<Socio>();

		try {
			Statement consulta = conecta.createStatement();
			ResultSet reg = consulta.executeQuery("SELECT * FROM socio");
			while (reg.next()) {
				Socio socio = new Socio(reg.getInt(1), reg.getString(2), reg.getInt(3), reg.getInt(4),
						reg.getString(5));
				lista.add(socio);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
		}
		return lista;

	}

	public ResultSet consultarTodosResultSet() throws SQLException {
		Statement consulta = conecta.createStatement();
		return consulta.executeQuery("SELECT * FROM socio");
	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
