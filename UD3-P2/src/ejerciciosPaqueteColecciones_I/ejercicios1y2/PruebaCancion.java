package ejerciciosPaqueteColecciones_I.ejercicios1y2;

public class PruebaCancion {

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

	}

}
