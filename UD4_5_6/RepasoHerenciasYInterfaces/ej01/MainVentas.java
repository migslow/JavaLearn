package ej01;

public class MainVentas {

	public static void main(String[] args) {
		Ventas v = new Ventas();
		
		v.realizarVenta(new Libro("Hola", 12.00, 15, "Yo", "1234"));
		v.realizarVenta(new Libro("Adios", 72.00, 25, "Tu", "2345"));
		v.realizarVenta(new Libro("Buenas", 2.00, 35, "El", "3456"));
		v.realizarVenta(new Libro("Gutten", 23.00, 45, "El otro", "4567"));
		
		v.realizarVenta(new Discos("Lala", 2.00, 11, "lola", 5.12));
		v.realizarVenta(new Discos("la maca", 32.00, 1, "flor", 1.22));
		
		v.mostrarInformacion();

	}

}
