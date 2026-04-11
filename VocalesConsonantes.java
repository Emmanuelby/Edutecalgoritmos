import java.util.Scanner;

public class VocalesConsonantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char letra;

        // Ciclo do-while
        do {
            System.out.print("Ingresa una letra (espacio para salir): ");
            letra = scanner.next().charAt(0);

            if (letra == ' ') {
                break;
            }

            // Convertir a minúscula para comparar
            letra = Character.toLowerCase(letra);

            if (letra >= 'a' && letra <= 'z') {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("Es una vocal.");
                } else {
                    System.out.println("Es una consonante.");
                }
            } else {
                System.out.println("No es una letra válida.");
            }

        } while (letra != ' ');

        scanner.close();
    }
}