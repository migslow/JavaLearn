package repaso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class ej01 {
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
		System.out.println("Introduce el numero del pedido: ");
		int p = s.nextInt();
		CallableStatement fuct = conn.prepareCall("select importePedido(?)");
		fuct.setInt(1, p);
		ResultSet rs = fuct.executeQuery();
		int numero = 0;
		if (rs.next()) {
			numero = rs.getInt(1);
			System.out.println("El total del pedido " + p + " es " + numero);
		} else {
			System.out.println("El numero del pedido " + p + " no existe");
		}
		rs.close();
		fuct.close();
		conn.close();

	}

}
