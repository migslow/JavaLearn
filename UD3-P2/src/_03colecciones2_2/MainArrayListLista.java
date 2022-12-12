package _03colecciones2_2;

public class MainArrayListLista {

	public static void main(String[] args) {
		ArrayListLista l = new ArrayListLista();
		l.insertar(new Persona(1234567, 31, "Luis", "Aldea Navarro"));
		l.insertar(new Persona(2345678, 39, "Belen", "Carrera Sausan"));
		l.insertar(new Persona(3456789, 61, "Antonino", "Lasierra Gardena"));
		l.insertar(new Persona(4567890, 52, "Alberto", "Carrera Martin"));
		l.insertar(new Persona(5678901, 38, "Ana", "Ereza Ferrer"));
		l.insertar(new Persona(6789012, 25, "Clara", "Cirac Nerin"));

		System.out.println(l);
		System.out.println(l.vacia());
		System.out.println(l.tamanyo());
		System.out.println(l.recuperar(7));
		System.out.println(l.borrarPersonaPosicion(3));
		System.out.println(l);
		System.out.println(l.buscarPersonaPorDNI(123456));
		System.out.println(l.buscarPersonaPorDNI(5678901));
		System.out.println(l.borrarPersonaPorDNI(333));
		System.out.println(l.borrarPersonaPorDNI(4567890));
		System.out.println(l);
		System.out.println(l.buscarApelido("carrera"));
	}

}
