package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosVideojuegos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "videojuegos";
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

	public Videojuego busquedaPorId(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from videojuegos where ID=?");
			ps.setInt(1, numero);
			ResultSet rs = ps.executeQuery();
			Videojuego v = new Videojuego();
			if (rs.next()) {
				v.setId(rs.getInt(1));
				v.setTitulo(rs.getString(2));
				v.setDesarrollador(rs.getString(3));
				v.setGenero(rs.getString(4));
				v.setAnyoEstreno(rs.getInt(5));
				v.setMotorGrafico(rs.getString(6));
				v.setPlataformas(rs.getString(7));
				v.setPrecio(rs.getInt(8));
			} else {
				v = null;
			}
			ps.close();
			rs.close();
			return v;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Videojuego> busquedaPorIdArray(int numero) {
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from videojuegos where ID=?");
			ps.setInt(1, numero);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Videojuego v = new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				videojuegos.add(v);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return videojuegos;
	}

	public ArrayList<Videojuego> busquedaPorTitulo(String titulo) {
		ArrayList<Videojuego> videojuegos = new ArrayList<Videojuego>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from videojuegos where titulo=?");
			ps.setString(1, titulo);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Videojuego v = new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				videojuegos.add(v);
			}
			rs.close();
			conecta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return videojuegos;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
