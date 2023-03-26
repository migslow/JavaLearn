package repasoXStream;

import java.awt.List;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class EscrituraXStream {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File f = new File("Ficheros/coches.dat");
		FileInputStream fis = new FileInputStream(f);
		ObjectInputStream ois = new ObjectInputStream(fis);
		ArrayList<Coche> lista = new ArrayList<Coche>();
		try {
			while (true) {
				Coche c = (Coche) ois.readObject();
				lista.add(c);
			}
		} catch (EOFException e) {
			ois.close();
		}
		try {
			XStream xs = new XStream();
			xs.alias("Concesionario", List.class);
			xs.alias("Coches", Coche.class);
			xs.toXML(lista, new FileOutputStream("Ficheros/coches.xml"));
		} catch (Exception e) {
			System.out.println("A ocurrido un problema de E/S " + e.getMessage());
		}
	}

}
