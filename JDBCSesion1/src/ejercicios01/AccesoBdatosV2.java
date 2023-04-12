package ejercicios01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class AccesoBdatosV2 {

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
			PreparedStatement consulta = conecta
					.prepareStatement("SELECT * FROM socio WHERE localidad = '" + nombre + "'");
			ResultSet reg = consulta.executeQuery();

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
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM socio");
			ResultSet reg = consulta.executeQuery();
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
		PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM socio");
		return consulta.executeQuery();
	}

	public static void imprimirDatosResultSet(ResultSet rs) throws SQLException {
		while (rs.next()) {
			System.out.println(rs.getInt(1) + " - " + rs.getString(2) + " - " + rs.getInt(3) + " - " + rs.getInt(4)
					+ " - " + rs.getString(5));
		}
	}

	public void desconectar() throws SQLException {
		if (conecta != null) {
			conecta.close();
		}
	}

}
