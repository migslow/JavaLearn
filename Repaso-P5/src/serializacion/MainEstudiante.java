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

public class MainEstudiante {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Estudiante> lista = new ArrayList<Estudiante>();

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombreFichero = s.next();
		String ruta = "ficheros/" + nombreFichero;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Estudiante) ois.readObject());
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
			System.out.println("=================MENU=================");
			System.out.println("1. Registrar estudiante");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consulta lista");
			System.out.println("4. Modificar estudiante");
			System.out.println("5. Dar de baja a un estudiante");
			System.out.println("6. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registrarEstudiante();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el id del estudiante: ");
				int id = s.nextInt();
				System.out.println("Introduce el nombre del estudiante: ");
				String nombre = s.next();
				System.out.println("Introduce la edad del estudiante: ");
				int edad = s.nextInt();
				System.out.println("¿Va a clase?");
				boolean activo = s.nextBoolean();
				System.out.println("Introduce la media del estudiante: ");
				Double media = s.nextDouble();
				Estudiante estuNuevo = new Estudiante(id, nombre, edad, activo, edad);
				modificarEstudiante(estuNuevo);
				break;
			case 5:
				eliminarEstudiante();
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

	public static void registrarEstudiante() {
		try {
			System.out.println("Introduce el id del estudiante: ");
			int id = s.nextInt();
			System.out.println("Introduce el nombre del estudiante: ");
			String nombre = s.next();
			System.out.println("Introduce la edad del estudiante: ");
			int edad = s.nextInt();
			System.out.println("¿Va a clase?");
			boolean activo = s.nextBoolean();
			System.out.println("Introduce la media del estudiante: ");
			Double media = s.nextDouble();
			Estudiante p = new Estudiante(id, nombre, edad, activo, edad);
			lista.add(p);
		} catch (Exception e) {
			System.out.println("A ocurrido un error " + e.getMessage());
		}
	}

	public static void escrituraFichero(String ruta) {
		try {
			FileOutputStream fos = new FileOutputStream(ruta);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for (Estudiante e : lista) {
				oos.writeObject(e);
			}
		} catch (Exception e) {
			System.out.println("A ocurrido un error " + e.getMessage());
		}
	}

	public static void consultarLista(String ruta) {
		System.out.println("\nEstudiantes que se encuentran en la lista: ");
		for (Estudiante e : lista) {
			System.out.println(e);
		}
	}

	public static void modificarEstudiante(Estudiante eNuevo) {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		for (Estudiante e : lista) {
			if (e.getId() == eNuevo.getId()) {
				lista.remove(e);
				lista.add(eNuevo);
			}
		}
	}

	public static void eliminarEstudiante() {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		for (Estudiante e : lista) {
			if (e.getId() == id) {
				lista.remove(e);
			}
		}
	}

}
