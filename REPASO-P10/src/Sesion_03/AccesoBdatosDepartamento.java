package Sesion_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosDepartamento {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "demodb";
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

	public Departamento busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from dept where deptno=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Departamento d = new Departamento();
			if (rs.next()) {
				d.setDeptno(rs.getInt(1));
				d.setDname(rs.getString(2));
				d.setLog(rs.getString(3));
			} else {
				d = null;
			}
			consulta.close();
			return d;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Departamento> busquedaPorDname(String dname) {
		ArrayList<Departamento> departamentos = new ArrayList<Departamento>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from dept where dname=?");
			consulta.setString(1, dname);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Departamento d = new Departamento(rs.getInt(1), rs.getString(2), rs.getString(3));
				departamentos.add(d);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return departamentos;
	}

	public int insertarConBean(Departamento dept) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into dept values(?,?,?)");
			insertar.setInt(1, dept.getDeptno());
			insertar.setString(2, dept.getDname());
			insertar.setString(3, dept.getLog());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la conulta " + e.getErrorCode());
		}
		return 1062;
	}

	public int actualizarDname(int departamento, String dname) {
		try {
			PreparedStatement actulizar = conecta.prepareStatement("update dept set dname =? where deptno=?");
			actulizar.setString(1, dname);
			actulizar.setInt(2, departamento);
			return actulizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int borrarDepartamento(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from dept where deptno=?");
			eliminar.setInt(1, numero);
			return eliminar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
