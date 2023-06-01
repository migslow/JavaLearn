package ArrayList;

public class MainAnimal {

	public static void main(String[] args) {
		ArrayListAnimal lista = new ArrayListAnimal();
		
		Animal a1 = new Animal(1, "Rox", 12, "Felino");
		Animal a2 = new Animal(2, "Lix", 9, "A");
		Animal a3 = new Animal(3, "Aux", 8, "B");
		Animal a4 = new Animal(4, "Mix", 2, "C");
		
		lista.anyadir(a1);
		lista.anyadir(a2);
		lista.anyadir(a3);
		lista.anyadir(a4);
		
		lista.mostrarLista();
		
		System.out.println(lista.buscarPorId(2));
		System.out.println(lista.buscarPorNombre("lix"));
		System.out.println(lista.cambiarNombre(2, "Rodolgo"));
		
		lista.mostrarLista();

	}

}
