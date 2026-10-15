package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        final double pi = 3.14159;

        System.out.println("Radio");
        double radio = sc.nextDouble();
        double area = pi*radio*radio;
        System.out.println(" Área: " + area );
    sc.close(); 

    }
}
