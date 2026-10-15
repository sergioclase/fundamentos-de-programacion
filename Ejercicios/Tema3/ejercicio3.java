package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("introduce tu numero");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero ");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;

        System.out.println("La suma es : " + suma );
        sc.close();
        
    }
    
}
