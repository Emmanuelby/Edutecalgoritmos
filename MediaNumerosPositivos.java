import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero, suma = 0;
        int contador = 0;

        // Ciclo do-while
        do {
            System.out.print("Ingresa un número positivo (negativo para terminar): ");
            numero = scanner.nextDouble();

            if (numero >= 0) {
                suma += numero;
                contador++;
            }

        } while (numero >= 0);

        // Calcular y mostrar la media
        if (contador > 0) {
            double media = suma / contador;
            System.out.println("La media de los números positivos es: " + media);
        } else {
            System.out.println("No se ingresaron números positivos.");
        }

        scanner.close();
    }
}