package _03arraylist_equals;

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
		System.out.println(b.borrarCuenta(c1)); // TRUE Borro la cuenta que acabo de crear
		System.out.println(b.borrarCuenta(new Cuenta(10, "Bel�n Carrera", 75000))); // TRUE TRUE TRUE!!!
		c1 = new Cuenta(60, "Antonino Lasierra", 156000);
		b.annadirCuenta(c1);
		System.out.println(b.contieneCuenta(c1)); // TRUE
		System.out.println(b.contieneCuenta(new Cuenta(40, "Luis Aldea", 19000)));// TRUE TRUE TRUE !!!

		b.mostrarCuentas();

	} // del main

}// de Main
