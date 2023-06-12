import java.util.Scanner;

public class ej07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce la tabla que deseas practicar: ");
        int tabla = scanner.nextInt();

        boolean fallo = false;
        int resultado;
        int numeroCorrecto = 0;

        System.out.println("Completa la tabla de multiplicar del " + tabla + ":");

        for (int i = 1; i <= 10; i++) {
            System.out.print(tabla + " x " + i + " = ");
            resultado = scanner.nextInt();

            if (resultado != tabla * i) {
                fallo = true;
                numeroCorrecto = tabla * i;
                break;
            }
        }

        if (fallo) {
            System.out.println("Incorrecto. La respuesta correcta es: " + numeroCorrecto);
        } else {
            System.out.println("¡Correcto! Has completado la tabla de multiplicar del " + tabla + " sin errores.");
        }
    }
}

