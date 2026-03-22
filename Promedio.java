import java.util.Scanner;

public class Promedio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el primer número: ");
        double num1 = sc.nextDouble();

        System.out.print("Ingresa el segundo número: ");
        double num2 = sc.nextDouble();

        System.out.print("Ingresa el tercer número: ");
        double num3 = sc.nextDouble();

        double promedio = (num1 + num2 + num3) / 3;

        System.out.println("El promedio es: " + promedio);

        sc.close();
    }
}