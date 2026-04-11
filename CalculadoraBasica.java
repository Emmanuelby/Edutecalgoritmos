import java.util.Scanner;

public class CalculadoraBasica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2, resultado;
        int opcion;
        char continuar;

        do {
            // Mostrar menú
            System.out.println("Calculadora básica");
            System.out.println("1. Suma");
            System.out.println("2. Resta");
            System.out.println("3. Multiplicación");
            System.out.println("4. División");
            System.out.print("Selecciona una opción: ");
            opcion = scanner.nextInt();

            // Solicitar números
            System.out.print("Ingresa el primer número: ");
            num1 = scanner.nextDouble();

            System.out.print("Ingresa el segundo número: ");
            num2 = scanner.nextDouble();

            // Realizar operación
            switch (opcion) {
                case 1:
                    resultado = num1 + num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2:
                    resultado = num1 - num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3:
                    resultado = num1 * num2;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4:
                    if (num2 != 0) {
                        resultado = num1 / num2;
                        System.out.println("Resultado: " + resultado);
                    } else {
                        System.out.println("Error: No se puede dividir entre cero.");
                    }
                    break;

                default:
                    System.out.println("Opción no válida.");
            }

            // Preguntar si desea continuar
            System.out.print("¿Deseas realizar otra operación? (s/n): ");
            continuar = scanner.next().toLowerCase().charAt(0);

        } while (continuar == 's');

        System.out.println("Programa finalizado.");

        scanner.close();
    }
}