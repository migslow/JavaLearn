package serializacion02;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuArticulo {

	static Scanner s = new Scanner(System.in);
	static ArrayList<Articulo> lista = new ArrayList<Articulo>();

	public static void main(String[] args) {
		System.out.println("Introduce el nombre del archivo con extension: ");
		String nombreFichero = s.nextLine();
		String ruta = "fichero/" + nombreFichero;
		File f = new File(ruta);
		if (f.exists()) {
			try {
				ObjectInputStream ois = new ObjectInputStream(new FileInputStream(ruta));
				try {
					while (true) {
						lista.add((Articulo) ois.readObject());
					}
				} catch (EOFException e) {
					System.out.println("Fin del fichero");
					ois.close();
				}
			} catch (IOException e) {
				System.out.println("A ocurrido un problema de E/S");
				e.printStackTrace();
			} catch (ClassNotFoundException e) {
				System.out.println("No se ha encontrado la clase");
				e.printStackTrace();
			}
		}

		while (true) {
			System.out.println("========Menu========");
			System.out.println("1. Añadir articulo");
			System.out.println("2. Escritura fichero");
			System.out.println("3. Consultar lista");
			System.out.println("4. Salir del menu");
			int opcion = s.nextInt();
			s.nextLine();
			switch (opcion) {
			case 1:
				crearArticulo();
				break;
			case 2:
				escrituraFichero(ruta);
				break;
			case 3:
				consultarLista();
				break;
			case 4:
				System.out.println("Has salido del menu");
				System.exit(-1);
				break;
			default:
				System.out.println("No has introducido un numero entre 1 y 4");
				break;
			}
		}

	}
	
	public static void crearArticulo() {
		System.out.println("Introduce el codigo: ");
		int codigo = s.nextInt();
		System.out.println("Introduce el nombre: ");
		String nombre = s.next();
		System.out.println("Introduce la cantidad: ");
		int cantidad = s.nextInt();
		System.out.println("Introduce el precio: ");
		Double precio = s.nextDouble();
		Articulo a = new Articulo(codigo, nombre, cantidad, precio);
		lista.add(a);
	}
	
	public static void escrituraFichero(String ruta) {
		try {
			FileOutputStream fos = new FileOutputStream(ruta);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			for(Articulo a : lista) {
				oos.writeObject(a);
			}
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S");
			e.printStackTrace();
		}
	}
	
	public static void consultarLista() {
		for(Articulo a : lista) {
			System.out.println(a);
		}
	}

}
