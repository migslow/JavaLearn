package ej03;

public class MainCuenta {

	public static void main(String[] args) {
		ArrayListCuenta lista = new ArrayListCuenta();
		
		System.out.println(lista.crearCuenta(new CuentaBancaria("1", 200)));
		System.out.println(lista.crearCuenta(new CuentaBancaria("2", 2300)));
		System.out.println(lista.crearCuenta(new CuentaBancaria("3", 1235)));
		
		System.out.println();
		lista.retirar("1", 300);
		lista.mostrar();
	}

}
