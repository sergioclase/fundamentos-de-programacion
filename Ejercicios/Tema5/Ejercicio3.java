package Ejercicios.Tema5;

import java.util.Scanner;

public class Ejercicio3 {
    
 public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Dime tu edad: ");
        int numero = sc.nextInt();

        if (numero >= 18 && numero <=64 ) {
            System.out.println("Edad de trabajar");
        } else {
            System.out.println("Fuera de edad laboral");
        }
        sc.close();
    }
}
