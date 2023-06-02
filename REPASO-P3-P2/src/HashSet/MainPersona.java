package HashSet;

public class MainPersona {

	public static void main(String[] args) {
		HashSetPersona lista = new HashSetPersona();
		lista.anyadir(new Persona(1, "a", "c", 12, 145));
		lista.anyadir(new Persona(2, "b", "b", 12, 145));
		lista.anyadir(new Persona(3, "c", "a", 12, 145));
		
		lista.mostrarLista();
		
		System.out.println("\n");
		lista.buscarPorNombre("a");

	}

}
