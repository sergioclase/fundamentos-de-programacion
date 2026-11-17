package Ejercicios.Tema7;

import java.util.Scanner;

public class Ejercicio4 {
public static void main(String[] args) {
    

        Scanner sc = new Scanner(System.in);
        System.out.print("Letra minúscula: ");
        char letra = sc.next().charAt(0);

        switch (letra) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Es vocal");
                break;
            default:
                System.out.println("No es vocal");
                break;
        }
        sc.close();
    } 
    
}
