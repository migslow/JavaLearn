package serializacion01;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuCoches {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Coche> lista = new ArrayList<Coche>();

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombreFichero = s.nextLine();
		String ruta = "fichero/" + nombreFichero;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Coche) ois.readObject());
					}
				} catch (EOFException e) {
					System.out.println("Fin del fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("Se ha producido un problema de E/S " + e.getMessage());
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado la clase");
			}
		}

		while (true) {
			System.out.println("=======MENU=======");
			System.out.println("1. Añadir coche");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consultar lista");
			System.out.println("4. Modificar registro");
			System.out.println("5. Eliminar registro");
			System.out.println("6. Salir del menu");
			System.out.println("Introduce un numero entre 1 y 6");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				crearCoche();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista();
				break;
			case 4:
				System.out.println("Introduce el id: ");
				int id = s.nextInt();
				System.out.println("Introduce la matricula: ");
				String matricula = s.next();
				System.out.println("Introduce la marca: ");
				String marca = s.next();
				System.out.println("Introduce el modelo: ");
				String modelo = s.next();
				System.out.println("Introduce los CV: ");
				int cv = s.nextInt();
				Coche cNuevo = new Coche(id, matricula, marca, modelo, cv);
				modificarCoche(cNuevo);
				break;
			case 5:
				eliminarCoche();
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

	public static void crearCoche() {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		System.out.println("Introduce la matricula: ");
		String matricula = s.next();
		System.out.println("Introduce la marca: ");
		String marca = s.next();
		System.out.println("Introduce el modelo: ");
		String modelo = s.next();
		System.out.println("Introduce los CV: ");
		int cv = s.nextInt();
		Coche c = new Coche(id, matricula, marca, modelo, cv);
		lista.add(c);

	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Coche c : lista) {
			oos.writeObject(c);
		}
	}

	public static void consultarLista() {
		for (Coche c : lista) {
			System.out.println(c);
		}
	}

	public static void modificarCoche(Coche cNuevo) {
		for (Coche c : lista) {
			if (c.getNumeroID() == cNuevo.getNumeroID()) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}

	public static void eliminarCoche() {
		System.out.println("Introduce el id del coche: ");
		int id = s.nextInt();
		for (Coche c : lista) {
			if (c.getNumeroID() == id) {
				lista.remove(c);
			}
		}
	}

}
