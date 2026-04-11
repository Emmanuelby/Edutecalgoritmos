import java.util.Scanner;

public class ContarLetraA {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String palabra;
        int contador = 0;

        // Solicitar palabra
        System.out.print("Ingresa una palabra: ");
        palabra = scanner.nextLine();

        // Recorrer la palabra
        for (int i = 0; i < palabra.length(); i++) {
            char letra = palabra.charAt(i);

            if (letra == 'a' || letra == 'A') {
                contador++;
            }
        }

        // Mostrar resultado
        System.out.println("La letra 'a' aparece " + contador + " veces.");

        scanner.close();
    }
}