package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        final double IVA = 0.21;

        System.out.println("Introduce la base imponible");
        double baseimponible= sc.nextDouble();

        double cantidadiva = baseimponible * IVA;
        double totalfactura = baseimponible + cantidadiva;

        System.out.println("solución " + totalfactura);
        sc.close();

    }
}
