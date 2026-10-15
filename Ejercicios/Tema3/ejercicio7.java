package Ejercicios.Tema3;

import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            System.out.println("Introduce las horas trabajadas");
            int horas = sc.nextInt();

            System.out.println("Introduce el precio por hora ");
            int preciohora  = sc.nextInt();
            
            double salario = horas * preciohora;

            System.out.println("El salario semanal es:  : " + salario + "euros" );
            sc.close();
    }
    
}
