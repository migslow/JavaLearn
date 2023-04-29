package repaso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

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
	static Scanner s = new Scanner(System.in);

	public void conectar() throws SQLException, ClassNotFoundException {
		Class.forName(driver);
		conecta = DriverManager.getConnection(url, username, password);
	}

	public Empleado busquedaPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where empno=?");
			ps.setInt(1, numero);
			ResultSet rs = ps.executeQuery();
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
			rs.close();
			ps.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public Empleado busquedaPorNombre(String nombre) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where ename=?");
			ps.setString(1, nombre);
			ResultSet rs = ps.executeQuery();
			Empleado e = new Empleado();
			while (rs.next()) {
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setMgr(rs.getInt(4));
				e.setHiredate(rs.getDate(5));
				e.setSal(rs.getDouble(6));
				e.setComm(rs.getDouble(7));
				e.setDeptno(rs.getInt(8));
			}
			rs.close();
			ps.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public Empleado busquedaPorOficio(String oficio) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where job=?");
			ps.setString(1, oficio);
			ResultSet rs = ps.executeQuery();
			Empleado e = new Empleado();
			while (rs.next()) {
				e.setEmpno(rs.getInt(1));
				e.setEname(rs.getString(2));
				e.setJob(rs.getString(3));
				e.setMgr(rs.getInt(4));
				e.setHiredate(rs.getDate(5));
				e.setSal(rs.getDouble(6));
				e.setComm(rs.getDouble(7));
				e.setDeptno(rs.getInt(8));
			}
			rs.close();
			ps.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
	}

	public Empleado busquedaPorSalario(double salario) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where sal=?");
			ps.setDouble(1, salario);
			ResultSet rs = ps.executeQuery();
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
			rs.close();
			ps.close();
			return e;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con al consulta " + e.getErrorCode());
			return null;
		}
	}

	public ArrayList<Empleado> busquedaPorCodigoArrayList(int numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where empno=?");
			ps.setInt(1, numero);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> busquedaPorNombreArrayList(String nombre) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where ename=?");
			ps.setString(1, nombre);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> busquedaPorOficioArrayList(String oficio) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where job=?");
			ps.setString(1, oficio);
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> busquedaPorSalarioArrayList(double salario) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where sal=?");
			ps.setDouble(1, salario);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> busquedaPorSalarioMenorQue(double salario) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from emp where sal<=?");
			ps.setDouble(1, salario);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public int insertarConBean(Empleado emp) {
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into emp values(?,?,?,?,?,?,?,?)");
			ps.setInt(1, emp.getDeptno());
			ps.setString(2, emp.getEname());
			ps.setString(3, emp.getJob());
			ps.setInt(4, emp.getMgr());
			ps.setDate(5, emp.getHiredate());
			ps.setDouble(6, emp.getSal());
			ps.setDouble(7, emp.getComm());
			ps.setInt(8, emp.getDeptno());
			ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 1062;
	}

	public int actualizarSalario(int departamento, double porcentaje) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update emp set sal=sal*? where deptno=?");
			ps.setDouble(1, porcentaje);
			ps.setInt(2, departamento);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int actualizarNombre(int id, String nombre) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update emp set ename=? where empno=?");
			ps.setString(1, nombre);
			ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
		}
		return 0;
	}

	public int funcionActualizarNombre(int id, String nombre) {
		try {
			CallableStatement funcion = conecta.prepareCall("select actualizar_nombre_emp(?,?)");
			funcion.setInt(1, id);
			funcion.setString(2, nombre);
			ResultSet rs = funcion.executeQuery();
			if (rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta o funcion " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int actualizarSalarioConTransacciones(int departamento, double porcentaje) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update emp set sal=sal*? where deptno=?");
			ps.setDouble(1, porcentaje);
			ps.setInt(2, departamento);
			conecta.setAutoCommit(false);
			ps.executeUpdate();
			conecta.commit();
		} catch (SQLException e) {
			try {
				conecta.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
		return 0;
	}

	public int borrarEmpleadoPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("delete from emp where empno=?");
			ps.setInt(1, numero);
			int filas = ps.executeUpdate();
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
