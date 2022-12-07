package ejerciciosPaqueteColecciones_I.ejercicios1y2;

import _02colecciones1.Lista;

public class PruebaCD {

	public static void main(String[] args) {
		Cancion c1 = new Cancion("Back in Black", "AC/DC");
		Cancion c2 = new Cancion("Mandanga Style", "Amador riva");
		Cancion c3 = new Cancion();

		c3.ponTitulo("Thriller");
		c3.ponAutor("Michael Jackson");
		c2.ponAutor("Amador rivas");
		System.out.println(c3.dameTitulo());
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);

		System.out.println();

		CD cd = new CD();
		System.out.println(cd.agregaCancion(c1));
		System.out.println(cd.agregaCancion(c2));
		System.out.println(cd.agregaCancion(c3));
		System.out.println(cd);
		System.out.println(cd.numeroCanciones() + " canciones");
		System.out.println(cd.dameCancion(2));
		System.out.println(cd.grabarCancion(2, new Cancion("Waka Waka", "Sakira")));
		System.out.println(cd);
		System.out.println(cd.eliminarCancion(3));
		System.out.println(cd);

	}

}
