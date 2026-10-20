package Ejercicios.Tema4;

import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Dime una letra ");
        char letra = sc.nextLine().charAt(0); 
        
       int codigo = letra;
       char letraSiguiente = (char) (letra + 1);

     System.out.println("Código: " + codigo);
     System.out.println("Letra siguiente: " + letraSiguiente);

sc.close();
     }
    
}
