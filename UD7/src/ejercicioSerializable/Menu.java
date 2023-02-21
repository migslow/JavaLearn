package ejercicioSerializable;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashSet;
import java.util.Scanner;

public class Menu {

	static Scanner s = new Scanner(System.in);

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
			while (p.isMoroso() == true) {
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
	
	public static void modificacionFicheroClientes(String ruta) {
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
	
	public static void darBajaPorNif(String ruta, String nif) {
		ObjectInputStream entrada = null;
		Clientes p;
		try {
			HashSet<Clientes> lista = new HashSet<Clientes>();
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/ventas.dat"));
			p = (Clientes) entrada.readObject();
			for(Clientes l : lista) {
				if(l.getNif().equals(nif)){
					lista.remove(l);
				}
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

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del fichero donde se van a introducir los clientes: ");
		String nombreFichero = s.nextLine();
		String ruta = "Ficheros/" + nombreFichero;
		
		System.out.println("Introduce el nif que se va ha pasar por argumento: ");
		String nif = s.nextLine();
		
		escrituraFichero(ruta);
		System.out.println("\nLectura del fichero: ");
		lecturaFichero(ruta);
		System.out.println("\nLectura de morosos: ");
		lecturaFicheroMorosos(ruta);
		System.out.println("\nDar de baja por nif: ");
		darBajaPorNif(ruta, nif);

	}

}
