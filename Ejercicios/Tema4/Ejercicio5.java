package Ejercicios.Tema4;

import java.util.Scanner;

public class Ejercicio5 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         System.out.print("Introduce el primer numero: ");
        String texto1 = sc.nextLine();

         System.out.print("Introduce el segundo numero: ");
        String texto2 = sc.nextLine();

     int numero1 = Integer.parseInt(texto1);
            int numero2 = Integer.parseInt(texto2);


        System.out.println("La suma es: " + (numero1 + numero2));

        System.out.println("Si no convertimos: " + (texto1 + texto2));

        sc.close();
        
        }
}
