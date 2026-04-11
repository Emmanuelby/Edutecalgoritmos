import java.util.Scanner;

public class FactorialNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        long factorial = 1;

        // Solicitar número
        System.out.print("Ingresa un número entero positivo: ");
        numero = scanner.nextInt();

        // Validar número
        if (numero < 0) {
            System.out.println("Error: El número no puede ser negativo.");
        } else {
            // Calcular factorial con for
            for (int i = 1; i <= numero; i++) {
                factorial *= i;
            }

            // Mostrar resultado
            System.out.println("El factorial de " + numero + " es: " + factorial);
        }

        scanner.close();
    }
}