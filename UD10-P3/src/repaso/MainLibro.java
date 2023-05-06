package repaso;

import java.sql.SQLException;

public class MainLibro {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd = new AccesoBdatos();
		abd.conectar();
	}
}
