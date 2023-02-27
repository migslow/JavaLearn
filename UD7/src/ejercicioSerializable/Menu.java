package ejercicioSerializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Clientes> lista = new ArrayList<Clientes>();

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero donde se van a introducir los clientes: ");
		String nombreFichero = s.nextLine();
		String ruta = "Ficheros/" + nombreFichero;
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
			s.nextLine();
			switch (opcion) {
			case 1:
				crearCliente();
				break;
			case 2:
				consultarClientes(ruta);
				break;
			case 3:
				consultarClientesMorosos(ruta);
				break;
			case 4:
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
				Clientes nuevo = new Clientes(nombreCompleto, telefono, direccion, nif, moroso);
				for (Clientes c : lista) {
					if (c.getNif().equalsIgnoreCase(nuevo.getNif())) {
						modificarCliente(nuevo);
					} else {
						System.out.println("El cliente con el nif " + nuevo.getNif() + " no esta creado");
					}
				}

				break;
			case 5:
				darBajaPorNif();
				break;
			case 6:
				escrituraFichero(ruta);
				break;
			case 7:
				System.out.println("Has salido del menu");
				System.exit(-1);
			default:
				System.out.println("No has introducido un numero entre 1 y 6");
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
		Clientes p = new Clientes(nombreCompleto, telefono, direccion, nif, moroso);
		for (Clientes c : lista) {
			if (c.getNif().equalsIgnoreCase(p.getNif())) {
				System.out.println("El usuario con el " + p.getNif() + " ya existe");
			} else {
				lista.add(p);
			}
		}
	}

	public static void escrituraFichero(String ruta) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		try {
			fos = new FileOutputStream(ruta);
			salida = new ObjectOutputStream(fos);
			for (Clientes c : lista) {
				salida.writeObject(c); 
			}
		} catch (FileNotFoundException e) {
			System.out.println("La ruta no existe");
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E/S");
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println("Ha ocurrido un problema de E/S");
			}
		}
	}

	public static void consultarClientes(String ruta) {
		System.out.println("Clientes guardados: ");
		for (Clientes c : lista) {
			System.out.println(c);
		}
	}

	public static void consultarClientesMorosos(String ruta) {
		System.out.println("Clientes morosos: ");
		for (Clientes c : lista) {
			if (c.isMoroso()) {
				System.out.println(c);
			}
		}
	}

	public static void modificarCliente(Clientes cNuevo) {
		for (Clientes c : lista) {
			if (c.getNif().equalsIgnoreCase(cNuevo.getNif())) {
				lista.remove(c);
				lista.add(cNuevo);
			}
		}
	}

	public static void darBajaPorNif() {
		System.out.println("Introduzca el nif del cliente que desea borrar:");
		String nif = s.nextLine();
		for (Clientes c : lista) {
			if (c.getNif().equalsIgnoreCase(nif)) {
				lista.remove(c);
			}
		}
	}
}
