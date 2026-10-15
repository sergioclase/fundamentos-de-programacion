package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        
        
        double cambio = 1.10;
        System.out.println("Euros: ");
        double euros = sc.nextDouble();

        cambio = 1.15;
        System.out.println(euros + "euros son " + euros*cambio + " dolares");
        sc.close();



    }
    
}
