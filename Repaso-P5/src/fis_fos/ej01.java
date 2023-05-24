package fis_fos;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ej01 {
	public static void main(String[] args) {
		try {
			FileOutputStream fos = new FileOutputStream("ficheros/fichero3.txt");
			FileInputStream fis = new FileInputStream("ficheros/fichero3.txt");
			String texto = "Esto es una prueba para ficheros bianarios";
			byte codigos[] = texto.getBytes();
			fos.write(codigos);
			fos.close();
			int aux = fis.read();
			while ((aux = fis.read()) != -1) {
				System.out.print((char) aux);
				aux = fis.read();
			}
			fis.close();
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}
	}
}
