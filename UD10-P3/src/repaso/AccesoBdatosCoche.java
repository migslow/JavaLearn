package repaso;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class AccesoBdatosCoche {
	private static String driver = "com.mysql.cj.jdbc.Driver";
	private static String database = "Vehiculos";
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

	public Coche busquedaPorCodigo(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where Id=?");
			ps.setInt(1, numero);
			Coche v = new Coche();
			ResultSet rs = ps.executeQuery();
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
			rs.close();
			ps.close();
			return v;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public Coche busquedaPorMarca(String marca) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where marca=?");
			ps.setString(1, marca);
			Coche c = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setPropietario(rs.getString(4));
				c.setCv(rs.getInt(5));
				c.setKilometrosRecorridos(rs.getInt(6));
			} else {
				c = null;
			}
			rs.close();
			ps.close();
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public Coche busquedaPorModelo(String modelo) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where modelo=?");
			ps.setString(1, modelo);
			Coche c = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setPropietario(rs.getString(4));
				c.setCv(rs.getInt(5));
				c.setKilometrosRecorridos(rs.getInt(6));
			} else {
				c = null;
			}
			rs.close();
			ps.close();
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public Coche busquedaPorPropietario(String pro) {
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where propietario=?");
			ps.setString(1, pro);
			Coche c = new Coche();
			ResultSet rs = ps.executeQuery();
			if (rs.next()) {
				c.setId(rs.getInt(1));
				c.setMarca(rs.getString(2));
				c.setModelo(rs.getString(3));
				c.setPropietario(rs.getString(4));
				c.setCv(rs.getInt(5));
				c.setKilometrosRecorridos(rs.getInt(6));
			} else {
				c = null;
			}
			rs.close();
			ps.close();
			return c;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> recorrerTodosLosRegistrosArray() {
		ArrayList<Coche> coches = new ArrayList<>();
		try {
			PreparedStatement ps = conecta.prepareStatement("SELECT * FROM coche");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				coches.add(c);
			}
			rs.close();
			ps.close();
			return coches;
		} catch (SQLException e) {
			System.out.println("Ha ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> busquedaPorModeloArray(String modelo) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where modelo=?");
			ps.setString(1, modelo);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				coches.add(c);
			}
			rs.close();
			ps.close();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
		return coches;
	}

	public ArrayList<Coche> busquedaPorCVMayorQue(int cv) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where cv>=?");
			ps.setInt(1, cv);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				coches.add(c);
			}
			rs.close();
			ps.close();
			return coches;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> busquedaPorMarcaArray2(String marca) {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select * from coche where marca like ?");
			ps.setString(1, marca + "%");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5),
						rs.getInt(6));
				coches.add(c);
			}
			rs.close();
			ps.close();
			return coches;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> mediaDeKilometrosRecorridos() {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("SELECT AVG(kilometrosRecorridos) from coche c");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche();
				c.setKilometrosRecorridos(rs.getInt(1));
				coches.add(c);
			}
			rs.close();
			ps.close();
			return coches;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public ArrayList<Coche> maxCV() {
		ArrayList<Coche> coches = new ArrayList<Coche>();
		try {
			PreparedStatement ps = conecta.prepareStatement("select max(cv) from coche");
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Coche c = new Coche();
				c.setCv(rs.getInt(1));
				coches.add(c);
			}
			return coches;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
			return null;
		}
	}

	public int insertarConBean1(Coche coche) {
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into coche values (?,?,?,?,?,?)");
			ps.setInt(1, coche.getId());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setString(4, coche.getPropietario());
			ps.setInt(5, coche.getCv());
			ps.setInt(6, coche.getKilometrosRecorridos());
			ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 1062;
	}

	public int insertarConBean2(Coche coche) {
		try {
			PreparedStatement ps = conecta.prepareStatement("insert into coche values(?,?,?,?,?,?)");
			ps.setInt(1, coche.getId());
			ps.setString(2, coche.getMarca());
			ps.setString(3, coche.getModelo());
			ps.setString(4, coche.getPropietario());
			ps.setInt(5, coche.getCv());
			ps.setInt(6, coche.getKilometrosRecorridos());
			ps.executeUpdate();
			return 1;
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 1062;
	}

	public int actualizarMarca(int id, String marca) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update coche set marca=? where Id=?");
			ps.setString(1, marca);
			ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int actualizarModelo(int id, String modelo) {
		try {
			PreparedStatement ps = conecta.prepareStatement("update coche set modelo=? where Id=?");
			ps.setString(1, modelo);
			ps.setInt(2, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int actualizarTodosLosCampos(int id, String marca, String modelo, String pro, int cv, int kilo) {
		try {
			PreparedStatement ps = conecta.prepareStatement(
					"update coche set marca=?, modelo=?, propietario=?, cv=?, kilometrosRecorridos=? where Id=?");
			ps.setString(1, marca);
			ps.setString(2, modelo);
			ps.setString(3, pro);
			ps.setInt(4, cv);
			ps.setInt(5, kilo);
			ps.setInt(6, id);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("Error" + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int borrarCoche(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("delete from coche where id=?");
			ps.setInt(1, numero);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public int borrarCochePorKilometros(int numero) {
		try {
			PreparedStatement ps = conecta.prepareStatement("delete from coche where kilometrosRecorridos>=?");
			ps.setInt(1, numero);
			return ps.executeUpdate();
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema con la consulta " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}
	
	public int funcionMediaKilometros() {
		try {
			CallableStatement cb = conecta.prepareCall("select media_kilometros_recorridos()");
			ResultSet rs = cb.executeQuery();
			if(rs.next()) {
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema " +e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}
	
	public int funcionMaxCV() {
		try {
			CallableStatement cb = conecta.prepareCall("select buscar_coche_max_kilometraje()");
		} catch (SQLException e) {
			System.out.println("A ocurrido un problema " + e.getErrorCode());
			e.printStackTrace();
		}
		return 0;
	}

	public void desconectar() throws SQLException, ClassNotFoundException {
		conecta.close();
	}
}
