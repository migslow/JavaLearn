package Dep;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBDDep {

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

	public Dep busquedaPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from dept where deptno=?");
			ps.setInt(1, numero);
			Dep d = new Dep();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				d.setDeptno(rs.getInt(1));
				d.setDname(rs.getString(2));
				d.setLoc(rs.getString(3));
			} else {
				d = null;
			}
			rs.close();
			ps.close();
			return d;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Dep> busquedaPorDname(String nombre) {
		ArrayList<Dep> departamentos = new ArrayList<Dep>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from dept where dname=?");
			ps.setString(1, nombre);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dep d = new Dep(rs.getInt(1), rs.getString(2), rs.getString(3));
				departamentos.add(d);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return departamentos;
	}

	public ArrayList<Dep> busquedaPorLoc(String nombre) {
		ArrayList<Dep> departamentos = new ArrayList<Dep>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from dept where loc=?");
			ps.setString(1, nombre);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Dep d = new Dep(rs.getInt(1), rs.getString(2), rs.getString(3));
				departamentos.add(d);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return departamentos;
	}

	public int insertarConBean(Dep dept) {
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into dept values(?,?,?)");
			ps.setInt(1, dept.getDeptno());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLoc());
			ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 1062;
	}

	public int insertarConBeanConTransacciones(Dep dept) {
		int resultado = 0;
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into dept values(?,?,?)");
			conecta.setAutoCommit(false);
			ps.setInt(1, dept.getDeptno());
			ps.setString(2, dept.getDname());
			ps.setString(3, dept.getLoc());
			resultado = ps.executeUpdate();
			conecta.commit();
			return resultado;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return 1062;
	}

	public int actualizarLoc(int id, String nombre) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update dept set loc=? where deptno=?");
			ps.setString(1, nombre);
			ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int actualizarDnameConTransacciones(int id, String nombre) {
		int resultado = 0;
		try {
			PreparedStatement ps = conecta.prepareStatement("update dept set dname=? where deptno=?");
			conecta.setAutoCommit(false);
			ps.setString(1, nombre);
			ps.setInt(2, id);
			resultado = ps.executeUpdate();
			conecta.commit();
			return resultado;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return 0;
	}

	public int borrarEmpleado(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("delete from dept where deptno=?");
			ps.setInt(1, numero);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int borrarEmpleadoConTransacciones(int numero) {
		int resultado = 0;
		try {
			PreparedStatement ps = conecta.prepareStatement("delete from dept where deptno=?");
			conecta.setAutoCommit(false);
			ps.setInt(1, numero);
			resultado = ps.executeUpdate();
			conecta.commit();
			return resultado;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return 0;
	}

	public int funcionActualizarNombreDepartamento(int id, String nombre) {
		try {
			CallableStatement cb = conecta.prepareCall("select actualizar_nombre_dept(?,?)");
			cb.setInt(1, id);
			cb.setString(2, nombre);
			ResultSet rs = cb.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un error " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
