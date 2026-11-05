package Ejercicios.Tema5;

import java.util.Scanner;

public class Ejercicio4 {

    
 public static void main(String[] args) {
         Scanner sc = new Scanner(System.in); 

        System.out.print("Importación de una compra que tenga decimales: ");
        double numero = sc.nextDouble();
        final double descuento = 0.10;
   if (numero > 100) {
            double total = numero - (numero * descuento);
            System.out.println("Total a pagar: " + total);
        } else {
            System.out.println("Total a pagar: " + numero);
        }
        sc.close();
    }
}

