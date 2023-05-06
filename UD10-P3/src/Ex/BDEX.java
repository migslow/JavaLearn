package Ex;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class BDEX {
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

	public Ex busquedaPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where empno=?");
			ps.setInt(1, numero);
			Ex e = new Ex();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setMgr(rs.getInt(4));
				e.setHiredate(rs.getDate(5));
				e.setSal(rs.getDouble(6));
				e.setComm(rs.getDouble(7));
				e.setDeptno(rs.getInt(8));
			} else {
				System.out.println("ID no encontrado");
			}
			rs.close();
			ps.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Ex> busquedaPorOficio(String oficio) {
		ArrayList<Ex> empleados = new ArrayList<Ex>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where job=?");
			ps.setString(1, oficio);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Ex e = new Ex(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return empleados;
	}

	public int insertarConBean(Ex emp) {
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getMgr());
			ps.setDate(5, emp.getHiredate());
			ps.setDouble(6, emp.getSal());
			ps.setDouble(7, emp.getComm());
			ps.setInt(8, emp.getDeptno());
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 1062;
	}

	public int insertarConBeanConTransacciones(Ex emp) {
		int resultado = 0;
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			conecta.setAutoCommit(false);
			ps.setInt(1, emp.getEmpno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getMgr());
			ps.setDate(5, emp.getHiredate());
			ps.setDouble(6, emp.getSal());
			ps.setDouble(7, emp.getComm());
			ps.setInt(8, emp.getDeptno());
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

	public int actualizarNombre(int id, String nombre) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update emp set ename=? where empno=?");
			ps.setString(1, nombre);
			ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}
	
	public int actualizarNombreConTransacciones(int id, String nombre) {
		int resultado = 0;
		try {
			PreparedStatement ps = conecta.prepareStatement("update emp set ename=? where empno=?");
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
			PreparedStatement ps = conecta.prepareStatement("delete from emp where empno=?");
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
			PreparedStatement ps = conecta.prepareStatement("delete from emp where empno=?");
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

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
