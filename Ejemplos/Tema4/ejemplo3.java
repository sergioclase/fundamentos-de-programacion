package Ejemplos.Tema4;

public class ejemplo3 {
    public static void main(String[] args) {
        
        int edad = 15;
        boolean vaConAdulto = true;
        boolean tieneEntrada = false;

        boolean puedeEntrar = edad >= 18 || vaConAdulto;
        boolean puedeSentarse = puedeEntrar && tieneEntrada;

        System.out.println("Puede entrar: " + puedeEntrar);
        System.out.println("Puede sentarse: " + puedeSentarse);
        System.out.println("No tiene entrada: " + !tieneEntrada);
        // Si se cambia el vaConAdulto a falso se cambia el puede sentarse a false ya que no tiene ni la edad ni va con adulto 
    }
}
    
    

