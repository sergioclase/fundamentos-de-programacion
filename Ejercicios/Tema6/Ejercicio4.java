package Ejercicios.Tema6;

import java.util.Locale;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);

        System.out.print("Importe: ");
        double importe = sc.nextDouble();

        System.out.print("¿Eres socio? (s/n): ");
        String socio = sc.next();

        System.out.print("¿Pagas en efectivo? (s/n): ");
        String efectivo = sc.next();

        int descuento = 0;

        if (socio.equals("s")) {
            descuento += 5;
        }
        if (efectivo.equals("s")) {
            descuento += 2;
        }

        System.out.println("Descuento total: " + descuento + "%");

        double total = importe - importe * descuento / 100;
        System.out.println("Importe final: " + total);
        sc.close();
    }
}
    

