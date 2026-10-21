package Ejercicios.Tema4;

import java.util.Scanner;

public class Ejercicio7 {
     public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
        System.out.println("Dime tu edad ");
        int edad = sc.nextInt(); 
        int edad1 = 18;
        boolean teoricoAprobado = true;

        boolean puedeSacarseElCarnet = edad >= 18 && teoricoAprobado;

        System.out.println("¿Puede sacarse el carnet? " + puedeSacarseElCarnet); 
        sc.close();
    }
}

