package repasoSerializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Veterinario {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Mascota> lista = new ArrayList<Mascota>();

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Mascota) ois.readObject());
					}
				} catch (EOFException e) {
					ois.close();
				}

			} catch (Exception e) {
				System.out.println("A ocurrido un problema de E/S " + e.getMessage());
			}
		}

		while (true) {
			System.out.println("=========Menu=========");
			System.out.println("1. Registrar mascota");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consultar mascotas");
			System.out.println("4. Dar el Alta mascota");
			System.out.println("5. Consultar por especie");
			System.out.println("6. Consultar por edad");
			System.out.println("7. Consultar por nombre");
			System.out.println("8. Modificar registro mascota");
			System.out.println("9. Salir");
			System.out.println("Introduce un numero entre 1 y 9: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registroMascota();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarMascota();
				break;
			case 4:
				DarAlta();
				break;
			case 5:
				consultarPorEspecie();
				break;
			case 6:
				consultarPorEdad();
				break;
			case 7:
				consultarPorNombre();
				break;
			case 8:
				System.out.println("Introduce el nombre de la mascota: ");
				String n = s.next();
				System.out.println("Introduce la edad de la mascota: ");
				int edad = s.nextInt();
				System.out.println("Introduce la especie de la mascota: ");
				String especie = s.next();
				Mascota mNuevo = new Mascota(n, edad, especie);
				modificarMascota(mNuevo);
				break;
			case 9:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 9");
				break;
			}
		}

	}

	public static void registroMascota() {
		System.out.println("Introduce el nombre de la mascota: ");
		String nombre = s.next();
		System.out.println("Introduce la edad de la mascota: ");
		int edad = s.nextInt();
		System.out.println("Introduce la especie de la mascota: ");
		String especie = s.next();
		Mascota m = new Mascota(nombre, edad, especie);
		lista.add(m);
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Mascota m : lista) {
			oos.writeObject(m);
		}
	}

	public static void consultarMascota() {
		for (Mascota m : lista) {
			System.out.println(m);
		}
	}

	public static void DarAlta() {
		System.out.println("Introduce el nombre de la mascota: ");
		String nombre = s.nextLine();
		boolean encontrado = false;
		for (Mascota m : lista) {
			if (m.getNombre().equalsIgnoreCase(nombre)) {
				lista.remove(m);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("El nombre de la mascota: " + nombre
					+ " no se ha encontrado en el registro. Consulte el registro para buscar el nombre");
		}
	}

	public static void consultarPorEspecie() {
		System.out.println("Introduce la especie que quiere buscar: ");
		String e = s.nextLine();
		boolean encontrado = false;
		for (Mascota m : lista) {
			if (m.getEspecie().toLowerCase().equalsIgnoreCase(e.toLowerCase())
					&& m.getEspecie().toUpperCase().equalsIgnoreCase(e.toUpperCase())) {
				System.out.println(m);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("La especie " + e + " no se encuentra en el registro");
		}
	}

	public static void consultarPorEdad() {
		System.out.println("Introduce la edad que quiere buscar: ");
		int e = s.nextInt();
		boolean encontrado = false;
		for (Mascota m : lista) {
			if (m.getEdad() == e) {
				System.out.println(m);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println(
					"Si ha introducido un numero alto es posible que la edad de la mascota no se encuntre en el registro");
		}
	}

	public static void consultarPorNombre() {
		System.out.println("Introduce el nombre que quiere buscar: ");
		String e = s.nextLine();
		boolean encontrado = false;
		for (Mascota m : lista) {
			if (m.getNombre().toLowerCase().equalsIgnoreCase(e.toLowerCase())
					&& m.getNombre().toUpperCase().equalsIgnoreCase(e.toUpperCase())) {
				System.out.println(m);
				encontrado = true;
			}
		}
		if (!encontrado) {
			System.out.println("El nombre " + e + " no esta en el registro");
		}
	}

	public static void modificarMascota(Mascota mNuevo) {
		for (Mascota m : lista) {
			if (m.getNombre().equalsIgnoreCase(mNuevo.getNombre())) {
				lista.remove(m);
				lista.add(mNuevo);
			}
		}
	}

}
