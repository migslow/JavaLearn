package _06treeset;

public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		
		b.annadirCuenta(new Cuenta(40, "Luis Aldea", 19000));
		b.annadirCuenta(new Cuenta(20, "Clara Cirac", 22000));
		b.annadirCuenta(new Cuenta(30, "Antonio M�riz", 29000));
		b.annadirCuenta(new Cuenta(50, "Alberto Carrera", -1300));
		b.annadirCuenta(new Cuenta(10, "Bel�n Carrera", 75000));
		b.annadirCuenta(new Cuenta(20, "Clara Cirac", 1));// No lo a�ade- repetido
		b.mostrarCuentas();
		//
		//
		Cuenta c1= new Cuenta(55, "Leticia", 57000);
		System.out.println("El hascode de Leticia es: " + c1.hashCode());
		b.annadirCuenta(c1);
		System.out.println(b.borrarCuenta(c1)); //TRUE Borro la cuenta que acabo de crear
		System.out.println(b.borrarCuenta(new Cuenta(10, "Bel�n Carrera", 75000))); // TRUE
		
		System.out.println(b.borrarCuentaPorNumero(30)); //TRUE Borro la cuenta n�mero 30
		System.out.println(b.borrarCuentaPorNumero(25)); //FALSE No Borro una cuenta que no existe
		
		b.mostrarCuentas();
		
		c1 = new Cuenta(60, "Antonino Lasierra", 156000);
		b.annadirCuenta(c1);
		System.out.println(b.contieneCuenta(c1)); // TRUE
		System.out.println(b.contieneCuenta(new Cuenta(40, "Luis Aldea", 19000)));// TRUE
		System.out.println(b.contieneCuentaMejorado(c1)); //TRUE
		System.out.println(b.contieneCuentaMejorado(new Cuenta(40, "Luis Aldea", 19000)));//TRUE
		//
		System.out.println(b.buscarPorNombre("AR"));// Imprime cuentas 20 Y 50
		
		b.mostrarCuentas();
	} // del main

}// de Main
