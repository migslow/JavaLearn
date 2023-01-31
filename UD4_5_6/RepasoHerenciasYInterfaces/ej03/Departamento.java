package ej03;

import java.util.ArrayList;

public abstract class Departamento {

	ArrayList<Empleado> lista = new ArrayList<Empleado>();

	public void agregarEmpleado(Empleado e) {
		lista.add(e);
	}
}
