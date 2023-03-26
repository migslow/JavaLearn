package repasoXStream;

import java.util.List;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.thoughtworks.xstream.XStream;

public class EscrituraPacienteXStream {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		ArrayList<Paciente> lista = new ArrayList<Paciente>();
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Ficheros/pacientes.dat"));
		try {
			while (true) {
				Paciente p = (Paciente) ois.readObject();
				lista.add(p);
			}
		} catch (EOFException e) {
			ois.close();
		}
		try {
			XStream xs = new XStream();
			xs.alias("Hospital", List.class);
			xs.alias("Paciente", Paciente.class);
			xs.toXML(lista, new FileOutputStream("Ficheros/paciente4.xml"));
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

}
