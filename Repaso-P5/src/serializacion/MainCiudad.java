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

public class MainCiudad {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Ciudad> lista = new ArrayList<Ciudad>();

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
						lista.add((Ciudad) ois.readObject());
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
			System.out.println("============Menu============");
			System.out.println("1. Registrar ciudad");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consulta fichero");
			System.out.println("4. Modificar ciudad");
			System.out.println("5. Eliminar ciudad");
			System.out.println("6. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				registrarCiudad();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultaLista(ruta);
				break;
			case 4:
				System.out.println("Introduce el id: ");
				int id = s.nextInt();
				System.out.println("Introduce el nombre del pais: ");
				String pais =s.next();
				System.out.println("Introduce el nombre de la ciudad: ");
				String ciudad =s.next();
				System.out.println("Introduce el numero de poblacion: ");
				int poblacion = s.nextInt();
				Ciudad ciudadNuevo = new Ciudad(id, pais, nombre, poblacion);
				modificarCiudad(ciudadNuevo);
				break;
			case 5:
				eliminarCiudad();
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
	
	public static void registrarCiudad() {
		System.out.println("Introduce el id: ");
		int id = s.nextInt();
		System.out.println("Introduce el nombre del pais: ");
		String pais =s.next();
		System.out.println("Introduce el nombre de la ciudad: ");
		String ciudad =s.next();
		System.out.println("Introduce el numero de poblacion: ");
		int poblacion = s.nextInt();
		Ciudad p = new Ciudad(id, pais, ciudad, poblacion);
		lista.add(p);
	}
	
	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(Ciudad c : lista) {
			oos.writeObject(c);
		}
	}
	
	public static void consultaLista(String ruta) {
		System.out.println("\nLa lista de ciudades es: ");
		for(Ciudad c : lista) {
			System.out.println(c);
		}
	}
	
	public static void modificarCiudad(Ciudad cNuevo) {
		for(Ciudad c : lista) {
			if(c.getId() == cNuevo.getId()) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}
	
	public static void eliminarCiudad() {
		System.out.println("Introduce el id de la ciudad: ");
		int id = s.nextInt();
		for(Ciudad c : lista) {
			if(c.getId() == id) {
				lista.remove(c);
			}
		}
	}

}
