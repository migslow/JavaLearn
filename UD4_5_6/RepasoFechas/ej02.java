import java.text.SimpleDateFormat;
import java.util.Date;

public class ej02 {

	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		String formateada = format.format(d);
		
		System.out.println("La fecha formateada es: " + formateada);

	}

}
