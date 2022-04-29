import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class MillasAkilometrosJava {
    public static void main(String[] args) {
        //2.21
        //Definir variables
        double mv=1609, m, k;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de m:");
        m=lt.nextDouble();
        //proceso
        k=m*mv
        //Datos de salida 
        System.out.print("La cantidad en kilometros es:"+k);
    }
}