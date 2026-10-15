package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Dime un numero: ");
        int numero = sc.nextInt();

        final int minuto = 60; 
        int segundos = numero * minuto;

        System.out.println(numero + " minutos son " + segundos + " segundos");
        sc.close();
    }
    
}
