package Examen_5_Recuperacion;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Pregunta5c {

	static Scanner s = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("Introduce el fichero con extension: ");
		String nombreFichero = s.next();
		String ruta = "Ficheros/" + nombreFichero;
		totalLineas(ruta);
		copiaFichero(ruta);
	}

	public static void totalLineas(String ruta) {
		try {
			int contador = 0;
			String aux;
			BufferedReader br = new BufferedReader(new FileReader(ruta));
			while ((aux = br.readLine()) != null) {
				if (aux != "\n") {
					contador++;
				}
			}
			System.out.println("El fichero tiene " + contador + " lines");
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

	public static void copiaFichero(String ruta) {
		try {
			FileInputStream fis = new FileInputStream(ruta); // lectura
			FileOutputStream fos = new FileOutputStream("Ficheros/Biblioteca_seguridad.xml"); // escritura
			int aux;
			while ((aux = fis.read()) != -1) {
				fos.write(aux);
			}
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

}
