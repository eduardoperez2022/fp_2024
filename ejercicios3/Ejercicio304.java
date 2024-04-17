// E304- Escribir un programa que pida al usuario un número entero positivo y 
// muestre por pantalla la cuenta atrás desde ese número hasta cero separados 
// por comas.


package ejercicio304;

import java.util.Scanner;

public class Ejercicio304 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese un numero positivo: ");
        int numero = sc.nextInt();
        
        System.out.println("Impares:");
        for (int i=numero; i >= 0; i--) {
            System.out.print( i);
            System.out.print( ",");
        }
        
    }
    
}
