package Ejercicios.Tema5;

import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Dime una nota: ");
        double nota = sc.nextDouble();
        
        if ( nota >= 5 ) {
            System.out.println("Aprobado");
           } else {
                System.out.println("Suspenso");
            }
            sc.close();
    }
    
}
