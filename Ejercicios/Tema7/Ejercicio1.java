package Ejercicios.Tema7;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         System.out.print("Número (1-3): ");
        int n = sc.nextInt();

        switch (n) {
            case 1:
                System.out.println("Para");
                break;
            case 2:
                System.out.println("Precaución");
                break;
            case 3:
                System.out.println("Pasa");
                break;
            default:
                System.out.println("Color no válido");
                break;
        }
          sc.close();
    }
    
}
