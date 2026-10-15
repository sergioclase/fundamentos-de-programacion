package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Introduce la cantidad en euros: ");
        double euros = sc.nextDouble();

        Double cambio = 166.386;

        double pesetas = euros * cambio;
        System.out.println(euros + " euros son " + pesetas + (" pesetas"));
        sc.close();

    }
}
