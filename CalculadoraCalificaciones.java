import java.util.Scanner;

public class CalculadoraCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double parciales, proyecto, examenFinal;
        double calificacionFinal;

        // Solicitar datos al usuario
        System.out.print("Ingresa la calificación de Parciales (0-100): ");
        parciales = scanner.nextDouble();

        System.out.print("Ingresa la calificación del Proyecto (0-100): ");
        proyecto = scanner.nextDouble();

        System.out.print("Ingresa la calificación del Examen Final (0-100): ");
        examenFinal = scanner.nextDouble();

        // Validar que las calificaciones estén en el rango correcto
        if ((parciales >= 0 && parciales <= 100) &&
            (proyecto >= 0 && proyecto <= 100) &&
            (examenFinal >= 0 && examenFinal <= 100)) {

            // Cálculo de la calificación final
            calificacionFinal = (parciales * 0.40) +
                                (proyecto * 0.30) +
                                (examenFinal * 0.30);

            // Mostrar resultado
            System.out.println("La calificación final es: " + calificacionFinal);

        } else {
            System.out.println("Error: Todas las calificaciones deben estar entre 0 y 100.");
        }

        scanner.close();
    }
}