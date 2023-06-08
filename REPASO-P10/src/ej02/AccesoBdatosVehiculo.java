package ej02;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosVehiculo {
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

	public Vehiculo busquedaPorId(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from coche where Id=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Vehiculo v = new Vehiculo();
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
			consulta.close();
			return v;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Vehiculo> buscarPorMarca(String marca) {
		ArrayList<Vehiculo> lista = new ArrayList<Vehiculo>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from coche where marca=?");
			consulta.setString(1, marca);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Vehiculo v = new Vehiculo(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				lista.add(v);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return lista;
	}

	public int insertarConBean(Vehiculo coche) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into coche values(?,?,?,?,?,?)");
			insertar.setInt(1, coche.getId());
			insertar.setString(2, coche.getMarca());
			insertar.setString(3, coche.getModelo());
			insertar.setString(4, coche.getPropietario());
			insertar.setInt(5, coche.getCv());
			insertar.setInt(6, coche.getKilometrosRecorridos());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta ");
			return e.getErrorCode();
		}
	}

	public int insertarConBeanConTransacciones(Vehiculo coche) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement insertar = conecta.prepareStatement("insert into coche values(?,?,?,?,?,?)");
			insertar.setInt(1, coche.getId());
			insertar.setString(2, coche.getMarca());
			insertar.setString(3, coche.getModelo());
			insertar.setString(4, coche.getPropietario());
			insertar.setInt(5, coche.getCv());
			insertar.setInt(6, coche.getKilometrosRecorridos());
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
		return 0;
	}

	public int actualizarPropietario(int id, String nombre) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update coche set propietario=? where Id=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			int filas = actualizar.executeUpdate();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int actualizarPropietarioConTransacciones(int id, String nombre) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement actualizar = conecta.prepareStatement("update coche set propietario=? where Id=?");
			actualizar.setString(1, nombre);
			actualizar.setInt(2, id);
			int filas = actualizar.executeUpdate();
			conecta.commit();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int borrarCoche(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from coche where id=?");
			eliminar.setInt(1, numero);
			int filas = eliminar.executeUpdate();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
			return e.getErrorCode();
		}
	}

	public int borrarCocheConTransacciones(int numero) {
		try {
			conecta.setAutoCommit(false);
			PreparedStatement eliminar = conecta.prepareStatement("delete from coche where id=?");
			eliminar.setInt(1, numero);
			int filas = eliminar.executeUpdate();
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

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
