package Ejercicios.Tema5;

import java.util.Scanner;

public class Ejercicio2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce tu edad: ");
        int numero = sc.nextInt();

        if (numero >= 18) {
            System.out.println("Puedes entrar");
        } else {
            System.out.println("No puedes entrar");
        }
        sc.close();
    }
}

