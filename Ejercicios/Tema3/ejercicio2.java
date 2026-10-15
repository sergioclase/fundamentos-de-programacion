package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio2 {
    
    public static void main(String[] args) {
        
   Scanner sc = new Scanner(System.in);
  System.out.print("Dime un numero entero: ");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Tu numero es: " + edad);
        sc.close();
        
      }
    
}
