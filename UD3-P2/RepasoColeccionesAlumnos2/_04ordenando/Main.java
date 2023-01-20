package _04ordenando;

import java.util.Collections;

public class Main {

	public static void main(String[] args) {
		Banco b = new Banco();
		
		b.annadirCuenta(new Cuenta(40, "Luis Aldea", 19000));
		b.annadirCuenta(new Cuenta(20, "Clara Cirac", 22000));
		b.annadirCuenta(new Cuenta(30, "Antonio Mériz", 29000));
		b.annadirCuenta(new Cuenta(50, "Alberto Carrera", -1300));
		b.annadirCuenta(new Cuenta(10, "Belén Carrera", 75000));
		//
		//
		System.out.println("Ordenación natural por número de cuenta");
		b.ordenacionPorNumero();
		b.mostrarCuentas();
		//
		System.out.println("\n\nOrdenación por Titular");
		b.ordenacionPorTitular();
		b.mostrarCuentas();
		
	    System.out.println("\n\nOrdenación por saldo al estilo Java 8 con Stream");
	    b.ordenacionPorSaldo();
		b.mostrarCuentas();
		

		
		
	} // del main

}// de Main
