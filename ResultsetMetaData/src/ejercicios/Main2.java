package ejercicios;

import java.sql.*;
// https://docs.oracle.com/en/java/javase/14/docs/api/java.sql/java/sql/ResultSetMetaData.html
// Alberto Carrera Mart�n - Abril 2020

public class Main2 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "empleados";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database + "?useSSL=false"
			+ "&serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conexion = DriverManager.getConnection(url, username, password);
		PreparedStatement ps = conexion.prepareStatement("SELECT * FROM empleados WHERE dpto=?");
		ps.setInt(1, 10);
		ResultSet rs = ps.executeQuery();

		while (rs.next()) {
			for (int x = 1; x <= rs.getMetaData().getColumnCount(); x++)
				System.out.print(rs.getString(x) + "\t");
		}
		System.out.println("--------------");
		for (int x = 1; x <= rs.getMetaData().getColumnCount(); x++) {
			System.out.print(rs.getMetaData().getColumnName(x) + " - " + rs.getMetaData().getColumnTypeName(x) + " - "
					+ rs.getMetaData().getColumnDisplaySize(x));

			System.out.println(" ");
		}
		ps.close();
		rs.close();
		conexion.close();
	}
}
