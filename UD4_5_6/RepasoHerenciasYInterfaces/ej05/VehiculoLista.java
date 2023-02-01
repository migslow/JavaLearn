package ej05;

import java.util.ArrayList;

import proyecto1.Disco;
import proyecto1.Multimedia;

public class VehiculoLista {
	ArrayList<Persona> lista = new ArrayList<Persona>();

	public void crearPersona(Persona p) {
		lista.add(p);
	}
	
	public String buscarPorNombre(String n) {
		String mensaje = "Elementos de la lista encontrados por: " + n + ": ";
		for (Persona p : lista) {
			if (p instanceof Piloto) {
				if (((Piloto) p).getNombre().toLowerCase().contains(n.toLowerCase())) {
					mensaje = mensaje + "\n" + p;
				}
			}
		}
		return mensaje;
	}
	
	public String buscarPorApellido(String a) {
		String mensaje = "Elementos de la lista encontrados por: " + a + ": ";
		for(Persona p : lista) {
			if(p instanceof Piloto) {
				if(p.getApellido().toLowerCase().contains(a.toLowerCase())) {
					mensaje = mensaje + "\n" + p;
				}
			}
		}
		return mensaje;
	}
	
	public int podiosTotal() {
		int total = 0;
		for(Persona p : lista) {
			if(p instanceof Piloto) {
				total = total + ((Piloto)p).getPodios();
			}
		}
		return total;
	}

	public void mostrarInformacion() {
		for (Persona p : lista) {
			System.out.println(p);
		}
	}

}
