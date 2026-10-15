package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        
   
       Scanner sc = new Scanner(System.in);
            System.out.println("Dime la base de un triangulo");
            int base = sc.nextInt();

            System.out.println("Dime la altura de un triangulo");
            int altura = sc.nextInt();
            
            int area = base * altura; 

            System.out.println("el area es:  : " + (double)area/2 );
            sc.close();

}
}