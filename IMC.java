import java.util.Scanner;

public class IMC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa tu peso en kilogramos: ");
        double peso = sc.nextDouble();

        System.out.print("Ingresa tu altura en metros: ");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("Tu índice de masa corporal (IMC) es: " + imc);

        sc.close();
    }
}