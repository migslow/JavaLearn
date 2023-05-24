package serializacion;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MainEmpleado {

	public static void main(String[] args) {
		Empleado e1 = new Empleado("Miguel", "Ovejero", 20, 1200);
		Empleado e2 = new Empleado("Maria", "Lopez", 21, 1300);
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("ficheros/empleados.txt"));
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("ficheros/empleados.txt"));
			oos.writeObject(e1);
			oos.writeObject(e2);
			oos.close();
			while (true) {
				Empleado aux = (Empleado) ois.readObject();
				System.out.println(aux.getNombre());
				System.out.println(aux.getApellido());
				System.out.println(aux.getEdad());
				System.out.println(aux.getSalario());
				System.out.println("");
			}

		} catch (EOFException e) {
		} catch (ClassNotFoundException e) {
		} catch (IOException e) {
		}
	}
}
