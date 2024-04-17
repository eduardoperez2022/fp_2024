// E302- Escribir un programa que pregunte al usuario su edad y muestre por pantalla 
// todos los años queha cumplido (desde 1 hasta su edad).

package ejercicio302;

import java.util.Scanner;

public class Ejercicio302 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese su edad: ");
        int edad = sc.nextInt();
        
        for (int i=1; i <= edad ; i++) {
            System.out.println("Cumpleaños nro " + i);
        }
        
    }
    
}
