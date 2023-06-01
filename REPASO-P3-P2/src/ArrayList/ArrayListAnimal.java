package ArrayList;

import java.util.ArrayList;

public class ArrayListAnimal {
	private ArrayList<Animal> lista = new ArrayList<Animal>();

	public boolean vacia() {
		return lista.isEmpty();
	}

	public int tamanyo() {
		return lista.size();
	}

	public Animal anyadir(Animal a) {
		lista.add(a);
		return a;
	}

	public String buscarPorId(int id) {
		String encontrados = "Animal encontrado por el id: " + id + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getId() == id) {
				encontrados = encontrados + lista.get(i);
			}
		}
		return encontrados;
	}

	public String buscarPorNombre(String nombre) {
		String encontrados = "Animal encontrados por el nombre: " + nombre + "\n";
		for (int i = 0; i < tamanyo(); i++) {
			if (lista.get(i).getNombre().toLowerCase().contains(nombre.toLowerCase())
					&& lista.get(i).getNombre().toUpperCase().contains(nombre.toUpperCase())) {
				encontrados = encontrados + lista.get(i) + "\n";
			}
		}
		return encontrados;
	}
	
	public String cambiarNombre(int id, String nombre) {
		String escrito = "";
		for (int i = 0; i < tamanyo(); i++) {
			if(lista.get(i).getId() == id) {
				lista.get(i).setNombre(nombre);
			}
		}
		escrito = "El nuevo nombre es " + nombre;
		return escrito;
	}

	public void mostrarLista() {
		for (Animal a : lista) {
			System.out.println(a);
		}
	}

}
