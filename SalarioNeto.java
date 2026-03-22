import java.util.Scanner;

public class SalarioNeto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingresa el salario bruto mensual: ");
        double salarioBruto = sc.nextDouble();

        System.out.print("Ingresa el porcentaje de impuestos: ");
        double porcentajeImpuestos = sc.nextDouble();

        System.out.print("Ingresa las deducciones adicionales: ");
        double deducciones = sc.nextDouble();

        double impuesto = salarioBruto * (porcentajeImpuestos / 100);
        double salarioNeto = salarioBruto - impuesto - deducciones;

        System.out.println("El salario neto es: " + salarioNeto);

        sc.close();
    }
}