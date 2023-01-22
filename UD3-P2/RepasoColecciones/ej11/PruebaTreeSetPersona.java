package ej11;

public class PruebaTreeSetPersona {

	public static void main(String[] args) {
		TreeSetPersona lista = new TreeSetPersona();
		
		System.out.println(lista.crearPersona(new Persona("Miguel", "Ovejero", "Masculino", 20)));
		System.out.println(lista.crearPersona(new Persona("Anass", "bouyaidi", "Masculino", 24)));
		System.out.println(lista.crearPersona(new Persona("Jaime", "Salinas", "Masculino", 20)));
		System.out.println(lista.crearPersona(new Persona("Albero", "Lores", "Masculino", 19)));
		System.out.println(lista.crearPersona(new Persona("David", "Cano", "Masculino", 43)));
		System.out.println(lista.crearPersona(new Persona("Marina", "Buil", "Femenino", 26)));
		System.out.println(lista.crearPersona(new Persona("Alberto", "Carrera", "Masculino", 52)));
		System.out.println();
		lista.retornarNombreGenero();
		System.out.println();
		lista.mediaEdad();
		System.out.println();
		lista.cantidadM();
		System.out.println();
		lista.cantidadF();
	}

}
