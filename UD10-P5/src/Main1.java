import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main1 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "banco";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";

	public static void main(String[] args) throws ClassNotFoundException {
		Connection conn = null;
		Class.forName(driver);

		try {
			conn = DriverManager.getConnection(url, username, password);
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement(); // Solo de ejemplo. Utilizaremos siempre sentencias preparadas.
			stmt.executeUpdate("UPDATE cuentas_bancarias SET saldo = saldo - 200 WHERE idcuenta=1111");
			stmt.executeUpdate("UPDATE cuentas_bancarias SET saldo = saldo + 200 WHERE idcuenta=2222");
			stmt.close();
			conn.commit();
			conn.close();
		} catch (SQLException e) {

			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

		}
	}
}
