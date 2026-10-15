package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        System.out.println("introduce tu numero");
        int numero1 = sc.nextInt();

        System.out.println("Introduce el segundo numero ");
        int numero2 = sc.nextInt();
        int suma = numero1 + numero2;
                int resta = numero1 - numero2;

                        int division = numero1 / numero2;

                                int multiplicacion = numero1 * numero2;


        System.out.println("La suma es : " + suma);
        System.out.println("La resta es : " + resta);
        System.out.println("La division es: " + division);
        System.out.println("El resto es: " + multiplicacion);
    sc.close();
    }
    
}
