package ej23;

public class MainSet {
	
	public static void main(String[] args) {
		ejercicioSet ej = new ejercicioSet();
		Pais p1 = new Pais("España", 47000000);
		Pais p2 = new Pais("México", 120000000);
		Pais p3 = new Pais("Colombia", 49000000);
		Pais p4 = new Pais("Argentina", 43000000);
		Pais p5 = new Pais("Perú", 31000000);

		ej.crearPais(p1);
		ej.crearPais(p2);
		ej.crearPais(p3);
		ej.crearPais(p4);
		ej.crearPais(p5);
		ej.mostrarPaises();

		ej.crearPais1(p1);
		ej.crearPais1(p2);
		ej.crearPais1(p3);
		ej.crearPais1(p4);
		ej.crearPais1(p5);
		ej.mostrarPaises1();

		ej.eliminarPais("España");
		ej.eliminarPais1("Perú");
		System.out.println("Países después de eliminar España y Perú:");
		ej.mostrarPaises();
		ej.mostrarPaises1();
	}
	

}
