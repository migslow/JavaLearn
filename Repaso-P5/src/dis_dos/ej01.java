package dis_dos;

import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

public class ej01 {

	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("ficheros/fichero3.txt"));
			dos.writeInt(23);
			dos.writeUTF("Fernando");
			dos.writeInt(1990);
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e);
		}

	}

}
