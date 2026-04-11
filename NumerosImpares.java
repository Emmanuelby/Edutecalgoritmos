import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int i = 1;

        // Solicitar número
        System.out.print("Ingresa un número entero positivo: ");
        numero = scanner.nextInt();

        // Validar número
        if (numero <= 0) {
            System.out.println("Error: El número debe ser positivo.");
        } else {
            // Ciclo do-while
            do {
                if (i % 2 != 0) {
                    System.out.println(i);
                }
                i++;
            } while (i <= numero);
        }

        scanner.close();
    }
}