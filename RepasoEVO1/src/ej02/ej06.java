package ej02;

import java.util.Scanner;

public class ej06 {
    static Scanner s = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Introduce el tamaño de la lista: ");
        int t = s.nextInt();
        int contadorPrimos = 0;
        for (int i = 0; i < t; i++) {
            int numAleatorio = (int)(Math.random() * 21);
            System.out.print(numAleatorio + " - ");
            if (esPrimo(numAleatorio)) {
                contadorPrimos++;
            }
        }
        System.out.println("\nCantidad de números primos: " + contadorPrimos);
    }

    public static boolean esPrimo(int num) {
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
