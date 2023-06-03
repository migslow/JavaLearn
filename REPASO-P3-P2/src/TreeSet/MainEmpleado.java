package TreeSet;

public class MainEmpleado {

	public static void main(String[] args) {
		EmpleadoTreeSet lista = new EmpleadoTreeSet();
		lista.anyadir(new Empleado(1, "Miguel", "Programador", 1200.95));
		lista.anyadir(new Empleado(2, "Olga", "Auna", 1100.25));
		
		lista.mostrarLista();
		
		

		

	}

}
