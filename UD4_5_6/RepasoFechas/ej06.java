import java.util.Date;

public class ej06 {

	public static void main(String[] args) {
		Date d = new Date();
		
		System.out.println(d);
		d.setTime(9999999);
		System.out.println(d);
		System.out.println(d.getTime());
		System.out.println(d.getTimezoneOffset());
		System.out.println(d);
	}

}
