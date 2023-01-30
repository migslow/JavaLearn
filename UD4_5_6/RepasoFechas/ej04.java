import java.util.Date;

public class ej04 {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println("La fecha inicial es: " + d);
		// setTime establece una fecha futura y el valor que se le pasa esta comprendido en milisegundos
		d.setTime(9999999);
		
		System.out.println("La fecha modificada es: " + d);
		
		System.out.println("\n");
		System.out.println(d.getHours());
		System.out.println(d.getMinutes());
		System.out.println(d.getSeconds());

	}

}
