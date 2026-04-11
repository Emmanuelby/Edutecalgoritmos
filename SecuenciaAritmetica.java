import java.util.Scanner;

public class SecuenciaAritmetica {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inicio, diferencia, maximo;
        int actual;

        // Solicitar datos
        System.out.print("Ingresa el primer número: ");
        inicio = scanner.nextInt();

        System.out.print("Ingresa la diferencia: ");
        diferencia = scanner.nextInt();

        System.out.print("Ingresa el número máximo: ");
        maximo = scanner.nextInt();

        actual = inicio;

        // Validar diferencia
        if (diferencia == 0) {
            System.out.println("Error: La diferencia no puede ser cero.");
        } else {
            // Ciclo do-while
            do {
                System.out.println(actual);
                actual += diferencia;
            } while ((diferencia > 0 && actual <= maximo) ||
                     (diferencia < 0 && actual >= maximo));
        }

        scanner.close();
    }
}