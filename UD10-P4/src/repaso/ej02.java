package repaso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ej02 {

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
		System.out.println("Intorduce el numero de la categorio: ");
		int c = s.nextInt();
		CallableStatement proc = conn.prepareCall("CALL productosCategoriaBajoMinimos(?)");
		proc.setInt(1, c);
		ResultSet rs = proc.executeQuery();
		if (rs.next()) {
			System.out.println("Nombre Producto - Precio - Existencias - Minimo");
			System.out.println("------------------------------------------------");
			System.out.println(rs.getString(1) + " | " + rs.getDouble(2) + " | " + rs.getInt(3) + " | " + rs.getInt(4));
			while(rs.next()) {
				System.out.println(rs.getString(1) + " | " + rs.getDouble(2) + " | " + rs.getInt(3) + " | " + rs.getInt(4));
			}
		} else {
			System.out.println("La categoria no existe");
		}
		rs.close();
		proc.close();
		conn.close();

	}

}
