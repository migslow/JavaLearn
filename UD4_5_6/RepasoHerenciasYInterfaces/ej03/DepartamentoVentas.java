package ej03;

import java.util.ArrayList;

import proyecto3.Multimedia;

public class DepartamentoVentas extends Departamento {
	
	public double calcularSalarioTotal(ArrayList<Empleado> e) {
		double total = 0;
		for (Empleado empleado : e) {
			if (empleado instanceof Departamento) {
				total = total + empleado.getSalario();
			}
		}
		return total;
	}

}
