package ejercicioSerializable;

import java.util.ArrayList;

public class TEST {

	public static void main(String[] args) {
		ArrayList<Departamento> lista = new ArrayList<Departamento>();
		
		Departamento d1 = new Departamento(1, "Informatica", "Huesca");
		lista.add(d1);
		
		for (Departamento d : lista) {
			System.out.println(d);
		}
		
	}

}
