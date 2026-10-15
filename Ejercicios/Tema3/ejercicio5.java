package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Dime la base de un rectangulo");
            int base = sc.nextInt();

            System.out.println("Dime la altura de un rectangulo");
            int altura = sc.nextInt();
            
            int area = base * altura; 

            System.out.println("solucion : " + area );
            sc.close();


    }
    
}
