package proyecto2;

public class MainArrayListBiblioteca {

	public static void main(String[] args) {
		ArrayListBiblioteca publicaciones = new ArrayListBiblioteca();

		publicaciones.anyadir(new Libro(1, "Piter Pan", 1911));
		publicaciones.anyadir(new Libro(2, "Harry Potter", 1984));
		
		publicaciones.anyadir(new Revista(1, "Salvame limon", 2021, 1223));
		publicaciones.anyadir(new Revista(2, "Salvame naranja", 2022, 512));
		
		publicaciones.mostrarElementos();
		
		publicaciones.prestar();
		
		System.out.println("\nLibros prestados: ");
		System.out.println(publicaciones.cuentaPrestados());
		
		System.out.println("\nPublicaciones anteriores: ");
		System.out.println(publicaciones.publicacionesAnteriores(1980));
	}

}
