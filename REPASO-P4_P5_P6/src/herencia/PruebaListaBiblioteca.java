package herencia;

public class PruebaListaBiblioteca {
	public static void main(String[] args) {
		ListaBiblioteca lista = new ListaBiblioteca();
		Biblioteca l1 = new Libro("1234", "La Biblia", 0, false);
		Biblioteca l2 = new Libro("2345", "El Quijote", 1700, false);
		Biblioteca r1 = new Revista("3456", "Muy interesante", 2010, 45);
		Biblioteca r2 = new Revista("4567", "Cañamo", 2020, 12);
		lista.anyadir(l1);
		lista.anyadir(l2);
		lista.anyadir(r1);
		lista.anyadir(r2);
		lista.mostrarLista();
		System.out.println(lista.cuentaPrestados());
		System.out.println(lista.publicacionesAnteriores(1980));
	}
}
