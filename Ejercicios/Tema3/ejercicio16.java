package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("edad ahora ");
        int edad = sc.nextInt();

        int edad5 = (edad + 5);

        System.out.println("Tu edad en 5 años es: " +edad5 + " años");
        
        sc.close();
        
    }
    
}
