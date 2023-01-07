package FullRepaso;

public class PruebaArrayListVehiculo {

	public static void main(String[] args) {
		ArrayListVehiculo a = new ArrayListVehiculo();

		System.out.println("Comprobar si la lista esta vacia");
		System.out.println(a.vacia());
		System.out.println(a.añadir(new Vehiculo("Nissan", "X-TRAIL", "Crema", 15000, 280, 5, 4, 250)));
		System.out.println(a.añadir(new Vehiculo("Nissan", "QASHQAI", "Negro", 25423, 250, 5, 4, 370)));
		System.out.println(a.añadir(new Vehiculo("Nissan", "Juke", "Azul Marino", 3456, 270, 3, 4, 190)));
		System.out.println(a.añadir(new Vehiculo("Audi", "A1 Sportback", "Blanco", 1745, 290, 3, 4, 270)));
		System.out.println(a.añadir(new Vehiculo("Audi", "RS 6 Avant", "Rojo Torino", 112341, 320, 5, 4, 650)));
		System.out.println(a.añadir(new Vehiculo("Ford", "Puma", "Azul Perlado", 15230, 280, 5, 4, 310)));
		System.out.println(a.añadir(new Vehiculo("BMW", "Serie 4 Coupe", "Gris", 11200, 310, 3, 4, 410)));
		System.out.println(a.añadir(new Vehiculo("Mazda", "CX-60", "Rojo", 50120, 270, 5, 4, 210)));
		
		System.out.println("\nTamaño de la lista: ");
		System.out.println(a.tamanyo());
		
		System.out.println("\nEliminar por posicion: ");
		System.out.println(a.eliminarPorPosicion(2));

		System.out.println("\nTamaño de la lista: ");
		System.out.println(a.tamanyo());
		a.mostrarTodo();
		
		System.out.println("\nBuscar por fabricante: ");
		System.out.println(a.buscarPorFabricante("BMW"));
		System.out.println(a.buscarPorFabricante("audi"));
		
		System.out.println("\nBuscar por nombre: ");
		System.out.println(a.buscarPorNombre("pu"));
		System.out.println(a.buscarPorNombre("COU"));
		
		System.out.println("\nBuscar por color: ");
		System.out.println(a.buscarPorColor("is"));
		System.out.println(a.buscarPorColor("tori"));
		
		System.out.println("\nBuscar por Kilometraje: ");
		System.out.println(a.buscarPorKilometros(15230));
		System.out.println(a.buscarPorKilometros(50120));
		
		System.out.println("\nBuscar por velocidad maxima: ");
		System.out.println(a.buscarPorVelocidad(270));
		System.out.println(a.buscarPorVelocidad(280));
		
		System.out.println("\nBuscar por numero de puertas: ");
		System.out.println(a.buscarPorNumeroPuertas(5));
		System.out.println(a.buscarPorNumeroPuertas(3));
		
		System.out.println("\nBuscar por numero de ruedas: ");
		System.out.println(a.buscarPorNumeroRuedas(4));
		System.out.println(a.buscarPorNumeroRuedas(3));
		
		System.out.println("\nBuscar por caballos de potencia: ");
		System.out.println(a.buscarPorCV(410));
		System.out.println(a.buscarPorCV(650));
		
		System.out.println("\nMaximo kilometros, minimos kilometros y media de kilometros: ");
		System.out.println(a.KilometrosMax());
		System.out.println(a.KilometrosMedia());
		
		System.out.println("\nVelocidad maxima, velocidad minima y media de velocidad: ");
		System.out.println(a.velocidadMaxima());
		System.out.println(a.velocidadMedia());
		
		System.out.println("\nCV maximos, CV minimos y CV media: ");
		System.out.println(a.CVMaximos());
		System.out.println(a.CVMedia());
		
		System.out.println("\nBorrar kilometraje: ");
		System.out.println(a.borrarKilometraje(1745, 150));
		
		a.mostrarTodo();
		
	}

}
