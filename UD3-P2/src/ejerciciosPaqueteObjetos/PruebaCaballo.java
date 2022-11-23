package ejerciciosPaqueteObjetos;

public class PruebaCaballo {

	public static void main(String[] args) {

		Caballo c1 = new Caballo("Viento", 10, 2.25, "Negro", 90, "Siches", 230);
		Caballo c2 = new Caballo("Perdigon", 23, 1.89, "Blanco", 100, "Arabigo", 270);

		c1.relincha();
		c1.CorreCon(c2);

		System.out.println(c1);
		System.out.println(c2);

		System.out.println(c1.compite1(c2).getNombre());

		// Otra forma de mostrar el metodo por pantalla pero no sale el nombre del
		// caballo
		// c1.compite2(c2);
	}

}
