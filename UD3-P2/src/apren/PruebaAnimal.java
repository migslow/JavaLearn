package apren;

public class PruebaAnimal {

	public static void main(String[] args) {
		Animal a1 = new Animal("Leon", 4, 15, "Africa", "Felino", true);
		Animal a2 = new Animal("Perro", 4, 7, "America, Europa, Africa, Asia, Oceania", "Canis lupus familiari", true);

		System.out.println(a1);
		System.out.println(a2);
		
		a1.compitePatas(a2);
		a1.compiteEdad(a2);
		
		System.out.println("El " + a1.getNombre() + " tiene " + a1.getEdad() + " años de edad");
		
	}

}
