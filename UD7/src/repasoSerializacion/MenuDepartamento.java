package repasoSerializacion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuDepartamento {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Departamento> lista = new ArrayList<Departamento>();

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		System.out.println("Introduce el nombre del fichero con extension donde se guardan todos los deparatamentos: ");
		String nombreFichero = s.nextLine();
		String ruta = "FicherosRepaso/" + nombreFichero;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				while (true) {
					lista.add((Departamento) ois.readObject());
				}
			} catch (Exception e) {
				// TODO: handle exception
			}

		}
		while (true) {
			System.out.println("=================MENU=================");
			System.out.println("1. Crear departamento");
			System.out.println("2. Escritura Fichero");
			System.out.println("3. Consultar los departamentos");
			System.out.println("4. Modificar departamento");
			System.out.println("5. Desmantelar departamento");
			System.out.println("6. Salir");
			System.out.println("Introduce un numero entre 1 y 6: ");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				crearDepartamento();
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarDepartamentos();
				break;
			case 4:
				System.out.println("Introduce el ID del departamento: ");
				int numeroID = s.nextInt();
				System.out.println("Introduce el nombre del departamento: ");
				String nombre = s.next();
				System.out.println("Introduce el numero de empleados dentro de ese departamento: ");
				int numeroEmpleados = s.nextInt();
				System.out.println("Introduce la ubicacion del departamento dentro de la empresa: ");
				String ubicacion = s.next();
				System.out.println("Introduce el presupuesto anual que se destina a ese departamento: ");
				double presupuestoAnual = s.nextDouble();
				Departamento dNuevo = new Departamento(numeroID, nombre, numeroEmpleados, ubicacion, presupuestoAnual);
				for (Departamento d : lista) {
					if (d.getNombre().equalsIgnoreCase(dNuevo.getNombre())) {
						modificarDepartamento(dNuevo);
					}
				}
				break;
			case 5:
				darDeBajaDepartamento();
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

	public static void crearDepartamento() {
		System.out.println("Introduce el ID del departamento: ");
		int numeroID = s.nextInt();
		System.out.println("Introduce el nombre del departamento: ");
		String nombre = s.next();
		System.out.println("Introduce el numero de empleados dentro de ese departamento: ");
		int numeroEmpleados = s.nextInt();
		System.out.println("Introduce la ubicacion del departamento dentro de la empresa: ");
		String ubicacion = s.next();
		System.out.println("Introduce el presupuesto anual que se destina a ese departamento: ");
		double presupuestoAnual = s.nextDouble();
		Departamento d = new Departamento(numeroID, nombre, numeroEmpleados, ubicacion, presupuestoAnual);
		lista.add(d);
	}

	public static void escrituraFichero(String ruta) throws IOException {
		FileOutputStream fos = new FileOutputStream(ruta);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		for (Departamento d : lista) {
			oos.writeObject(d);
		}
	}

	public static void consultarDepartamentos() {
		for (Departamento d : lista) {
			System.out.println(d);
		}
	}

	public static void modificarDepartamento(Departamento dNuevo) {
		for (Departamento d : lista) {
			if (d.getNombre().equalsIgnoreCase(dNuevo.getNombre())) {
				lista.remove(d);
				lista.add(dNuevo);
			}
		}
	}

	public static void darDeBajaDepartamento() {
		System.out.println("Introduce el numero identificador del departamento: ");
		int numeroID = s.nextInt();
		for (Departamento d : lista) {
			if (d.getNumeroID() == numeroID) {
				lista.remove(d);
			}

		}
	}

}
