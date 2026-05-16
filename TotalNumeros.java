import java.util.Scanner;

public class TotalNumeros {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int[] datos = new int[5];

        int acumulador = 0;

        // Guardar números en el arreglo
        for (int posicion = 0; posicion < datos.length; posicion++) {

            System.out.print("Introduce un valor entero: ");
            datos[posicion] = teclado.nextInt();
        }

        // Realizar suma de los elementos
        for (int posicion = 0; posicion < datos.length; posicion++) {

            acumulador += datos[posicion];
        }

        // Imprimir resultado final
        System.out.println("\nEl total acumulado es: " + acumulador);

        teclado.close();
    }
}