package ejercicios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
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
				// TODO Auto-generated catch block
				System.out.println("No encontrada la clase a la hora de leer clientes del fichero");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				System.out.println("Ocurrió un error I/O al leer los clientes");
			}
		}

		crearDepartamento();

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
			if (p.getNumDepartamento() != numero) {
				System.out.println("El numero del departamento " + p.getNumDepartamento() + " ya existe");
			} else {
				lista.add(p);
			}
		}
	}

}
