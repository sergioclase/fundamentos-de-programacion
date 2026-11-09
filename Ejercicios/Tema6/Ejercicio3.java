package Ejercicios.Tema6;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Sueldo anual: ");
        double sueldo = sc.nextDouble();

        int retencion;

        if (sueldo <= 12000) {
            retencion = 0;
        } else if (sueldo <= 25000) {
            retencion = 10;
        } else if (sueldo <= 40000) {
            retencion = 20;
        } else {
            retencion = 30;
        }

        System.out.println("Retención: " + retencion + "%");
        sc.close();
    }

    
}
