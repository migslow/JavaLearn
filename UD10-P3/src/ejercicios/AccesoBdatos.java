package ejercicios;

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

	public Empleado busquedaPorCodigo(int numero) {
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM emp WHERE EMPNO=?");
			consulta.setInt(1, numero);
			ResultSet reg = consulta.executeQuery();
			Empleado e = new Empleado();
			if (reg.next()) {
				e.setEmpno(reg.getInt(1));
				e.setEname(reg.getString(2));
				e.setJob(reg.getString(3));
				e.setMgr(reg.getInt(4));
				e.setHiredate(reg.getDate(5));
				e.setSal(reg.getDouble(6));
				e.setComm(reg.getDouble(7));
				e.setDeptno(reg.getInt(8));
			} else {
				e = null;
			}
			consulta.close();
			return e;
		} catch (SQLException e) {
			System.out.println("Error en la consulta " + e.getErrorCode());
			return null;
		}

	}

	public ArrayList<Empleado> busquedaPorOficio(String oficio) {
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM emp Where job=?");
			consulta.setString(1, oficio);
			ResultSet reg = consulta.executeQuery();
			while (reg.next()) {
				Empleado e = new Empleado(reg.getInt(1), reg.getString(2), reg.getString(3), reg.getInt(4),
						reg.getDate(5), reg.getDouble(6), reg.getDouble(7), reg.getInt(8));
				empleados.add(e);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un error con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}
	
	public ArrayList<Empleado> busquedaPorAntiguedad (java.sql.Date fecha){
		ArrayList<Empleado> empleados = new ArrayList<Empleado>();
		try {
			PreparedStatement consulta = conecta.prepareStatement("SELECT * FROM emp Where hiredate<?");
			consulta.setDate(1, fecha);
			ResultSet reg = consulta.executeQuery();
			while (reg.next()) {
				Empleado e = new Empleado(reg.getInt(1), reg.getString(2), reg.getString(3), reg.getInt(4),
						reg.getDate(5), reg.getDouble(6), reg.getDouble(7), reg.getInt(8));
				empleados.add(e);
			}
			consulta.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un error con la consulta " + e.getErrorCode());
			return null;
		}
		return empleados;
	}
	
	public int insertarConBean(Empleado emp) {
		try {
			String sql = "insert into emp values (?,?,?,?,?,?,?,?)";
			PreparedStatement insertar = conecta.prepareStatement(sql);
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

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
