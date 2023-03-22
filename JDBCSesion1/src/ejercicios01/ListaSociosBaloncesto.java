package ejercicios01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.mysql.cj.jdbc.Driver;

public class ListaSociosBaloncesto {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3307";
	// private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" +
	// database + "?serverTimezone=CET";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		int contador = 0;
		Class.forName(driver);
		Connection con = DriverManager.getConnection(url, username, password);
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery("select * from socio;");
		System.out.println("LISTA SOCIOS: ");
		System.out.println("=================");
		while (rs.next()) {
			int id = rs.getInt("socioID");
			String nombre = rs.getString("nombre");
			int estatura = rs.getInt("estatura");
			int edad = rs.getInt("edad");
			String localidad = rs.getString("localidad");
			System.out.println("Id: " + id + " | Nombre: " + nombre + " | Estatura: " + estatura + " cm. | Edad: "
					+ edad + " años | Localidad: " + localidad);
			contador++;
		}
		System.out.println();
		System.out.println(
				"-------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("Total de Socios: " + contador);
		con.close();
		stmt.close();
		rs.close();
	}

}
