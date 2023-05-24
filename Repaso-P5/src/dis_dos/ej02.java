package dis_dos;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class ej02 {

	public static void main(String[] args) {
		try {
			DataInputStream dis = new DataInputStream(new FileInputStream("ficheros/fichero3.txt"));
			System.out.println(dis.readInt());
			System.out.println(dis.readUTF());
			System.out.println(dis.readInt());
		} catch (IOException e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}

	}

}
