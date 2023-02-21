package SERIALIZACION;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Lectura_copia {
	public static void main(String[] args) {
		ObjectInputStream entrada = null;
		Persona p;
		try {
			entrada = new ObjectInputStream(new FileInputStream("Ficheros/personas.dat"));
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
}