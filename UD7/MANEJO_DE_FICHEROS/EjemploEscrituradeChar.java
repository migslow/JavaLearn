import java.io.*;

public class EjemploEscrituradeChar {
	public static void main(String[] args) throws IOException {
		FileWriter fw = null;
		fw = new FileWriter("MANEJO_DE_FICHEROS/Ficheros/alberto.txt");
		fw.write('A');
		fw.write('l');
		fw.write('b');
		fw.write('e');
		fw.write('r');
		fw.write('t');
		fw.write('o');
		fw.write(' ');
		fw.write('C');
		fw.write('a');
		fw.write('r');
		fw.write('r');
		fw.write('e');
		fw.write('r');
		fw.write('a');
		fw.close();
	}
}
