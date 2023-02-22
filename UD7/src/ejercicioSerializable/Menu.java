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
		Scanner scanner = new Scanner(System.in);
		int opcion = 0;
		while (opcion != 5) {
			System.out.println("===== MENÚ =====");
			System.out.println("1. Escritura de fichero");
			System.out.println("2. Lectura de fichero");
			System.out.println("3. Modificacion de un cliente dentro del fichero");
			System.out.println("4. Dar de baja a un cliente dentro de un fichero");
			System.out.println("5. Salir");
			System.out.print("Introduce un numero entre el 1 y el 5: ");
			opcion = scanner.nextInt();
			switch (opcion) {
			case 1:
				escrituraFichero(ruta);
				break;
			case 2:
				lecturaFichero(ruta);
				break;
			case 3:
				modificarCliente(null);
				break;
			case 4:
				darBajaPorNif();
				break;
			case 5:
				System.out.println("Has salido del menu");
				break;
			default:
				System.out.println("Opción no válida");
				break;
			}
		}
	}

	public static void escrituraFichero(String ruta) {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Clientes p;
		try {
			fos = new FileOutputStream(ruta);
			salida = new ObjectOutputStream(fos);
			p = new Clientes("Alberto Carrera Mart�n", "4982349823", "4 Puertas", "A4234234234", true);
			salida.writeObject(p);
			p = new Clientes("Miguel Ovejero Piedrafita", "4982349823", "5 Puertas", "B4234234234", false);
			salida.writeObject(p);
			p = new Clientes("David Cano Escario", "2332349823", "6 Puertas", "C4234234234", true);
			salida.writeObject(p);
			p = new Clientes("Alberto Lores Quintana", "231231823", "7 Puertas", "D4234234234", false);
			salida.writeObject(p);
			p = new Clientes("Pablo Motos Motos", "456245362", "8 Puertas", "E4234234234", true);
			salida.writeObject(p);
			p = new Clientes("Maria Camion Camion", "2435234523", "9 Puertas", "F4234234234", true);
			salida.writeObject(p);
			salida.close();
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