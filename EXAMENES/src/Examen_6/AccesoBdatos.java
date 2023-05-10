package Examen_6;
import java.sql.*;
import java.util.ArrayList;

public class AccesoBdatos {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "libros8mayo2023";
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

	public void desconectar() throws SQLException, ClassNotFoundException {

		conecta = null; // = conecta.close();
	}
	//

	public ArrayList<Libro> librosPorMateria(String materia) {
		ArrayList<Libro> libros = new ArrayList<Libro>();
		try {
			PreparedStatement ps = conecta
					.prepareStatement("select l.registro, l.titulo, l.editorial from libros l where Materia=?");
			ps.setString(1, materia);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Libro libro = new Libro(rs.getInt(1), rs.getString(2), rs.getString(3));
				libros.add(libro);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return libros; // ELIMINAR ESTA L�NEA Y COMPLETAR
	}// de librosPorMateria

	public String insertarUsuario(String nombre, String apellidos, String dni, String telefono) {
		try {
			CallableStatement cb = conecta.prepareCall("select nuevoUsuario (?,?,?,?)");
			cb.setString(1, nombre);
			cb.setString(2, apellidos);
			cb.setString(3, dni);
			cb.setString(4, telefono);
			ResultSet rs = cb.executeQuery();
			if (rs.next()) {
				return rs.getString(1);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la funcion " + e.getErrorCode());
			e.printStackTrace();
		}
		return null;
	} // de insertarUsuario
	/*
	public void usuariosMorosos() {
		try {
			
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
	} // de usuariosMorosos
	*/

} // de la clase