package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Dime un numero");
        double numero = sc.nextDouble();

        double doble = numero * 2;
        double triple = numero * 3;

        System.out.println("El doble de " +numero + " es " + doble);
        System.out.println("El triple de " +numero + " es " + triple);
sc.close();
    }
    
}
