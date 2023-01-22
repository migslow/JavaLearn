package ej20;

public class PruebaArrayList {

	public static void main(String[] args) {
		ArrayListCuenta lista = new ArrayListCuenta();
		Cuenta c1 = new Cuenta(1234, 0);
		Cuenta c2 = new Cuenta(12345, 1500);
		Cuenta c3 = new Cuenta(123467, 2000);
		System.out.println(lista.crearCuenta(c1));
		System.out.println(lista.crearCuenta(c2));
		System.out.println(lista.crearCuenta(c3));
		System.out.println("\nIngreso");
		System.out.println(lista.ingresos(1234, 200));
		System.out.println(lista.ingresos(12345, 500));
		System.out.println("\nCargos");
		System.out.println(lista.cargos(123467, 200));
		System.out.println("\nTransferencias");
		System.out.println(lista.transferencia(1234, 12345, 100));
		System.out.println("\nMuestro lista");
		lista.mostrarLista();

	}

}
