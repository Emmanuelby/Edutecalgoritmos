import java.util.Scanner;

public class ContadorDigitos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int contador = 0;

        // Solicitar número
        System.out.print("Ingresa un número entero: ");
        numero = scanner.nextInt();

        // Convertir a positivo en caso de ser negativo
        numero = Math.abs(numero);

        // Caso especial si el número es 0
        if (numero == 0) {
            contador = 1;
        } else {
            // Contar dígitos
            while (numero > 0) {
                numero = numero / 10;
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("El número tiene " + contador + " dígitos.");

        scanner.close();
    }
}