package kadumMVC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Bd {
	private String maquina = "localhost";
	private String usuario = "root";
	private String clave = "root";
	private int puerto = 3307;
	private String servidor = "";
	private static Connection conexion = null;

	// CONSTRUCTOR
	// Recibe el nombre de la base de datos
	Bd(String baseDatos) {
		this.servidor = "jdbc:mysql://" + this.maquina + ":" + this.puerto + "/" + baseDatos + "?useSSL=false"
				+ "&serverTimezone=CET";
		;

		// Registrar el driver
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			System.err.println("ERROR AL REGISTRAR EL DRIVER");
			System.exit(0); // parar la ejecuci�n
		}

		// Establecer la conexi�n con el servidor
		try {
			conexion = DriverManager.getConnection(this.servidor, this.usuario, this.clave);
		} catch (SQLException e) {
			System.err.println("ERROR AL CONECTAR CON EL SERVIDOR");
			System.out.println(e.getMessage());
			System.exit(0); // parar la ejecuci�n
		}
		System.out.println("Conectado a " + baseDatos);
	}

	// Devuelve el objeto Connection que se usar� en la clase Controller
	public static Connection getConexion() {
		return conexion;
	}

}