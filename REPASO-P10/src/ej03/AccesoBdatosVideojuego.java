package ej03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosVideojuego {
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

	public Videojuego busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from videojuegos where ID=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Videojuego v = new Videojuego();
			if (rs.next()) {
				v.setId(rs.getInt(1));
				v.setTitulo(rs.getString(2));
				v.setDesarrollador(rs.getString(3));
				v.setGenero(rs.getString(4));
				v.setAnyo(rs.getInt(5));
				v.setMotorGrafico(rs.getString(6));
				v.setPlataformas(rs.getString(7));
				v.setPrecio(rs.getInt(1));
			} else {
				v = null;
			}
			return v;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Videojuego> busquedaPorGenero(String genero) {
		ArrayList<Videojuego> lista = new ArrayList<Videojuego>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from videojuegos where genero=?");
			consulta.setString(1, genero);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Videojuego v = new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				lista.add(v);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return lista;
	}

	public ArrayList<Videojuego> busquedaPorGeneroMejorado(String genero) {
		ArrayList<Videojuego> lista = new ArrayList<Videojuego>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from videojuegos where genero like ?");
			consulta.setString(1, "%" + genero + "%");
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Videojuego v = new Videojuego(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4),
						rs.getInt(5), rs.getString(6), rs.getString(7), rs.getInt(8));
				lista.add(v);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return lista;
	}

	public int insertarConBean(Videojuego videojuegos) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into videojuegos values(?,?,?,?,?,?,?,?)");
			insertar.setInt(1, videojuegos.getId());
			insertar.setString(2, videojuegos.getTitulo());
			insertar.setString(3, videojuegos.getDesarrollador());
			insertar.setString(4, videojuegos.getGenero());
			insertar.setInt(5, videojuegos.getAnyo());
			insertar.setString(6, videojuegos.getMotorGrafico());
			insertar.setString(7, videojuegos.getPlataformas());
			insertar.setInt(8, videojuegos.getPrecio());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
		}
		return 1062;
	}

	public int insertarConBeanConTransacciones(Videojuego videojuegos) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement insertar = conecta.prepareStatement("insert into videojuegos values(?,?,?,?,?,?,?,?)");
			insertar.setInt(1, videojuegos.getId());
			insertar.setString(2, videojuegos.getTitulo());
			insertar.setString(3, videojuegos.getDesarrollador());
			insertar.setString(4, videojuegos.getGenero());
			insertar.setInt(5, videojuegos.getAnyo());
			insertar.setString(6, videojuegos.getMotorGrafico());
			insertar.setString(7, videojuegos.getPlataformas());
			insertar.setInt(8, videojuegos.getPrecio());
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

	public int actualizarPrecio(int id, int precio) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update videojuegos set Precio=? where ID=?");
			actualizar.setInt(1, precio);
			actualizar.setInt(2, id);
			return actualizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}
	
	public int actualizarPrecioConTransacciones(int id, int precio) {
		try {
			int filas = 0;
			conecta.setAutoCommit(false);
			PreparedStatement actualizar = conecta.prepareStatement("update videojuegos set Precio=? where ID=?");
			actualizar.setInt(1, precio);
			actualizar.setInt(2, id);
			filas = actualizar.executeUpdate();
			conecta.commit();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int eliminarVideojuego(int id) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from videojuegos where ID=?");
			eliminar.setInt(1, id);
			int filas = eliminar.executeUpdate();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}
	
	public int eliminarVideojuegoConTransacciones(int id) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement eliminar = conecta.prepareStatement("delete from videojuegos where ID=?");
			eliminar.setInt(1, id);
			int filas = eliminar.executeUpdate();
			conecta.commit();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
