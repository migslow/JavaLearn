package ejercicios;

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

public class ej02 {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Departamento> lista = new ArrayList<Departamento>();

	public static void main(String[] args) throws FileNotFoundException, IOException {
		System.out.println("Introduce el nombre del fichero: ");
		String nombreFichero = s.nextLine();
		String ruta = "Ficheros\\" + nombreFichero;
		File f = new File(ruta);
		if (f.exists()) {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
			try {
				while (true) {
					lista.add((Departamento) ois.readObject());
				}
			} catch (EOFException e) {
				ois.close();
			}

			catch (ClassNotFoundException e) {
				System.out.println("No encontrada la clase a la hora de leer clientes del fichero");
			} catch (IOException e) {
				System.out.println("Ocurrió un error I/O al leer los clientes");
			}
		}
		while (true) {
			System.out.println("\n===== MENÚ PRINCIPAL =====");
			System.out.println("1. Crear Departamento");
			System.out.println("2. Escritura Fichero");
			System.out.println("3. Consultar Departamento");
			System.out.println("4. Salir");
			System.out.println("Introduce un numero entre el 1 y el 4: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				crearDepartamento();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				System.out.println("\nDepartamentos: ");
				for (Departamento d : lista) {
					System.out.println(d);
				}
				break;
			case 4:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;

			default:
				System.out.println("No has introducido un numero entre el 1 y el 4");
				break;
			}
		}

	}

	public static void crearDepartamento() {
		System.out.println("Introduce el numero del departamento: ");
		int numero = s.nextInt();
		System.out.println("Introduce el nombre del departamento: ");
		String nombre = s.next();
		System.out.println("Introduce la localidad del departamento: ");
		String localidad = s.next();
		Departamento d = new Departamento(numero, nombre, localidad);
		for (Departamento p : lista) {
			lista.add(d);
		}
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream salida = new ObjectOutputStream(fos);
		for (Departamento d : lista) {
			salida.writeObject(d);
		}
		fos.close();
		salida.close();
	}

}
