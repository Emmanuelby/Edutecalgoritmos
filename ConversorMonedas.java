import java.util.Scanner;

public class ConversorMonedas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pesos, resultado = 0;
        int opcion;

        // Solicitar cantidad en pesos mexicanos
        System.out.print("Ingresa la cantidad en pesos mexicanos (MXN): ");
        pesos = scanner.nextDouble();

        // Mostrar menú
        System.out.println("\nSelecciona la moneda a convertir:");
        System.out.println("1. Dólar (USD)");
        System.out.println("2. Euro (EUR)");
        System.out.println("3. Baht (THB)");
        System.out.println("4. Yen (JPY)");
        System.out.println("5. Won (KRW)");
        System.out.println("6. Dólar Australiano (AUD)");
        System.out.println("7. Sol (PEN)");
        System.out.println("8. Dólar Canadiense (CAD)");
        System.out.println("9. Bolívar (VES)");
        System.out.println("10. Peso Argentino (ARS)");
        System.out.print("Opción: ");
        opcion = scanner.nextInt();

        // Tipo de cambio aproximado (ejemplo)
        switch (opcion) {
            case 1:
                resultado = pesos * 0.058; // USD
                System.out.println("Equivalente en USD: " + resultado);
                break;
            case 2:
                resultado = pesos * 0.053; // EUR
                System.out.println("Equivalente en EUR: " + resultado);
                break;
            case 3:
                resultado = pesos * 2.10; // THB
                System.out.println("Equivalente en THB: " + resultado);
                break;
            case 4:
                resultado = pesos * 8.60; // JPY
                System.out.println("Equivalente en JPY: " + resultado);
                break;
            case 5:
                resultado = pesos * 77.0; // KRW
                System.out.println("Equivalente en KRW: " + resultado);
                break;
            case 6:
                resultado = pesos * 0.088; // AUD
                System.out.println("Equivalente en AUD: " + resultado);
                break;
            case 7:
                resultado = pesos * 0.22; // PEN
                System.out.println("Equivalente en PEN: " + resultado);
                break;
            case 8:
                resultado = pesos * 0.079; // CAD
                System.out.println("Equivalente en CAD: " + resultado);
                break;
            case 9:
                resultado = pesos * 2.10; // VES (muy variable)
                System.out.println("Equivalente en VES: " + resultado);
                break;
            case 10:
                resultado = pesos * 50.0; // ARS (muy variable)
                System.out.println("Equivalente en ARS: " + resultado);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        scanner.close();
    }
}