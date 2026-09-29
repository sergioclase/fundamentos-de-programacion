public class Main {

    public static void main(String[] args) {
        int miEntero1;
        int miEntero2;
        boolean esCorrecto;
        int resultadoSuma;
        int resultadoResta;
        int resultadoDivision;
        int resultadoMultiplicacion;

        miEntero1 = 1;
        miEntero2 = 2;
        esCorrecto = false;
        resultadoSuma = miEntero1 + miEntero2;
        resultadoResta = miEntero1 - miEntero2;
        resultadoDivision = miEntero1 / miEntero2;
        resultadoMultiplicacion = miEntero1 *miEntero2;

        esCorrecto = (resultadoSuma > resultadoResta) && false;

        System.out.println("--miEntero1: "+ miEntero1);
        System.out.println("--miEntero2: "+ miEntero2);
       System.out.println("--resultadoSuma: "+ resultadoSuma);
       System.out.println("--resultadoResta: "+ resultadoResta);
       System.out.println("--resultadoDivision: "+ resultadoDivision);
       System.out.println("--resultadoMultiplicacion: "+ resultadoMultiplicacion);
       System.out.println("--esCorrecto: "+ esCorrecto);

    }
}