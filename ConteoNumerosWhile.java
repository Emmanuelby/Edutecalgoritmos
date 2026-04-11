import java.util.Scanner;

public class ConteoNumerosWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int cantidad, numero;
        int mayores = 0, menores = 0, iguales = 0;
        int i = 1;

        // Solicitar cantidad de números
        System.out.print("¿Cuántos números deseas ingresar?: ");
        cantidad = scanner.nextInt();

        // Validar cantidad
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor que 0.");
        } else {
            // Ciclo while
            while (i <= cantidad) {
                System.out.print("Ingresa el número " + i + ": ");
                numero = scanner.nextInt();

                if (numero > 0) {
                    mayores++;
                } else if (numero < 0) {
                    menores++;
                } else {
                    iguales++;
                }

                i++;
            }

            // Mostrar resultados
            System.out.println("Números mayores que 0: " + mayores);
            System.out.println("Números menores que 0: " + menores);
            System.out.println("Números iguales a 0: " + iguales);
        }

        scanner.close();
    }
}