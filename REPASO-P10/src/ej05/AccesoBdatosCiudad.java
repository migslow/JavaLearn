package ej05;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosCiudad {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "world";
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

	public Ciudad busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from city where ID=?");
			consulta.setInt(1, numero);
			Ciudad c = new Ciudad();
			ResultSet rs = consulta.executeQuery();
			if (rs.next()) {
				c.setID(rs.getInt(1));
				c.setName(rs.getString(2));
				c.setCountryCode(rs.getString(3));
				c.setDistrict(rs.getString(4));
				c.setPopulation(rs.getInt(5));
			} else {
				c = null;
			}
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Ciudad> busquedaPorNombre(String nombre) {
		ArrayList<Ciudad> lista = new ArrayList<Ciudad>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from city where name=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Ciudad c = new Ciudad(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
				lista.add(c);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return lista;
	}

	public int insertarConBean(Ciudad city) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into city values(?,?,?,?,?)");
			insertar.setInt(1, city.getID());
			insertar.setString(2, city.getName());
			insertar.setString(3, city.getCountryCode());
			insertar.setString(4, city.getDistrict());
			insertar.setInt(5, city.getPopulation());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema " + e.getErrorCode());
			e.printStackTrace();
		}
		return 1062;
	}

	public int actualizarNombre(int id, String nombre) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update city set name = ? where ID=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			actualizar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int borrarCiudad(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from city where ID=?");
			eliminar.setInt(1, numero);
			eliminar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int insertarConBeanConTransacciones(Ciudad city) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement insertar = conecta.prepareStatement("insert into city values(?,?,?,?,?)");
			insertar.setInt(1, city.getID());
			insertar.setString(2, city.getName());
			insertar.setString(3, city.getCountryCode());
			insertar.setString(4, city.getDistrict());
			insertar.setInt(5, city.getPopulation());
			insertar.executeUpdate();
			conecta.commit();
			return 1;
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

	public int actualizarNombreConTransacciones(int id, String nombre) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement actualizar = conecta.prepareStatement("update city set name = ? where ID=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			actualizar.executeUpdate();
			conecta.commit();
			return 1;
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

	public int borrarCiudadConTransacciones(int numero) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement eliminar = conecta.prepareStatement("delete from city where ID=?");
			eliminar.setInt(1, numero);
			eliminar.executeUpdate();
			conecta.commit();
			return 1;
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

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
