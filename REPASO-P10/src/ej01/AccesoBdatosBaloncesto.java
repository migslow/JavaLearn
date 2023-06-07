package ej01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosBaloncesto {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "baloncesto";
	private static String hostname = "localhost";
	private static String port = "3307";
	private static String url = "jdbc:mysql://" + hostname + ":" + port + "/" + database
			+ "?serverTimezone=Europe/Madrid";
	private static String username = "root";
	private static String password = "root";
	private Connection conecta;

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}
	
	public Baloncesto busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from baloncesto where socioID =?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Baloncesto b = new Baloncesto();
			if(rs.next()) {
				b.setSocioID(rs.getInt(1));
				b.setNombre(rs.getString(2));
				b.setEstatura(rs.getInt(3));
				b.setEdad(rs.getInt(4));
				b.setLocalidad(rs.getString(5));
			} else {
				b = null;
			}
			return b;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public ArrayList<Baloncesto> busquedaPorOficio (String oficio){
		ArrayList<Baloncesto> lista = new ArrayList<Baloncesto>();
		try {
			
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
