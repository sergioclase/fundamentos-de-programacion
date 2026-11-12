package Ejercicios.Tema6;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();

        if (edad <4) {
            System.out.println("gratis");
        } 
          else if (edad >=4 && edad <=12) {
            System.out.println("0,50€");
        }
        else if (edad >= 13 && edad <= 64) {
            System.out.println("1,20€");
        }
            else {
                System.out.println("gratis");
            }

        sc.close();
    }
}

