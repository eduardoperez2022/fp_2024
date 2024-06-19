
//E902 - Para tributar un determinado impuesto se debe ser mayor de 16 años y tener unos 
//ingresos iguales o superiores a 1000 € mensuales. Escribir un programa que pregunte al 
//usuario su edad y sus ingresos mensuales y muestre por pantalla si el usuario tiene que 
//tributar o no.

package ejercicio902;

import java.util.Scanner;

public class Ejercicio902 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la edad y los ingresos:");
        
        int edad = sc.nextInt();
        
        int ingreso = sc.nextInt();
        
//        if( (edad > 16) && (ingreso >= 1000) ) {
//            System.out.println("Ud debe tributar :)");
//        }
//        else {
//            System.out.println("Ud esta excento");
//        }
        
//        if( edad > 16 ) {
//            if (ingreso >= 1000) {
//                System.out.println("Ud debe tributar :)");
//            }
//            else {
//                System.out.println("Ud esta excento 1");
//            }
//        }
//        else {
//            System.out.println("Ud esta excento  2");
//        }
        
//        int tributa=0;
//        if( (edad > 16) && (ingreso >= 1000) ) {
//            tributa=1;
//        }
//        
//        if (tributa == 1) {
//          System.out.println("Ud debe tributar :)");
//        }
//        else {
//            System.out.println("Ud esta excento");
//        }

        int limite_edad = 16;
        int limite_ingreso = 1500;
        int tributa=0;

        if( (edad > limite_edad) && (ingreso >= limite_ingreso) ) {
            tributa=1;
        }
        
        if (tributa == 1) {
          System.out.println("Ud debe tributar :)");
        }
        else {
            System.out.println("Ud esta excento");
        }

    }
    
}
