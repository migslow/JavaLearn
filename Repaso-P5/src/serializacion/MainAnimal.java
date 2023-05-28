package serializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MainAnimal {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Animal> lista = new ArrayList<Animal>();

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el fichero con extension: ");
		String nombre = s.next();
		String ruta = "ficheros/" + nombre;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Animal) ois.readObject());
					}
				} catch (EOFException e) {
					System.out.println("Final del fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("A ocurrido un problema " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado la clase " + e.getMessage());
			}
		}

		while (true) {
			System.out.println("=====Menu=====");
			System.out.println("1. Registrar animal");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consulta lista");
			System.out.println("4. Modificar registro");
			System.out.println("5. Eliminar registro");
			System.out.println("6. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registrarAnimal();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el id del animal: ");
				int id = s.nextInt();
				System.out.println("Introduce el nombre: ");
				String nombrea = s.next();
				System.out.println("Introduce la edad: ");
				int edad = s.nextInt();
				System.out.println("Introduce la especie: ");
				String especie = s.next();
				Animal animalNuevo = new Animal(id, nombrea, edad, especie);
				modificarAnimal(animalNuevo);
				break;
			case 5:
				eliminarAnimal();
				break;
			case 6:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 6");
				break;
			}
		}

	}

	public static void registrarAnimal() {
		try {
			System.out.println("Introduce el id del animal: ");
			int id = s.nextInt();
			System.out.println("Introduce el nombre: ");
			String nombre = s.next();
			System.out.println("Introduce la edad: ");
			int edad = s.nextInt();
			System.out.println("Introduce la especie: ");
			String especie = s.next();
			Animal p = new Animal(id, nombre, edad, especie);
			lista.add(p);
		} catch (Exception e) {
			System.out.println("A ocurrido un problema " + e.getMessage());
		}
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Animal a : lista) {
			oos.writeObject(oos);
		}

	}

	public static void consultarLista(String ruta) {
		System.out.println("\nAnimales que se encuentrar en la lista: ");
		for (Animal a : lista) {
			System.out.println(a);
		}
	}

	public static void modificarAnimal(Animal aNuevo) {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		for (Animal a : lista) {
			if (a.getId() == id) {
				lista.remove(a);
				lista.add(aNuevo);
			}
		}
	}
	
	public static void eliminarAnimal() {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		for (Animal a : lista) {
			lista.remove(a);
		}
	}

}
