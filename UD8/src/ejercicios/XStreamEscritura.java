package ejercicios;

import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.List;

import com.thoughtworks.xstream.XStream;

import XStream.Persona;

public class XStreamEscritura {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		File fichero = new File("Ficheros/personas.dat");
		FileInputStream filein = new FileInputStream(fichero);
		ObjectInputStream dataIS = new ObjectInputStream(filein);
		System.out.println("Comienza el proceso de creación del fichero XML..");
		ArrayList<Persona> listaper = new ArrayList<Persona>();
		try {
			while (true) {
				Persona persona = (Persona) dataIS.readObject();
				listaper.add(persona);
			}
		} catch (EOFException eo) {
		}
		dataIS.close();
		try {
			XStream xstream = new XStream();
			xstream.alias("ListaPersonasMunicipio", List.class); // <--------------
			xstream.alias("DatosPersona", Persona.class);
			// xstream.addImplicitCollection(ListaPersonas.class, "lista");
			// //<--------------
			xstream.toXML(listaper, new FileOutputStream("Ficheros/Personas2.xml"));// <--------------
			System.out.println("Creado fichero XML...");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
