package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime tu edad: ");
        int edad = sc.nextInt();
        sc.nextLine();
        System.out.println("Dime tu nombre: ");
        String nombre = sc.nextLine();

        System.out.print(nombre + " tiene " + edad + " años " );
        sc.close();

    }
}
