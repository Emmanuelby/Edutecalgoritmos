import java.util.Scanner;
import java.util.Random;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto;
        int intento;

        // Generar número aleatorio entre 1 y 100
        numeroSecreto = random.nextInt(100) + 1;

        // Ciclo do-while
        do {
            System.out.print("Adivina el número (1-100): ");
            intento = scanner.nextInt();

            if (intento > numeroSecreto) {
                System.out.println("Demasiado alto.");
            } else if (intento < numeroSecreto) {
                System.out.println("Demasiado bajo.");
            } else {
                System.out.println("Correcto. Has adivinado el número.");
            }

        } while (intento != numeroSecreto);

        scanner.close();
    }
}