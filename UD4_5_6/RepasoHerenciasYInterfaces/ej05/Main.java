package ej05;

public class Main {

	public static void main(String[] args) {
		VehiculoLista lista = new VehiculoLista();
		
		Piloto p1 = new Piloto("Lando", "Norris", 23, "Britanica", "McLaren", 6, 82);
		Piloto p2 = new Piloto("Max", "Verstappen", 25, "Neerlandesa", "Red Bull", 77, 163);
		Piloto p3 = new Piloto("Charles", "Leclerc", 25, "Monegasca", "Ferrari", 24, 103);
		
		lista.crearPersona(p1);
		lista.crearPersona(p2);
		lista.crearPersona(p3);
		
		System.out.println(lista.buscarPorNombre("max"));
		System.out.println();
		System.out.println(lista.buscarPorApellido("nor"));
		System.out.println("Todos los podios: " + lista.podiosTotal());
	}
}
