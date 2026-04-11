import java.util.Scanner;

public class CalculoDescuento {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double precio, descuento = 0, precioFinal;

        // Solicitar precio
        System.out.print("Ingresa el precio del producto: ");
        precio = scanner.nextDouble();

        // Validar precio
        if (precio < 0) {
            System.out.println("Error: El precio no puede ser negativo.");
        } else {
            // Determinar descuento
            if (precio <= 100) {
                descuento = 0;
            } else if (precio <= 200) {
                descuento = 0.10;
            } else if (precio <= 500) {
                descuento = 0.20;
            } else {
                descuento = 0.25;
            }

            // Calcular precio final
            precioFinal = precio - (precio * descuento);

            // Mostrar resultados
            System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
            System.out.println("Precio final: $" + precioFinal);
        }

        scanner.close();
    }
}