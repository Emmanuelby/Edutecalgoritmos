import java.util.Scanner;

public class EstacionDelAnio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int mes;

        // Solicitar mes
        System.out.print("Ingresa el número del mes (1-12): ");
        mes = scanner.nextInt();

        // Determinar estación usando switch
        switch (mes) {
            case 12:
            case 1:
            case 2:
                System.out.println("Estación: Invierno");
                break;

            case 3:
            case 4:
            case 5:
                System.out.println("Estación: Primavera");
                break;

            case 6:
            case 7:
            case 8:
                System.out.println("Estación: Verano");
                break;

            case 9:
            case 10:
            case 11:
                System.out.println("Estación: Otoño");
                break;

            default:
                System.out.println("Error: Número de mes inválido.");
        }

        scanner.close();
    }
}