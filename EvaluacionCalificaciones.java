import java.util.Scanner;

public class EvaluacionCalificaciones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int calificacion;

        System.out.print("Ingresa la calificación (0-100): ");
        calificacion = scanner.nextInt();

        if (calificacion < 0 || calificacion > 100) {
            System.out.println("Error: La calificación debe estar entre 0 y 100.");
        } else {
            switch (calificacion / 10) {
                case 10:
                case 9:
                    System.out.println("Calificación: A");
                    break;
                case 8:
                    System.out.println("Calificación: B");
                    break;
                case 7:
                    System.out.println("Calificación: C");
                    break;
                case 6:
                    System.out.println("Calificación: D");
                    break;
                default:
                    System.out.println("Calificación: F");
            }
        }

        scanner.close();
    }
}