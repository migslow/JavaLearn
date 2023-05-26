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

public class MainCancion {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Cancion> lista = new ArrayList<Cancion>();

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
						lista.add((Cancion) ois.readObject());
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
			System.out.println("====================Menu====================");
			System.out.println("1. Registrar musica");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consultar lista");
			System.out.println("4. Modificar musica");
			System.out.println("5. Eliminar musica");
			System.out.println("6. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registrarCancion();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el id: ");
				int id = s.nextInt();
				System.out.println("Introduce el titulo de la cancion: ");
				String t = s.next();
				System.out.println("Introduce el genero de la cancion: ");
				String g = s.next();
				System.out.println("Introduce el artista de la cancion: ");
				String a = s.next();
				System.out.println("Introduce la duracion de la cancion: ");
				int d = s.nextInt();
				Cancion cancionNuevo = new Cancion(id, t, g, a, d);
				modificarCancion(cancionNuevo);
				break;
			case 5:
				eliminarCancion();
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

	public static void registrarCancion() {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		for (Cancion c : lista) {
			if (c.getId() == id) {
				System.out.println("La cancion con id: " + id + " ya esta registrada");
				System.out.println("Introduce el id");
				id = s.nextInt();
			}
		}
		System.out.println("Introduce el titulo de la cancion: ");
		String t = s.next();
		System.out.println("Introduce el genero de la cancion: ");
		String g = s.next();
		System.out.println("Introduce el artista de la cancion: ");
		String a = s.next();
		System.out.println("Introduce la duracion de la cancion: ");
		int d = s.nextInt();
		Cancion p = new Cancion(id, t, g, a, d);
		lista.add(p);
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Cancion c : lista) {
			oos.writeObject(c);
		}
	}

	public static void consultarLista(String ruta) {
		System.out.println("\nCanciones de la lista: ");
		for (Cancion c : lista) {
			System.out.println(c);
		}
	}

	public static void modificarCancion(Cancion cNuevo) {
		for (Cancion c : lista) {
			if (c.getId() == cNuevo.getId()) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}

	public static void eliminarCancion() {
		System.out.println("Introduce el id de la cancion: ");
		int id = s.nextInt();
		for (Cancion c : lista) {
			if (c.getId() == id) {
				lista.remove(c);
			}
		}
	}

}
