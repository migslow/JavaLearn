package repasoXStream;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class EscrituraFicheroXStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File archivo = new File("Ficheros/mascotas.dat");
		FileInputStream fis = new FileInputStream(archivo);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		try {
			while (true) {
				Mascota m = (Mascota) ois.readObject();
				lista.add(m);
			}
		} catch (EOFException e) {
			ois.close();
		}
		
		XStream xs = new XStream();
		xs.alias("Veterianrio", Mascota.class);
		xs.toXML(lista, new FileOutputStream("Ficheros/mascota.xml"));

	}

}
