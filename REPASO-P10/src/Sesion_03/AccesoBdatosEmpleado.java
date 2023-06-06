package Sesion_03;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosEmpleado {
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

	public Empleado busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where empno=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			Empleado e = new Empleado();
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
				e = null;
			}
			consulta.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public Empleado busquedaPorNombre(String nombre) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where ename=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			Empleado e = new Empleado();
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
				e = null;
			}
			consulta.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Empleado> busquedaPorOficio(String oficio) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where job=?");
			consulta.setString(1, oficio);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> busquedaPorSalario(double salario) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where sal=?");
			consulta.setDouble(1, salario);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public int insertarConBean(Empleado emp) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			insertar.setInt(1, emp.getEmpno());
			insertar.setString(2, emp.getEname());
			insertar.setString(3, emp.getJob());
			insertar.setInt(4, emp.getMgr());
			insertar.setDate(5, emp.getHiredate());
			insertar.setDouble(6, emp.getSal());
			insertar.setDouble(7, emp.getComm());
			insertar.setInt(8, emp.getDeptno());
			insertar.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 1062;
	}

	public int actualizarSalario(int departamento, double porcentaje) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update emp set sal=sal*? where deptno=?");
			actualizar.setDouble(1, porcentaje);
			actualizar.setInt(2, departamento);
			return actualizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public int actualizarSalarioconTransacciones(int departamento, double porcentaje) {
		try {
			String sql = "UPDATE emp SET sal=sal*? WHERE deptno=?";
			PreparedStatement actualiza = conecta.prepareStatement(sql);
			actualiza.setDouble(1, porcentaje);
			actualiza.setInt(2, departamento);
			conecta.setAutoCommit(false);
	        int filasActualizadas = actualiza.executeUpdate();
	        conecta.commit();
	        actualiza.close();
	        return filasActualizadas;
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			return 0;
		}
	}

	public int borrarEmpleado(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from emp where empno=?");
			eliminar.setInt(1, numero);
			int filas = eliminar.executeUpdate();
			eliminar.close();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta");
			return e.getErrorCode();
		}
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
