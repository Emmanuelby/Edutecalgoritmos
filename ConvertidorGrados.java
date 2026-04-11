import java.util.Scanner;

public class ConvertidorGrados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double celsius, resultado;
        int opcion;

        // Solicitar temperatura
        System.out.print("Ingresa la temperatura en grados Celsius: ");
        celsius = scanner.nextDouble();

        // Mostrar menú
        System.out.println("Selecciona una opción:");
        System.out.println("1. Convertir a Fahrenheit");
        System.out.println("2. Convertir a Kelvin");
        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        // Usar switch para la conversión
        switch (opcion) {
            case 1:
                resultado = (celsius * 9/5) + 32;
                System.out.println("Temperatura en Fahrenheit: " + resultado);
                break;

            case 2:
                resultado = celsius + 273.15;
                System.out.println("Temperatura en Kelvin: " + resultado);
                break;

            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}