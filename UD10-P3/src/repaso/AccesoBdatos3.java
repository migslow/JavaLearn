package repaso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatos3 {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "peliculas";
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

	public ArrayList<Pelicula> buscarPorID(int numero) {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from pelicula where ID=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Pelicula p = new Pelicula(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6));
				peliculas.add(p);
			}
			rs.close();
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return peliculas;
	}

	public ArrayList<Pelicula> buscarPorTitulo(String nombre) {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from pelicula where Titulo=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Pelicula p = new Pelicula(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6));
				peliculas.add(p);
			}
			rs.close();
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return peliculas;
	}

	public ArrayList<Pelicula> buscarPorAnyoEstreno(int numero) {
		ArrayList<Pelicula> peliculas = new ArrayList<Pelicula>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from pelicula where AnyoEstreno=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Pelicula p = new Pelicula(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getString(6));
				peliculas.add(p);
			}
			rs.close();
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return peliculas;
	}

	public int insertarConBean(Pelicula pelicula) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into pelicula values(?,?,?,?,?,?)");
			insertar.setInt(1, pelicula.getId());
			insertar.setString(2, pelicula.getTitulo());
			insertar.setString(3, pelicula.getDirector());
			insertar.setString(4, pelicula.getProductor());
			insertar.setInt(5, pelicula.getAnyoEstreno());
			insertar.setString(6, pelicula.getActorPrincipal());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la cosulta " + e.getErrorCode());
			return 0;
		}
	}

	public int actualizarTitulo(int id, String titulo) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update pelicula set titulo=? where id=?");
			actualizar.setString(1, titulo);
			actualizar.setInt(2, id);
			return (actualizar.executeUpdate());
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public int actualizarTituloTransacciones(int id, String titulo) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update pelicula set titulo=? where id=?");
			actualizar.setString(1, titulo);
			actualizar.setInt(2, id);
			conecta.setAutoCommit(false);
			actualizar.close();
			conecta.commit();
			return (actualizar.executeUpdate());
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
			return 0;
		}
	}

	public int borrarTitulo(String titulo) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from pelicula where titulo=?");
			eliminar.setString(1, titulo);
			int filas = eliminar.executeUpdate();
			eliminar.close();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public void procedimientoActualizar(int id, String actor) {
		try {
			CallableStatement proc = conecta.prepareCall("call actualizar_actor_principal(?,?)");
			proc.setInt(1, id);
	        proc.setString(2, actor);
	        proc.executeUpdate();
	        proc.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	/*
	public int contarPeliculasAnyo(int numero) {
		try {
			CallableStatement fuct = conecta.prepareCall("select contar_peliculas_por_anyo(?)");
			fuct.setInt(1, numero);
			ResultSet filas = fuct.executeQuery();
			fuct.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	*/
	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
