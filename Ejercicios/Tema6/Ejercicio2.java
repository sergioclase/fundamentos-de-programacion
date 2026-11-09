package Ejercicios.Tema6;

import java.util.Scanner;

public class Ejercicio2 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Dime una edad: ");
        int edad = sc.nextInt();

        if (edad <=11) {
            System.out.println("niño");
        } 
          else if (edad >=12 && edad <= 17) {
            System.out.println("Adolescente");
        }
        else if (edad >= 18 && edad <= 64) {
            System.out.println("Adulto");
        }
            else {
                System.out.println("mayor");
            }

        sc.close();
    }
}
    

