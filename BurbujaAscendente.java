import java.util.Scanner;

public class BurbujaAscendente {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        // Pedir cantidad de elementos
        System.out.print("Cantidad de numeros: ");
        int cantidad = teclado.nextInt();

        // Crear arreglo dinámico
        int[] numeros = new int[cantidad];

        // Leer números
        for (int i = 0; i < numeros.length; i++) {

            System.out.print("Ingresa un numero: ");
            numeros[i] = teclado.nextInt();
        }

        // Ordenamiento burbuja
        for (int i = 0; i < numeros.length - 1; i++) {

            for (int j = 0; j < numeros.length - 1; j++) {

                if (numeros[j] > numeros[j + 1]) {

                    int auxiliar = numeros[j];
                    numeros[j] = numeros[j + 1];
                    numeros[j + 1] = auxiliar;
                }
            }
        }

        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado:");

        for (int i = 0; i < numeros.length; i++) {

            System.out.println(numeros[i]);
        }

        teclado.close();
    }
}