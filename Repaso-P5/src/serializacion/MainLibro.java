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

public class MainLibro {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Libro> lista = new ArrayList<Libro>();

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.next();
		String ruta = "ficheros/" + nombre;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Libro) ois.readObject());
					}
				} catch (EOFException e) {
					System.out.println("Final del fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("A ocurrido un problema de E/S " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado la clase " + e.getMessage());
			}
		}

		while (true) {
			System.out.println("=========Menu=========");
			System.out.println("1. Registrar libro");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consultar lista");
			System.out.println("4. Modificar libro");
			System.out.println("5. Eliminar libro");
			System.out.println("6. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registrarLibro();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el id del libro: ");
				int id = s.nextInt();
				System.out.println("Introduce el nombre del autor: ");
				String autor = s.next();
				System.out.println("Introduce el genero del libro: ");
				String libro = s.next();
				System.out.println("Introduce el año de publicacion: ");
				int anyo = s.nextInt();
				Libro nuevoLibro = new Libro(id, autor, libro, anyo);
				modificarLibro(nuevoLibro);
				break;
			case 5:
				eliminarLibro();
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

	public static void registrarLibro() {
		System.out.println("Introduce el id del libro: ");
		int id = s.nextInt();
		System.out.println("Introduce el nombre del autor: ");
		String autor = s.next();
		System.out.println("Introduce el genero del libro: ");
		String libro = s.next();
		System.out.println("Introduce el año de publicacion: ");
		int anyo = s.nextInt();
		Libro p = new Libro(id, autor, libro, anyo);
		lista.add(p);
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Libro l : lista) {
			oos.writeObject(l);
		}
	}

	public static void consultarLista(String ruta) {
		System.out.println("\nLos libros de la lista: ");
		for (Libro l : lista) {
			System.out.println(l);
		}
	}

	public static void modificarLibro(Libro lNuevo) {
		for (Libro l : lista) {
			if (l.getId() == lNuevo.getId()) {
				lista.remove(l);
			}
		}
	}

	public static void eliminarLibro() {
		System.out.println("Introduce el id del libro: ");
		int id = s.nextInt();
		for (Libro l : lista) {
			if (l.getId() == id) {
				lista.remove(l);
			}
		}
	}

}
