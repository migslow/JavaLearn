package repaso;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

import ejercicios.Empleado;

public class AccesoBdatos4 {
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

	public ArrayList<Empleado> busquedaPorCodigo(int numero) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("select * from emp where empno=?");
			consulta.setInt(1, numero);
			ResultSet rs = consulta.executeQuery();
			while (rs.next()) {
				Empleado e = new Empleado(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getInt(4), rs.getDate(5),
						rs.getDouble(6), rs.getDouble(7), rs.getInt(8));
				empleados.add(e);
			}
			rs.close();
			consulta.close();
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
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
			rs.close();
			consulta.close();
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocrrido un problema con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}

	public int insertarConBean(Empleado emp) {
		try {
			PreparedStatement insertar = conecta.prepareStatement("insert into emp values (?,?,?,?,?,?,?,?)");
			insertar.setInt(1, emp.getDeptno());
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
			PreparedStatement actualizar = conecta.prepareStatement("update emp set sal=sal*? where empno=?");
			actualizar.setInt(1, departamento);
			actualizar.setDouble(2, porcentaje);
			return actualizar.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			return 0;
		}
	}

	public int actualizarSalarioConTransacciones(int departamento, double porcentaje) {
		try {
			PreparedStatement actualizar = conecta.prepareStatement("update emp set sal=sal*? where empno=?");
			actualizar.setInt(1, departamento);
			actualizar.setDouble(2, porcentaje);
			conecta.setAutoCommit(false);
			actualizar.close();
			conecta.commit();
			return actualizar.executeUpdate();
		} catch (Exception e) {
			try {
				conecta.rollback();
			} catch (Exception e2) {
				e2.printStackTrace();
			}
			return 0;
		}
	}
	
	public int borrarEmpleado(int numero) {
		try {
			PreparedStatement eliminar = conecta.prepareStatement("delete from emp where ename=?");
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
