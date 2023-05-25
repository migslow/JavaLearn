package serializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class MainCliente {

	static Scanner s = new Scanner(System.in);
	static ArrayList<clientes> lista = new ArrayList<clientes>();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String n = s.next();
		String ruta = "ficheros/" + n;
		File f = new File(ruta);
		if (f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					lista.add((clientes) ois.readObject());
				}
			} catch (EOFException e) {
				ois.close();
			}
		}

		while (true) {
			System.out.println("\n===== MENÚ PRINCIPAL =====");
			System.out.println("1. Crear cliente");
			System.out.println("2. Consultar clientes");
			System.out.println("3. Consultar clientes morosos");
			System.out.println("4. Modificacion clientes");
			System.out.println("5. Dar de baja a un cliente");
			System.out.println("6. Guardar clientes");
			System.out.println("7. Salir del programa");
			System.out.print("Introduce un numero entre el 1 y el 7: ");
			int opcion = s.nextInt();
			s.nextInt();
			switch (opcion) {
			case 1:
				crearCliente();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista();
				break;
			case 4:

				break;
			case 5:

				break;
			case 6:

				break;
			case 7:
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 7");
				break;
			}
		}

	}

	public static void crearCliente() {
		System.out.println("Introduce el nombre completo del nuevo cliente: ");
		String nombreCompleto = s.nextLine();
		System.out.println("Introduce el telefono del cliente: ");
		String telefono = s.nextLine();
		System.out.println("Introduce la direccion del cliente: ");
		String direccion = s.nextLine();
		System.out.println("Introduce el nif del cliente: ");
		String nif = s.nextLine();
		System.out.println("¿Es moroso? (true o false)");
		boolean moroso = s.nextBoolean();
		clientes p = new clientes(nombreCompleto, telefono, direccion, nif, moroso);
		for (clientes c : lista) {
			lista.add(p);
		}
	}
	
	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for(clientes c : lista) {
			System.out.println(c);
		}
	}
	
	public static void consultarLista() {
		System.out.println("\nLos clientes de la lista: ");
		for(clientes c : lista) {
			System.out.println(c);
		}
	}

}
