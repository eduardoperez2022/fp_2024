// E301- Escribir un programa que pida al usuario una palabra y 
// la muestre por pantalla 10 veces.
package ejercicio301;

import java.util.Scanner;

public class Ejercicio301 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String palabra = sc.nextLine();
        
        // System.out.println("Ingreso: " + palabra);
        
        for (int i=0; i < 10 ; i++) {
            System.out.println(palabra  + i);
        }

        
    }
    
}
