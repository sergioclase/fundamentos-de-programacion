package Ejercicios.Tema6;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Introduce un número entero: ");
        int numero = sc.nextInt();

        if (numero > 0) {
            System.out.println("Positivo");
        } 
          else if (numero < 0) {
            System.out.println("Negativo");
        }
        else {
            System.out.println(numero);
            
        sc.close();
    }
}
    
}
