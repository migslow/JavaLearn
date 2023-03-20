package ejercicios;

import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document; 
import org.w3c.dom.Element;
import org.w3c.dom.Text;

public class ej02_XML_Escritura {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			DOMImplementation implementation = builder.getDOMImplementation();
			Document documento = implementation.createDocument(null, "trabajo", null);
			documento.setXmlVersion("1.0");
			Element departamentos = documento.createElement("departamentos");
			Element departamento = documento.createElement("departamento");

			// Numero departamento
			Element numero = documento.createElement("NumDepartamento");
			Text textnumero = documento.createTextNode("1");
			numero.appendChild(textnumero);
			departamento.appendChild(numero);

			// Nombre departamento
			Element nombre = documento.createElement("nombre");
			Text textNombre = documento.createTextNode("informatica");
			nombre.appendChild(textNombre);
			departamento.appendChild(nombre);

			// Localidad departamento
			Element localidad = documento.createElement("localidad");
			Text textLocalidad = documento.createTextNode("zaragoza");
			localidad.appendChild(textLocalidad);
			departamento.appendChild(localidad);

			departamentos.appendChild(departamento);

			documento.getDocumentElement().appendChild(departamentos);

			Source source = new DOMSource(documento);

			Result result = new StreamResult(new File("Ficheros/departamentos.xml"));

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			transformer.transform(source, result);

		} catch (ParserConfigurationException | TransformerException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
