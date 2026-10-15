package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("Dime una primera nota: ");
        double nota1 = sc.nextDouble();

        System.out.print("Dime una segunda nota: ");
        double nota2 = sc.nextDouble();

        System.out.print("Dime una tercera nota: ");
        double nota3 = sc.nextDouble();

        double media = (nota1 + nota2 + nota3)/3;

        System.out.println("La media es: "+  media);
        sc.close();
    }
}
