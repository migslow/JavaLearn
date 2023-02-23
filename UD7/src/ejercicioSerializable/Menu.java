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
			System.out.println("1. Escritura de fichero");
			System.out.println("2. Lectura de fichero");
			System.out.println("3. Lectura de clientes morosos");
			System.out.println("4. Modificacion de un cliente dentro del fichero");
			System.out.println("5. Dar de baja a un cliente dentro de un fichero");
			System.out.println("6. Salir");
			System.out.print("Introduce un numero entre el 1 y el 6: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				escrituraFichero(ruta);
				break;
			case 2:
				lecturaFichero(ruta);
				break;
			case 3:
				lecturaFicheroMorosos(ruta);
				break;
			case 4:
				modificarCliente(null);
				break;
			case 5:
				darBajaPorNif();
				break;
			case 6:
				System.out.println("Has salido del menu");
				System.exit(-1);
			default:
				System.out.println("Opción no válida");
				break;
			}
		}
	}

	public static void escrituraFichero(String ruta) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		try {
			fos = new FileOutputStream(ruta);
			salida = new ObjectOutputStream(fos);
			int opcion = 0;
			while (opcion != 2) {
				System.out.println("\n===== MENÚ ESCRITURA FICHERO =====");
				System.out.println("1. Crear cliente");
				System.out.println("2. Volver al menu principal");
				System.out.print("Introduce un numero entre el 1 y el 2: ");
				opcion = s.nextInt();
				s.nextLine();
				switch (opcion) {
				case 1:
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
					salida.writeObject(p);
					salida.close();
					break;
				case 2:
					System.out.println("Has vuelto al menu principal");
					break;
				default:
					System.out.println("Opcion no valida");
					break;
				}
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

	public static void lecturaFichero(String ruta) {
		ObjectInputStream entrada = null;
		Clientes p;
		try {
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/ventas.dat"));
			p = (Clientes) entrada.readObject();
			while (true) {
				System.out.println(p.getNombreCompleto() + " " + p.getTelefono() + " " + p.getDireccion() + " "
						+ p.getNif() + " " + p.isMoroso());
				p = (Clientes) entrada.readObject();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
		} catch (EOFException e) {
			System.out.println("Final de fichero");
		} catch (IOException e) {
			System.out.println("Ocurrio un error de E/S");
		} finally {
			try {
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	public static void lecturaFicheroMorosos(String ruta) {
		ObjectInputStream entrada = null;
		Clientes p;
		try {
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/ventas.dat"));
			p = (Clientes) entrada.readObject();
			while (true) {
				if (p.isMoroso() == true)
					System.out.println(p.getNombreCompleto() + " " + p.getTelefono() + " " + p.getDireccion() + " "
							+ p.getNif() + " " + p.isMoroso());
				p = (Clientes) entrada.readObject();
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fichero no encontrado");
		} catch (ClassNotFoundException e) {
			System.out.println("Clase no encontrada");
		} catch (EOFException e) {
			System.out.println("Final de fichero");
		} catch (IOException e) {
			System.out.println("Ocurrio un error de E/S");
		} finally {
			try {
				if (entrada != null) {
					entrada.close();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
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
