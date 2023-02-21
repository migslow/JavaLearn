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

import SERIALIZACION.Persona;

public class Menu2 {
	
	static Scanner s = new Scanner(System.in);
	ArrayList<Clientes> lista = new ArrayList<Clientes>();

	public static void main(String[] args) {
		int opcion = 0;
		while (opcion != 6) {
			do {
				System.out.println("============MENU============");
				System.out.println("1. Introducir un cliente");
			} while (opcion < 1 || opcion > 6);
		}

	}

	public static void crearCliente() {
		System.out.println("Introduce el nombre completo del cliente: ");
		String nombre = s.nextLine();
		System.out.println("Introduce el telefono del cliente: ");
		String telefono = s.nextLine();
		System.out.println("Introduce la direccion del cliente: ");
		String direccion = s.nextLine();
		System.out.println("Introduce el nif del cliente: ");
		String nif = s.nextLine();
		System.out.println("¿Es moroso?: ");
		boolean moroso = s.nextBoolean();
		
	}
	
	public static void lectura() {
		ObjectInputStream entrada = null;
		Persona p;
		try {
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/ventas.dat"));
			p = (Persona) entrada.readObject();
			while (true) {
				System.out.println(p.getNif() + " " + p.getNombre() + " " + p.getEdad());
				p = (Persona) entrada.readObject();
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
	
	public static void escritura() {
		FileOutputStream fos = null;
		ObjectOutputStream salida = null;
		Persona p;
		try {
			fos = new FileOutputStream("Ficheros/ventas.dat");
			salida = new ObjectOutputStream(fos);
			salida.writeObject(p);
		} catch (FileNotFoundException e) {
			System.out.println("1" + e.getMessage());
		} catch (IOException e) {
			System.out.println("2" + e.getMessage());
		} finally {
			try {
				if (fos != null) {
					fos.close();
				}
				if (salida != null) {
					salida.close();
				}
			} catch (IOException e) {
				System.out.println("3" + e.getMessage());
			}
		}
	}

}
