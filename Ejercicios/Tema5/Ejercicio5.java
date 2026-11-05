package Ejercicios.Tema5;

import java.util.Scanner;

public class Ejercicio5 {

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 

        System.out.print("Dime la contraseña: ");
        String contraseña = sc.nextLine();

        if (contraseña.equals("java123")) {
            System.out.println("Acceso concedido");
        } else {
            System.out.println("Acceso denegado");
        }
        sc.close();
    }
}
