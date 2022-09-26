// David Cano 
/* 
 * Algoritmo calculoPrecioFinal
 * Inicio
 * 	precioSindescuento Real
 * 	descuento Real
 * 	precioFinal Real
 * 
 * precioSindescuento <-- 40
 * descuento <-- 0.2
 * precioFinal <-- precioSinDescuento * (1-descuento)
 * Escribir e resultado por pantalla
 *Fin
 */
public class calculoPrecioFinal {

	public static void main(String[] args) {

		double precioSinDescuento, descuento, precioFinal;
		
		precioSinDescuento = 40;
		descuento = 0.2;
		precioFinal = precioSinDescuento * (1 - descuento);
		
		System.out.println("El precio final queda en " + precioFinal + " euros");
		
	}

}
