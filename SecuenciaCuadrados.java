import java.util.Scanner;

public class SecuenciaCuadrados {
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
                int cuadrado = i * i;
                System.out.println("El cuadrado de " + i + " es: " + cuadrado);
                i++;
            } while (i <= numero);
        }

        scanner.close();
    }
}