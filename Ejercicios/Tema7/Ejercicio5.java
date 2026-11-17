package Ejercicios.Tema7;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Idioma (es, en, fr): ");
        String idioma = sc.next();

        switch (idioma) {
            case "es":
                System.out.println("Hola");
                break;
            case "en":
                System.out.println("Hello");
                break;
            case "fr":
                System.out.println("Bonjour");
                break;
            default:
                System.out.println("Idioma no soportado");
                break;
        }
          sc.close();
    }
}
