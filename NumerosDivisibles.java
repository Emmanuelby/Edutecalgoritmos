public class NumerosDivisibles {
    public static void main(String[] args) {

        // Recorrer del 1 al 100
        for (int i = 1; i <= 100; i++) {

            // Verificar si es divisible entre 3 y 5
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i);
            }
        }
    }
}