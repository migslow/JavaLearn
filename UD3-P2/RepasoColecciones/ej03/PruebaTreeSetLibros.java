package ej03;
// PruebaListaLibros.java: prueba de la clase ArrayListLibros

public class PruebaTreeSetLibros {
	public static void main(String args[]) {
		Persona p1 = new Persona(435762, 31, "Javier", "Hernandez Perez");
		Fecha f1 = new Fecha(16, 11, 2001);
		Libro l1 = new Libro("Introducci�n a Java", p1, "0-13-031997-X", 546, 3, "Prentice-Hall", "Madrid-Espa�a", f1);

		Libro l2 = new Libro("Beginning Java", p1, "0-13-031997-X", 546, 3, "Addison", "Madrid-Espa�a", f1);
		Libro l3 = new Libro("Avanzado c#", p1, "0-13-031997-X", 546, 3, "McGraw-Hill", "Madrid-Espa�a", f1);

		TreeSetLibros a = new TreeSetLibros();
		System.out.println(a.vacia());
		System.out.println(a.insertar(l1));
		System.out.println(a.insertar(l2));
		System.out.println(a.insertar(l3));
		System.out.println(a.buscarTodos("java"));
		System.out.println(a.contiene(new Libro("Beginning Java", p1, "0-13-031997-X", 546, 3, "Addison", "Madrid-Espa�a", f1)) + "\n");
		
		System.out.println(a);
	}
}