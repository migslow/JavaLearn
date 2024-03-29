
/*
 * Revisado para versi�n 8.0.19 de MySQL 
 * Alberto Carrera Mart�n
 * 16 marzo 2020
 */
import java.sql.*;

public class MainCorrecto {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "sample";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static Usuario Login(String uname, String pass) throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		Connection conn = DriverManager.getConnection(url, username, password);
		try {

			PreparedStatement ps = conn.prepareStatement("SELECT * FROM usuario WHERE username=? AND password=?");
			ps.setString(1, uname);
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
			if (conn != null) {
				conn.close();
			}
		}
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("Resultado l�nea 41 -> " + Login("Alberto", "11111"));
		System.out.println("Resultado l�nea 42 -> " + Login("Alberto", "12345"));
		System.out.println("Resultado l�nea 43 -> " + Login("x", "' OR ''='"));
		System.out.println("Resultado l�nea 44 -> " + Login("xxx", "' OR username='admin"));

	}

}
