package Examen_6;
import java.sql.SQLException;




public class MainInsertarUsuario {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		System.out.println(abd.insertarUsuario("Alberto", "Carrera Mart�n",	"18022334", "974224783"));//Ok
		System.out.println(abd.insertarUsuario("Luis", "Aldea Navarro ",	"70122334", "974224783"));//Ok
		System.out.println(abd.insertarUsuario("Alberto", "Carrera Mart�n", "18022334", "974224783"));//Ya existe persona con ese DNI
		abd.desconectar();
	}
}
