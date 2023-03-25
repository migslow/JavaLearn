package repasoSerializacion;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Hospital {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Paciente> lista = new ArrayList<Paciente>();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Introduce el nombre del fichero con extension: ");
		String nombre = s.nextLine();
		String ruta = "FicherosRepaso/" + nombre;
		File f = new File(ruta);
		if (f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					lista.add((Paciente) ois.readObject());
				}
			} catch (EOFException e) {
				ois.close();
			}
		}
		while (true) {
			System.out.println("==========MENU==========");
			System.out.println("1. Añadir paciente al registro");
			System.out.println("2. Escritura paciente registro");
			System.out.println("3. Consultar paciente registro");
			System.out.println("4. Modificar paciente registro");
			System.out.println("5. Dar alta paciente registro");
			System.out.println("6. Consultar por ID Seguridad Social");
			System.out.println("7. Consultar por nombre");
			System.out.println("8. Consultar por direccion");
			System.out.println("9. Consultar por sintomas");
			System.out.println("10. Salir del menu");
			System.out.println("Introduce un numero entre 1 y 10: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				anyadirPaciente();
				break;
			case 2:
				escrituraRegistro(ruta);
				break;
			case 3:
				consultarRegistro();
				break;
			case 4:
				System.out.println("Introduce el id de la seguridad social: ");
				int ID = s.nextInt();
				System.out.println("Introduce el nombre del paciente");
				String n = s.next();
				System.out.println("Introduce la edad del paciente: ");
				int edad = s.nextInt();
				System.out.println("Introduce la direccion del paciente: ");
				String direccion = s.next();
				System.out.println("Introduce los sintomas del paciente: ");
				String sintomas = s.next();
				Paciente pNuevo = new Paciente(ID, n, edad, direccion, sintomas);
				modificarPaciente(pNuevo);
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			case 8:

				break;
			case 9:

				break;
			case 10:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 10");
				break;
			}
		}

	} // del main

	public static void anyadirPaciente() {
		System.out.println("Introduce el id de la seguridad social: ");
		int ID = s.nextInt();
		System.out.println("Introduce el nombre del paciente");
		String nombre = s.next();
		System.out.println("Introduce la edad del paciente: ");
		int edad = s.nextInt();
		System.out.println("Introduce la direccion del paciente: ");
		String direccion = s.next();
		System.out.println("Introduce los sintomas del paciente: ");
		String sintomas = s.next();
		Paciente p = new Paciente(ID, nombre, edad, direccion, sintomas);
		lista.add(p);
	}

	public static void escrituraRegistro(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Paciente p : lista) {
			oos.writeObject(p);
		}
		
	}

	public static void consultarRegistro() {
		System.out.println("\nPacientes registrados: ");
		for (Paciente p : lista) {
			System.out.println(p);
		}
	}

	public static void modificarPaciente(Paciente pNuevo) {
		for (Paciente p : lista) {
			if (p.getIDSeguridadSocial() == pNuevo.getIDSeguridadSocial()) {
				lista.remove(p);
				lista.add(pNuevo);
			}
		}
	}

}
