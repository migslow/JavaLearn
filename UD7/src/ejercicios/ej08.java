package ejercicios;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class ej08 {

	static Scanner s = new Scanner(System.in);

	public static void insertar(String n) throws IOException {
		double max = 0, min = 100, media = 0, suma = 0;
		int contador = 0;
		DataInputStream dis;
		try {
			dis = new DataInputStream(new FileInputStream("Ficheros\\" + n + ".dat"));
			String s = dis.readUTF();
			System.out.println(s + "\n");
			int i;
			double d;
			while (true) {
				i = dis.readInt();
				d = dis.readDouble();
				System.out.println("Hora: " + i + " - Temperatura: " + d);
				if (max < d) {
					max = d;
				}
				if (min > d) {
					min = d;
				}
				suma = suma + d;
				contador++;
			}
		} catch (EOFException eof) {
			System.out.println("Final del fichero");
		}
		System.out.println();
		media = suma / contador;
		System.out.println("Temperatura maxima: " + max);
		System.out.println("Temperatura minima: " + min);
		System.out.println("Temperatura media: " + media);

	}

	public static void main(String[] args) throws IOException {
		System.out.println("Introduce el nombre fichero: ");
		String nombre = s.nextLine();
		insertar(nombre);

	}

}
