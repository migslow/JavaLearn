package ej02;

import java.sql.SQLException;

public class MainVehiculo {
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		AccesoBdatosVehiculo bd = new AccesoBdatosVehiculo();
		bd.conectar();
		System.out.println(bd.busquedaPorId(15));
		System.out.println(bd.buscarPorMarca("Ferrari"));
		System.out.println(bd.insertarConBean(new Vehiculo(20, "Opel", "Astra", "Raul Ploed", 120, 145000)));
		System.out.println(bd.actualizarPropietario(10, "Marta Sainz"));
		System.out.println(bd.borrarCoche(20));
		System.out.println(bd.borrarCocheConTransacciones(19));
	}
}
