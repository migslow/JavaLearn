package ej05;

public class MainOrdenador1 {
	public static void main(String[] args) {
		ArrayListOrdenador lista = new ArrayListOrdenador();
        Ordenador ordenador1 = new Ordenador(1, "HP", "Pavilion", 8, 512);
        Ordenador ordenador2 = new Ordenador(2, "Dell", "Inspiron", 16, 256);
        Ordenador ordenador3 = new Ordenador(3, "Apple", "MacBook Pro", 16, 512);

        System.out.println("\nAñadir ordenadores a la lista: ");
        System.out.println(lista.anyadir(ordenador1));
        System.out.println(lista.anyadir(ordenador2));
        System.out.println(lista.anyadir(ordenador3));
        
        System.out.println("\nBusqueda por marca: ");
        System.out.println(lista.busquedaPorMarca("Dell"));
        
        System.out.println("\nOrdenar por almacenamiento: ");
        lista.ordenarAlmancenamiento();
        lista.mostrarLista();
        
        System.out.println("\nCambiar almacenamiento: ");
        System.out.println(lista.cambiarAlmacenamiento(1, 1024));
        lista.mostrarLista();
        
        
        /*
        System.out.println("Ordenador 1: " + ordenador1);
        System.out.println("Ordenador 2: " + ordenador2);
        System.out.println("Ordenador 3: " + ordenador3);

        
        System.out.println("\nComparable");
        int resultado1y2 = ordenador1.compareTo(ordenador2);
        int resultado1y3 = ordenador1.compareTo(ordenador3);
        int resultado2y3 = ordenador2.compareTo(ordenador3);

        System.out.println("Resultado entre Ordenador 1 y Ordenador 2: " + resultado1y2);
        System.out.println("Resultado entre Ordenador 1 y Ordenador 3: " + resultado1y3);
        System.out.println("Resultado entre Ordenador 2 y Ordenador 3: " + resultado2y3);
        */
	}
}
