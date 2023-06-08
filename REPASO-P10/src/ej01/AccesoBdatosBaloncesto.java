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
			PreparedStatement consulta = conecta.prepareStatement("select * from socio where socioID =?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Baloncesto b = new Baloncesto();
			if (rs.next()) {
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

	public ArrayList<Baloncesto> busquedaPorNombre(String nombre) {
		ArrayList<Baloncesto> lista = new ArrayList<Baloncesto>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from socio where nombre=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Baloncesto b = new Baloncesto(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
						rs.getString(5));
				lista.add(b);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return lista;
	}

	public int insertarConBean(Baloncesto socio) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into socio values (?,?,?,?,?)");
			insertar.setInt(1, socio.getSocioID());
			insertar.setString(2, socio.getNombre());
			insertar.setInt(3, socio.getEstatura());
			insertar.setInt(4, socio.getEdad());
			insertar.setString(5, socio.getLocalidad());
			return insertar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 1062;
	}
	
	public int insertarConBeanTransacciones(Baloncesto socio) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement insertar = conecta.prepareStatement("insert into socio values (?,?,?,?,?)");
			insertar.setInt(1, socio.getSocioID());
			insertar.setString(2, socio.getNombre());
			insertar.setInt(3, socio.getEstatura());
			insertar.setInt(4, socio.getEdad());
			insertar.setString(5, socio.getLocalidad());
			int filas = insertar.executeUpdate();
			conecta.commit();
			return filas;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return 1062;
	}

	public int actualizarNombre(int id, String nombre) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update socio set nombre=? where socioID=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			return actualizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int actualizarNombreConTransacciones(int id, String nombre) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement actualizar = conecta.prepareStatement("update socio set nombre=? where socioID=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			int filas = actualizar.executeUpdate();
			conecta.commit();
			return filas;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return 0;
	}

	public int borrarSocio(int id) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from socio where socioID=?");
			eliminar.setInt(1, id);
			return eliminar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
			return e.getErrorCode();
		}
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
