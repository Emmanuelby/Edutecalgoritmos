import java.util.Scanner;

public class NumeroMayorMenor {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Crear arreglo para 8 números enteros
        int[] numeros = new int[8];

        // Leer y almacenar los 8 números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingresa un numero entero: ");
            numeros[i] = teclado.nextInt();
        }

        // Inicializar variables
        int mayor = numeros[0];
        int menor = numeros[0];

        // Buscar número mayor y menor
        for (int i = 1; i < numeros.length; i++) {

            if (numeros[i] > mayor) {
                mayor = numeros[i];
            }

            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }

        // Mostrar resultados
        System.out.println("\nNumero mayor: " + mayor);
        System.out.println("Numero menor: " + menor);

        teclado.close();
    }
}