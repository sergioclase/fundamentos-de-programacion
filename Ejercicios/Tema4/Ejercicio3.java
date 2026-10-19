package Ejercicios.Tema4;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Dime un numero entero por teclado: ");
        int numero1 = sc.nextInt();
        System.out.print("Dime otro numero entero: ");
        int numero2 = sc.nextInt();

        System.out.println((double) (numero1 + numero2)/2 );

        sc.close();
        
    }
    
}
