package FILE_TO_STRING;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
/*
 * � Alberto Carrera Mart�n - 10 Agosto 2020 � Viva San Lorenzo!
 */
public class Lectura00 {
  public static void main(String[] args) {
    
    try {
     // Codificaci�n del fichero autor --> UTF-8
      String sFichero = new String(Files.readAllBytes(Paths.get("Ficheros/Quijote.txt")), StandardCharsets.UTF_8);
     // Puede leerse tambi�n a un array de bytes pero luego hay problemas con la codificaci�n.
      System.out.println(sFichero);
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}