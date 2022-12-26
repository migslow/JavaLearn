
public class MainCaballo {
	public static void main(String[] args) {
		ArrayListCaballo lista = new ArrayListCaballo();
		lista.insertar(new Caballo("Gold", 15, 110));
		lista.insertar(new Caballo("newMan", 12, 90));
		lista.insertar(new Caballo("BlackJack", 45, 50));
		System.out.println(lista);
		System.out.println(lista.eliminar(1));
		System.out.println(lista.recuperar(1));
		System.out.println(lista);

		System.out.println("\nComparar por edad");
		lista.ordenarPorEdad();
		System.out.println(lista);

		System.out.println("\nComparar por nombre");
		lista.ordenarPorNombre();
		System.out.println(lista);

	}

}
