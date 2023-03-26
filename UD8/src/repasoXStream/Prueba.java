package repasoXStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

public class Prueba {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Mascota> lista = new ArrayList<Mascota>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Ficheros/mascotas.dat"));

		try {
			while (true) {
				Mascota p = (Mascota) ois.readObject();
				lista.add(p);
			}
		} catch (EOFException e) {
			ois.close();
		}

		XStream xs = new XStream();
		xs.alias("Veterinario", List.class);
		xs.alias("Animales", Persona.class);
		xs.toXML(lista, new FileOutputStream("Ficheros/mascotas4.xml"));

	}

}
