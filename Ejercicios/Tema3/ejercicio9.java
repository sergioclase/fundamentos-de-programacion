package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Introduce la cantidad en pesetas " );
    double pesetas = sc.nextDouble();

    final double cambio = 166.38;

    double euros = pesetas/cambio; 
    
    System.out.println("Son " + euros + "euros");
        sc.close();
    }
    
}
