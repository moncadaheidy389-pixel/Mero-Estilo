package utilidades;

import java.util.Scanner;

public class Validador {
    private static Scanner scanner = new Scanner(System.in);

    public static int leerEntero(String mensaje) {
        int numero = 0;
        boolean error = true;
        while (error) {
            try {
                System.out.print(mensaje);
                numero = Integer.parseInt(scanner.nextLine());
                error = false;
            } catch (NumberFormatException e) {
                System.out.println("❌ Error: Por favor ingrese un número entero válido.");
            }
        }
        return numero;
    }

    public static String leerTexto(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }
}