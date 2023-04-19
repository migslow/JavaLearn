package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatos {
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

	public Empleado busquedaPorCodigo1(int numero) {
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

	public ArrayList<Empleado> busquedaPorCodigo2(int numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where empno=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			if (rs.next()) {
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

	public ArrayList<Empleado> busquedaPorNombre(String nombre) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where ename=?");
			consulta.setString(1, nombre);
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

	public ArrayList<Empleado> busquedaPorTrabajo(String nombre) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where job=?");
			consulta.setString(1, nombre);
			ResultSet rs = consulta.executeQuery();
			if (rs.next()) {
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

	public ArrayList<Empleado> buscarPorJefe(int nombre) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where mgr=?");
			consulta.setInt(1, nombre);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consutla " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public ArrayList<Empleado> buscarPorSalario(double numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where sal=?");
			consulta.setDouble(1, numero);
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

	public ArrayList<Empleado> busquedaPorComision(double numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where comm=?");
			consulta.setDouble(1, numero);
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

	public ArrayList<Empleado> busquedaPorDepartamento(int numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where deptno=?");
			consulta.setInt(1, numero);
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

	public int insetarConBean(Empleado emp) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
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

	public int actualizarSalarioConTransacciones(int departamento, double porcentaje) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update emp set sal=sal*? where deptno=?");
			actualizar.setDouble(1, porcentaje);
			actualizar.setInt(2, departamento);
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

	public int borrarPorEmpleado(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from emp where empno=?");
			eliminar.setInt(1, numero);
			int filas = eliminar.executeUpdate();
			eliminar.close();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public int borrarPorJefe(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from emp where mgr=?");
			eliminar.setInt(1, numero);
			int filas = eliminar.executeUpdate();
			return filas;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}

}
