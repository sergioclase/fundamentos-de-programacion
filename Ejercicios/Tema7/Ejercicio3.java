package Ejercicios.Tema7;

import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("a) Café 1,20 €  b) Té 1,00 €  c) Zumo 2,00 €");
        System.out.print("Opción: ");
        char opcion = sc.next().charAt(0);
        System.out.print("Unidades: ");
        int unidades = sc.nextInt();

        double precio = 0;
    

        switch (opcion) {
            case 'a':
                precio = 1.20;
                break;
            case 'b':
                precio = 1.00;
                break;
            case 'c':
                precio = 2.00;
                break;
            default:
                
                System.out.println("Opción no válida");
                break;
        }
        
            System.out.printf("Total: " + (precio * unidades) );
        
          sc.close();
    }
}
