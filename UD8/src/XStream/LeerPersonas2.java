package XStream;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import com.thoughtworks.xstream.XStream;

public class LeerPersonas2 {
	public static void main(String[] args) throws IOException{
		XStream xstream = new XStream();
		xstream.alias("ListaPersonasMunicipio",List.class); //<-----
		xstream.alias("DatosPersona", Persona.class);
		//xstream.addImplicitCollection(ListaPersonas.class, "lista"); //<-----
		
		ArrayList<Persona> listadoTodas = (ArrayList<Persona>) xstream.fromXML //<-----
									(new FileReader("Fichero\\Personas2.xml")); //<-----
		System.out.println("N�mero de Personas: " +
									listadoTodas.size()); //<-----
		
		Iterator iterador = listadoTodas.listIterator();
		while (iterador.hasNext()){
			Persona p= (Persona) iterador.next();
			System.out.println("Nombre: " + p.getNombre() + 
					", edad: " + p.getEdad());
		}
		System.out.println("Fin del listado....");	
	}
}