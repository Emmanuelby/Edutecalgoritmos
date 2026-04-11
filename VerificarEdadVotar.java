import java.util.Scanner;

public class VerificarEdadVotar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int edad;

        // Solicitar edad al usuario
        System.out.print("Ingresa tu edad: ");
        edad = scanner.nextInt();

        // Validar edad y determinar si puede votar
        if (edad >= 18) {
            System.out.println("Eres elegible para votar.");
        } else if (edad >= 0) {
            System.out.println("No eres elegible para votar.");
        } else {
            System.out.println("Error: La edad no puede ser negativa.");
        }

        scanner.close();
    }
}