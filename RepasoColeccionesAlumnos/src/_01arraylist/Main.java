package _01arraylist;

public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();

		b.annadirCuenta(new Cuenta(40, "Luis Aldea", 19000));
		b.annadirCuenta(new Cuenta(20, "Clara Cirac", 22000));
		b.annadirCuenta(new Cuenta(30, "Antonio M�riz", 29000));
		b.annadirCuenta(new Cuenta(50, "Alberto Carrera", -1300));
		b.annadirCuenta(new Cuenta(10, "Bel�n Carrera", 75000));
		//
		//
		
		Cuenta c1 = new Cuenta(55, "Leticia", 57000);
		b.annadirCuenta(c1);
		System.out.println("\nBorrar Cuenta sin mas");
		System.out.println(b.borrarCuenta(c1)); // TRUE Borro la cuenta que acabo de crear
		System.out.println(b.borrarCuenta(new Cuenta(10, "Bel�n Carrera", 75000))); // FALSE
		System.out.println("\nBorrar Cuenta por numero");
		System.out.println(b.borrarCuentaPorNumero(30)); // TRUE Borro la cuenta n�mero 30
		System.out.println(b.borrarCuentaPorNumero(25)); // FALSE No Burro una cuenta que no existe

		System.out.println("\nMustra todas las cuentas");
		b.mostrarCuentas();
		
		c1 = new Cuenta(60, "Antonino Lasierra", 156000);
		
		System.out.println("\nAñade una cuenta");
		b.annadirCuenta(c1);
		
		System.out.println("\nContiene cuenta");
		System.out.println(b.contieneCuenta(c1)); // TRUE
		System.out.println(b.contieneCuenta(new Cuenta(40, "Luis Aldea", 19000)));// FALSE
		
		System.out.println("\nContiene cuenta mejorado");
		System.out.println(b.contieneCuentaMejorado(c1)); // TRUE
		System.out.println(b.contieneCuentaMejorado(new Cuenta(40, "Luis Aldea", 19000)));// TRUE
		//
		System.out.println();
		System.out.println(b.buscarPorNombre("CARRERA"));// Imprime cuentas 10 y 50

		// b.mostrarCuentas();
	} // del main
	
}// de Main
