package ej09;

public class PruebaArrayListDisco {

	public static void main(String[] args) {
		ArrayListDisco lista = new ArrayListDisco();
		lista.crearDisco(new Disco(1, "Back in Black", "AC/DC", "Rock", "MP4", 4.22));
		lista.crearDisco(new Disco(2, "Thiller", "Michael Jackson", "Pop", "MP4", 3.54));
		lista.crearDisco(new Disco(3, "Algodon de azucar", "Chema Rivas", "Pop", "MP4", 2.59));
		
		System.out.println(lista.buscarPorAutor("a"));
		System.out.println(lista.buscarPorCodigo(2));
		System.out.println(lista.buscarPorDuracion(4.22));
		System.out.println(lista.buscarPorFormato("MP4"));
		System.out.println(lista.buscarPorGenero("Pop"));
		System.out.println(lista.buscarPorTitulo("Azucar"));
		
		System.out.println();
		System.out.println(lista.cambiarDuracion(1, 8.56));
		
		System.out.println();
		lista.mostrarIterator();

	}

}
