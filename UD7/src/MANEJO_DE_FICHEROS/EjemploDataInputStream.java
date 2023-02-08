package MANEJO_DE_FICHEROS;

import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;

public class EjemploDataInputStream {
	public static void main(String[] args) throws IOException {
		FileInputStream filein = new FileInputStream("D:\\datos.dat");
		DataInputStream dataIS = new DataInputStream(filein);
		String n;
		int e;
		try {
			while (true) {
				n = dataIS.readUTF();
				e = dataIS.readInt();
				System.out.println("Nombre: " + n + ", edad: " + e);
			}
		} catch (EOFException eo) {
		}
		dataIS.close();
	}
}
