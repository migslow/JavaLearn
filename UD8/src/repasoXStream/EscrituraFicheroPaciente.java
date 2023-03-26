package repasoXStream;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class EscrituraFicheroPaciente {

	public static void main(String[] args) throws IOException {
		File fichero = new File("Ficheros/pacientes.dat");
		FileOutputStream fos = new FileOutputStream(fichero);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		ArrayList<Paciente> lista = new ArrayList<Paciente>();
		String [] nombre = {"Miguel", "Maria"};
		int [] edad = {18, 15};
		String [] sintomas = {"Sin1", "sin2"};
		for(int i = 0; i < nombre.length;i++) {
			Paciente p = new Paciente(nombre[i], edad[i], sintomas[i]);
			oos.writeObject(p);
		}
		oos.close();

	}

}
