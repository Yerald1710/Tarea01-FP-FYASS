import java.util.Scanner;

/**
 * EjerciciosJava
 */
public class EdadActualJava {
    public static void main(String[] args) {
        //2.21
        //Definir variables
        double a1, a2, e;
        //Datos de entrada
        Scanner lt=new Scanner(System.in);
        System.out.println("Ingrese el valor de a1:");
        a1=lt.nextDouble();
        System.out.println("Ingrese el valor de a2:");
        a2=lt.nextDouble();
        //proceso
        e=a1-a2
        //Datos de salida 
        System.out.print("La cantidad en kilometros es:"+e);
    }
}