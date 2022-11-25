package ejerciciosPaqueteColecciones_I;

public class PruebaCancion {

	public static void main(String[] args) {
		
		Cancion c1 = new Cancion ("Back in Black", "AC/DC");
		Cancion c2 = new Cancion();
		
		System.out.println(c1);
		c1.dameTitulo();
		c1.dameAutor();
		System.out.println();
		c2.ponTitulo("La macarena");
		c2.ponAutor("Los del rio");
		System.out.println(c2);
		c2.dameTitulo();
		c2.dameAutor();

	}

}
