package repasoFicheros;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ej05 {

	public static void main(String[] args) {
		try {
			DataOutputStream dos = new DataOutputStream(new FileOutputStream("FicherosRepaso/datos6.txt"));
			dos.writeInt(23);
			dos.writeUTF("Fernando");
			dos.writeInt(1990);
			dos.close();
		} catch (IOException e) {
			System.out.println("Ha ocurrido un problema de E/S" + e.getMessage());
		}

	}

}
