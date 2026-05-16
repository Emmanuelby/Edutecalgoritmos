import java.util.Scanner;

public class InvertirElementos {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear arreglo para 6 números enteros
        int[] numeros = new int[6];

        // Leer y almacenar los 6 números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingresa un numero entero: ");
            numeros[i] = teclado.nextInt();
        }

        // Mostrar arreglo invertido
        System.out.println("\nArreglo invertido:");

        for (int i = numeros.length - 1; i >= 0; i--) {

            System.out.println(numeros[i]);
        }

        teclado.close();
    }
}