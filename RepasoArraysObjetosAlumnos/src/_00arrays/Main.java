package _00arrays;

//Diciembre 2019 -  Alberto Carrera
//Repaso colecciones 

public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();

		b.annadirCuenta(new Cuenta(40, "Luis Aldea", 19000));
		b.annadirCuenta(new Cuenta(20, "Clara Cirac", 22000));
		b.annadirCuenta(new Cuenta(30, "Antonio Mariz", 29000));
		b.annadirCuenta(new Cuenta(50, "Alberto Carrera", -1300));
		b.annadirCuenta(new Cuenta(10, "Belen Carrera", 75000));

		Cuenta c1 = new Cuenta(55, "Leticia", 57000);
		b.annadirCuenta(c1);

		c1 = new Cuenta(60, "Antonino Lasierra", 156000);
		b.annadirCuenta(c1);
		
		System.out.println("Tamaño de la lista: " + b.tamanyo()); // 7
		b.mostrarCuentas();
		System.out.println("\nContiene cuenta");
		System.out.println(b.contieneCuenta(c1)); // TRUE
		System.out.println(b.contieneCuenta(new Cuenta(55, "Leticia", 57000))); // TRUE
		System.out.println(b.contieneCuenta(new Cuenta(55, "Leticia", 220))); // FALSE
		
		System.out.println("\nContiene cuenta 2");
		System.out.println(b.contieneCuenta2(new Cuenta(50, "Alberto Carrera", -1300))); // TRUE
		System.out.println(b.contieneCuenta2(new Cuenta(50, "Alberto Carrera", 0))); // FALSE
		System.out.println();
		b.mostrarCuentas();
		
		System.out.println("\nBuscar por numero de cuenta");
		System.out.println(b.buscarPorNumero(30));
		
		System.out.println("\nBorrar la cuenta por la posicion");
		System.out.println(b.borrarCuentaPorPosicion(1)); // TRUE BORRA LA PRIMERA CUENTA, LA DE N� 40.
		
		System.out.println("\nTamaño de la lista: " + b.tamanyo()); // 6
		b.mostrarCuentas();
		
		System.out.println("\nBorrar cuenta por posicion y numero");
		System.out.println(b.borrarCuentaPorPosicion(7)); // FALSE, SOLO HAY 6 CUENTAS Y LA �LTIMA ES LA 6
		System.out.println(b.borrarCuentaPorNumero(30)); // TRUE BORRA LA CUENTA 30
		
		System.out.println("\nTamaño de la lista: " + b.tamanyo()); // 5
		System.out.println(b.borrarCuentaPorNumero(222)); // FALSE NO EXISTE LA CUENTA 222

		System.out.println();
		System.out.println(b.buscarPorNombre("carrera")); // DEVUELVE LAS CUENTAS DE N� 10 Y 50
															// Cuenta [numero=50, nombre=Alberto Carrera, saldo=-1300.0]
															// Cuenta [numero=10, nombre=Bel�n Carrera, saldo=75000.0]

	} // del main

}// de Main
