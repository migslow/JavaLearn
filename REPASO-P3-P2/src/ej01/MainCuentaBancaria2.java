package ej01;

public class MainCuentaBancaria2 {

	public static void main(String[] args) {
		HashSetCuentaBancaria lista = new HashSetCuentaBancaria();
		lista.anyadir(new CuentaBancaria(1, "Miguel", 2000, true));
		lista.anyadir(new CuentaBancaria(2, "Marta", 212310, true));
		lista.anyadir(new CuentaBancaria(3, "Pedro", 3122, false));
		lista.anyadir(new CuentaBancaria(4, "Carlos", 2123, true));
		
		System.out.println(lista.busquedaPorNumeroCuenta(2));
		System.out.println(lista.cambiarTitular(1, "Ovejero"));
		System.out.println(lista.eliminarPorNumeroCuenta(4));
		lista.mostrarLista();
		System.out.println(lista.cuentasNoActivas());
		System.out.println(lista.cambiarEstado(1, false));
		lista.mostrarLista();
		System.out.println(lista.cambiarEstado(3, true));
		lista.mostrarLista();
	}

}
