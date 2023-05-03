package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosCoche {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "vehiculos";
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

	public Coche recorrerTodosLosRegistros() {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from Coches");
			Coche c = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setPropietario(rs.getString(4));
				c.setCv(rs.getInt(5));
				c.setKilometrosRecorridos(rs.getInt(6));
			}
			rs.close();
			ps.close();
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public Coche busquedaPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coches where Id=?");
			ps.setInt(1, numero);
			Coche v = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				v.setId(rs.getInt(1));
				v.setMarca(rs.getString(2));
				v.setModelo(rs.getString(3));
				v.setPropietario(rs.getString(4));
				v.setCv(rs.getInt(5));
				v.setKilometrosRecorridos(rs.getInt(6));
			} else {
				v = null;
			}
			rs.close();
			ps.close();
			return v;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public Coche busquedaPorMarca(String marca) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from Coches where marca=?");
			ps.setString(1, marca);
			Coche c = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setPropietario(rs.getString(4));
				c.setCv(rs.getInt(5));
				c.setKilometrosRecorridos(rs.getInt(6));
			} else {
				c = null;
			}
			rs.close();
			ps.close();
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> busquedaPorModelo(String modelo) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from Coches where modelo=?");
			ps.setString(1, modelo);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				coches.add(c);
			}
			rs.close();
			ps.close();
			conecta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return coches;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
