package Examen_6;


import java.sql.SQLException;


public class MainLibrosMateria {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		
		String materia = "FIL";
		System.out.println(abd.librosPorMateria(materia));
		/* 1 libro:
		[Libro [Registro del libro (clave)=20, titulo=As� habl� Zaratustra, editorial=Edimat Libros]]
		 */
		materia = "INF";
		System.out.println(abd.librosPorMateria(materia));
		/* 4 libros
		 [Libro [Registro del libro (clave)=14, titulo=PHP 4, editorial=Prentice Hall], 
		 Libro [Registro del libro (clave)=15, titulo=PHP 4, editorial=Anaya Multimedia], 
		 Libro [Registro del libro (clave)=31, titulo=Microsoft SQL Server 5, editorial=Prentice Hall], 
		 Libro [Registro del libro (clave)=32, titulo=Microsoft SQL Server 5, editorial=Prentice Hall]]
		 */
		materia = "PEP";
		System.out.println(abd.librosPorMateria(materia));		
		/* Ning�n libro, lista vac�a:
		  []		 
		 */
		abd.desconectar();
	}
}


