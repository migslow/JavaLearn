package ej04;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosTienda {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "tiendas";
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
	
	public Tienda busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from tienda where ID=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Tienda t = new Tienda();
			if (rs.next()) {
				t.setId(rs.getInt(1));
				t.setArticulo(rs.getString(2));
				t.setPrecio(rs.getDouble(3));
				t.setCantidad(rs.getInt(4));
			} else {
				t = null;
			}
			consulta.close();
			return t;
		} catch (SQLException e) {
			System.out.println("A acurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public ArrayList<Tienda> busquedaPorArticulo(String nombre){
		ArrayList<Tienda> elementos = new ArrayList<Tienda>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from tienda where Articulo=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Tienda t = new Tienda(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				elementos.add(t);
			}
			consulta.close();
			return elementos;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public ArrayList<Tienda> busquedaPorArticuloMejorada(String nombre){
		ArrayList<Tienda> elementos = new ArrayList<Tienda>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from tienda where Articulo LIKE ?");
			consulta.setString(1, "%" + nombre + "%");
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Tienda t = new Tienda(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				elementos.add(t);
			}
			consulta.close();
			return elementos;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public ArrayList<Tienda> busquedaPorCantidadArticulos(){
		ArrayList<Tienda> elementos = new ArrayList<Tienda>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from tienda where cantidad > 5");
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Tienda t = new Tienda(rs.getInt(1),rs.getString(2),rs.getDouble(3),rs.getInt(4));
				elementos.add(t);
			}
			consulta.close();
			return elementos;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}
	
	public int insertarConBean(Tienda tienda) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into tienda values(?,?,?,?)");
			insertar.setInt(1, tienda.getId());
			insertar.setString(2, tienda.getArticulo());
			insertar.setDouble(3, tienda.getPrecio());
			insertar.setInt(4, tienda.getCantidad());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
		}
		return 1062;
	}
	
	public int actualizarPrecio(int id, double precio) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update tienda set precio = precio*? where ID=?");
			actualizar.setDouble(1, precio);
			actualizar.setInt(2, id);
			int filas = actualizar.executeUpdate();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " +e.getErrorCode());
		}
		return 0;
	}

	public int borrarArticulo(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from tienda where ID=?");
			eliminar.setInt(1, numero);;
			int filas = eliminar.executeUpdate();
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
