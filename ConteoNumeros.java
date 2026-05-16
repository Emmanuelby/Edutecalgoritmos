import java.util.Scanner;

public class ConteoNumeros {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int[] valores = new int[10];

        int cantidadPares = 0;
        int cantidadImpares = 0;

        // Guardar números en el arreglo
        for (int posicion = 0; posicion < valores.length; posicion++) {

            System.out.print("Escribe un numero entero: ");
            valores[posicion] = entrada.nextInt();
        }

        // Analizar números
        for (int posicion = 0; posicion < valores.length; posicion++) {

            if (valores[posicion] % 2 == 0) {
                cantidadPares = cantidadPares + 1;
            } else {
                cantidadImpares = cantidadImpares + 1;
            }
        }

        // Mostrar resultados
        System.out.println("\nCantidad de numeros pares: " + cantidadPares);
        System.out.println("Cantidad de numeros impares: " + cantidadImpares);

        entrada.close();
    }
}