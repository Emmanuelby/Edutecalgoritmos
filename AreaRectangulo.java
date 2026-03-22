import java.util.Scanner;

public class AreaRectangulo {
    public static void main(String[] args) {  // 🔥 ESTE ES EL MAIN CORRECTO
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa la base: ");
        double base = sc.nextDouble();

        System.out.print("Ingresa la altura: ");
        double altura = sc.nextDouble();

        double area = base * altura;

        System.out.println("El área del rectángulo es: " + area);

        sc.close();
    }
}