package ejercicios;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Types;
import java.util.Scanner;

public class ej03 {

	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "pedidos";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		System.out.println("Introduce el numero de la categoria: ");
		int c = s.nextInt();
		System.out.println("Introduce el porcentaje: ");
		int p = s.nextInt();
		CallableStatement proc = conn.prepareCall("CALL incrementarPrecioCategoria(?, ?, ?)");
		proc.setInt(1, c);
		proc.setInt(2, p);
		proc.registerOutParameter(3, Types.DECIMAL);
		proc.executeUpdate();
		int resultado = proc.getInt(3);
		if (resultado > 0) {
			System.out.println(
					"Se incremento el precio de " + p + " para " + resultado + " producto de la categorio: " + c);
		} else {
			System.out.println("No se actualizo ningun producto de la categorio: " + c);
		}
		proc.close();
		conn.close();

	}

}
