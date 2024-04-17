
// E303- Escribir un programa que pida al usuario un número entero positivo y 
// muestre por pantalla todoslos números impares desde 1 hasta ese número 
// separados por comas

package ejercicio303;

import java.util.Scanner;

public class Ejercicio303 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero positivo: ");
        int numero = sc.nextInt();
        
        System.out.println("Impares:");
        for (int i=1; i <= numero  ; i++) {
             if (i%2 != 0) {
                if (i < 20) {
                    System.out.print( i);
                    System.out.print( ",");
                }
             }            
        }
        
        /*
        System.out.println("");
        System.out.println("Pares:");
        for (int i=1; i <= numero ; i++) {
            if (i%2 == 0) {
                // System.out.println( i);
                System.out.print( i);
                System.out.print( ",");
            }
        }
*/
        
    }
    
}
