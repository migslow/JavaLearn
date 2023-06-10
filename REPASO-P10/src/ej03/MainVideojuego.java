package ej03;

import java.sql.SQLException;

public class MainVideojuego {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosVideojuego bd = new AccesoBdatosVideojuego();
		bd.conectar();
		
		System.out.println(bd.busquedaPorCodigo(3));
		System.out.println(bd.busquedaPorGenero("Acción-Aventura"));
		System.out.println(bd.busquedaPorGeneroMejorado("Acción"));
		System.out.println(bd.insertarConBean(new Videojuego(11, "t1", "d1", "g1", 2023, "m1", "p1", 60)));
		System.out.println(bd.actualizarPrecio(4, 10));
		System.out.println(bd.eliminarVideojuego(11));
		System.out.println(bd.insertarConBeanConTransacciones(new Videojuego(12, "t2", "d2", "g2", 2023, "m2", "p2", 20)));
		System.out.println(bd.actualizarPrecioConTransacciones(9, 69));
		System.out.println(bd.eliminarVideojuegoConTransacciones(12));
	}
	
}
