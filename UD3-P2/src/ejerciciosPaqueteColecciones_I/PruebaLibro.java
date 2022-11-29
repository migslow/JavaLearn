package ejerciciosPaqueteColecciones_I;

public class PruebaLibro {

	public static void main(String[] args) {
		Persona persona = new Persona(1241262346, 28,"Liang, Y. Daniel" , "");
		Fecha fecha = new Fecha(16, 11, 2001);

		Libro l1 = new Libro("Introduction to Java Programming", 3, persona, "0-13-031997-X",
				"Prentice-Hall", "New Jersey (USA)", fecha, 784);
		
		System.out.println(l1);

	}

}
