package RepasoSemana1;
import java.util.Scanner;

// Versión con entrada de datos por teclado
public class calculoPrecioFinal5 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		double precioSinDescuento, descuento, precioFinal;
		
		System.out.println("Introduce el precio sin descuento");
		precioSinDescuento = s.nextDouble();
		
		System.out.println("Introduce el descuento en %");
		descuento = s.nextDouble();
		
		precioFinal = precioSinDescuento * (1-(descuento/100));
		System.out.println("El precio final queda en " + precioFinal + " euros");
		
	}

}