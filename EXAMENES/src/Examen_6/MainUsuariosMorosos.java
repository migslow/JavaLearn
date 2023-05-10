package Examen_6;

import java.sql.SQLException;




public class MainUsuariosMorosos {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatos abd=new AccesoBdatos();
		abd.conectar();
		// abd.usuariosMorosos();
		abd.desconectar();
	}
}
/*
Usuarios Morosos:
=================
Fernando-Garc�a P�rez-12345678-91-8765432-1
Mar�a-Fern�ndez de Juana-23456789-91-8034567-2
Juan-Pereda Hermoso-0246801O-942-987654-4
Leoncio-Puga Gamo-98076543-902879532-7
In�s-Sastre Prieto-12457890-912357234-5
Antonia-Perlado Perote-87654321-676897654-6
*/