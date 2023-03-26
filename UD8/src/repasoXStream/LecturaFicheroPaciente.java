package repasoXStream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

import com.thoughtworks.xstream.XStream;

public class LecturaFicheroPaciente {

	public static void main(String[] args) {
		XStream xs = new XStream();

		xs.alias("Hospital", List.class);
		xs.alias("Paciente", Paciente.class);
		try {
			List<Paciente> lista = (List<Paciente>) xs.fromXML(new FileInputStream("Ficheros/paciente4.xml"));
			System.out.println(xs.toXML(lista));
		} catch (FileNotFoundException e) {
		    System.err.println("Archivo no encontrado: " + e.getMessage());
		} catch (Exception e) {
		    System.err.println("Error al leer el archivo XML: " + e.getMessage());
		}

	}

}
