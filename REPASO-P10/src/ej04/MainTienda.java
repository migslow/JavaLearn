package ej04;

import java.sql.SQLException;

public class MainTienda {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosTienda bd = new AccesoBdatosTienda();
		bd.conectar();
		System.out.println(bd.busquedaPorCodigo(2));
		System.out.println(bd.busquedaPorArticulo("Bolso"));
		System.out.println(bd.busquedaPorArticuloMejorada("rr"));
		System.out.println(bd.busquedaPorCantidadArticulos());
		System.out.println(bd.insertarConBean(new Tienda(11, "Silla", 24.99, 12)));
		System.out.println(bd.actualizarPrecio(7, 29.99));
		System.out.println(bd.borrarArticulo(2));
		
		System.out.println("\nProcedimiento: ");
		bd.calcularPecioSuperior(10.99);
		
		System.out.println("\nFuncion: ");
		bd.calcularPrecioTotalProducto(10.99, 5);
	}
}
