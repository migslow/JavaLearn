package repasoXStream;

import java.io.EOFException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class EscrituraFicheroMascota {

	public static void main(String[] args) throws IOException {
		File fichero = new File("Ficheros/mascotas.dat");
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		String [] nombre = {"Pipi", "Fifo"};
		int [] edad = {3, 5};
		for(int i = 0; i< nombre.length;i++) {
			Mascota m = new Mascota(nombre[i], edad[i]);
			oos.writeObject(m);
		}
		oos.close();

	}

}
