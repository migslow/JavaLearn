package _01objetos;

public class PruebaLibro {
	public static void main(String[] args) {

		Libro libro1 = new Libro();
		Libro libro2 = new Libro();
		Libro libro3 = new Libro("111111");
		Libro libro4 = new Libro("98347523049752093", "Descubriendo a Coco", "Charles", 923);
		Libro libro5 = new Libro();
		Libro libro6 = new Libro();

		libro4.setAutor("Miguel Ovejero");
		libro4.prestar();

		libro5.setIsbn("9788426417213");
		libro5.setTitulo("Descubriendo a Coco");
		libro5.setAutor("Edmonde Charles-Roux");
		libro5.setNumeroPaginas(584);

		libro6.setIsbn("9788475069364");
		libro6.setTitulo("Grace Memorias");
		libro6.setAutor("Grace Coddington");
		libro6.setNumeroPaginas(416);

		System.out.println(libro3);
		System.out.println(libro4);
		libro4.prestar();
		System.out.println(libro5);
		System.out.println(libro6);

	}
}
