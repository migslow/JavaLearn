import java.util.Scanner;

public class CalculoPrecio {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		final double IVA = 0.21;
		double precioSinIVA, gastosEnvio, precioFinal;
		System.out.println("Introduce el precio del producto sin iva: ");
		precioSinIVA = s.nextDouble();
		System.out.println("Introduce los gastos de envio: ");
		gastosEnvio = s.nextDouble();
		precioFinal = precioSinIVA * (1 + IVA) + gastosEnvio;
		System.out.println("Precio final a pagar: " + precioFinal);

	}

}
