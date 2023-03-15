package ejercicios;

import java.io.File;
import java.io.IOException;

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
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.w3c.dom.Text;
import org.xml.sax.SAXException;

public class ej02_XML_Lectura {

	public static void main(String[] args) {
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document documento = builder.parse(new File("Ficheros/departamentos.xml"));
			NodeList listaDepartamentos = documento.getElementsByTagName("departamento");

			for (int i = 0; i < listaDepartamentos.getLength(); i++) {
				Node nodo = listaDepartamentos.item(i);
				if (nodo.getNodeType() == Node.ELEMENT_NODE) {
					Element e = (Element) nodo;
					NodeList hijos = e.getChildNodes();
					for (int j = 0; j < hijos.getLength(); j++) {
						Node hijo = hijos.item(j);
						if (hijo.getNodeType() == Node.ELEMENT_NODE) {
							System.out
									.println("Propiedad: " + hijo.getNodeName() + " | Valor: " + hijo.getTextContent());
						}

					}
					System.out.println("");
				}

			}

		} catch (ParserConfigurationException | SAXException | IOException ex) {
			System.out.println(ex.getMessage());
		}

	}

}
