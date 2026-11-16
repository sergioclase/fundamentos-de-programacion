package Ejercicios.Tema6;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("¿Eres socio? (s/n): ");
        char socio = sc.next().charAt(0);

        System.out.print("¿Pagas en efectivo? (s/n): ");
        char efectivo = sc.next().charAt(0);

        int descuento = 0;

        if (socio == 's') {
            descuento = descuento + 5;
        }
        if (efectivo == 's') {
            descuento = descuento + 2;
        }

        System.out.println("Descuento total: " + descuento + "%");
        sc.close();
    }
}
    

