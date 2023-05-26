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

public class MainConcesionario {
	static Scanner s = new Scanner(System.in);
	static ArrayList<Coches> lista = new ArrayList<Coches>();

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "ficheros/" + nombre;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Coches) ois.readObject());
					}
				} catch (EOFException e) {
					System.out.println("Final de fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("A ocurrido un error de E/S " + e.getMessage());
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado la clase " + e.getMessage());
			}
		}

		while (true) {
			System.out.println("\n=============MENU=============");
			System.out.println("1. Crear coche");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consulta lista");
			System.out.println("4. Modificar coche");
			System.out.println("5. Dar de baja un coche");
			System.out.println("6. Salir del fichero");
			System.out.println("\nIntroduce un numero entre 1 y 6: ");
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
				consultarLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el numeroID: ");
				int numeroID = s.nextInt();
				boolean encontrado = false;
				for (Coches c : lista) {
					if (c.getNumeroID() == numeroID) {
						System.out.println(
								"El vehiculo con el numeroID " + c.getNumeroID() + " no esta registrado en la lista");
						encontrado = false;
						break;
					}
				}
				if (!encontrado) {
					System.out.println("Introduce la matricula: ");
					String matricula = s.next();
					System.out.println("Introduce el modelo: ");
					String modelo = s.next();
					System.out.println("Introduce la marca: ");
					String marca = s.next();
					System.out.println("Introduce los caballos de potencia: ");
					int cv = s.nextInt();
					Coches cocheNuevo = new Coches(numeroID, matricula, modelo, marca, cv);
					modificarCoche(cocheNuevo);
				}
				break;
			case 5:

				break;
			case 6:
				System.out.println("Has salido del Menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 6");
				break;
			}
		}

	}

	public static void crearCoche() {
		System.out.println("Introduce el numeroID: ");
		int numeroID = s.nextInt();
		System.out.println("Introduce la matricula: ");
		String matricula = s.next();
		for (Coches c : lista) {
			if (c.getMatricula().equalsIgnoreCase(matricula)) {
				System.out.println(
						"El vehiculo con la matricula " + c.getMatricula() + " ya esta registrado en la lista");
				System.out.println("Vuelve a introducir la matricula: ");
				matricula = s.next();
			}
		}
		System.out.println("Introduce el modelo: ");
		String modelo = s.next();
		System.out.println("Introduce la marca: ");
		String marca = s.next();
		System.out.println("Introduce los caballos de potencia: ");
		int cv = s.nextInt();
		Coches coche = new Coches(numeroID, matricula, modelo, marca, cv);
		lista.add(coche);

	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream ois = new ObjectOutputStream(fos);
		for (Coches c : lista) {
			ois.writeObject(c);
		}
	}

	public static void consultarLista(String ruta) {
		System.out.println("\nCoches que estan en la lista: ");
		for (Coches c : lista) {
			System.out.println(c);
		}
	}

	public static void modificarCoche(Coches cNuevo) {
		for (Coches c : lista) {
			if (c.getNumeroID() == cNuevo.getNumeroID()) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}

	public static void darDeBajaCoche() {
		System.out.println("Introduce la matricula del coche: ");
		String matricula = s.nextLine();
		for (Coches c : lista) {
			if (c.getMatricula().equalsIgnoreCase(matricula)) {
				lista.remove(c);
			}
		}
	}
}
