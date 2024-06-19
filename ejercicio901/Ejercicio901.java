// E901 - Escribir un programa que almacene la cadena de caracteres contraseña en una 
// variable, pregunte al usuario por la contraseña e imprima por pantalla si la contraseña 
// introducida por el usuario coincide con la guardada en la variable sin tener en cuenta 
// mayúsculas y minúsculas.

package ejercicio901;

import java.util.Scanner;

public class Ejercicio901 {

    public static void main(String[] args) {
        
        String valorx = "contraseña";
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese la clave:");
        
        String palabra = sc.nextLine();
        
        // if( valorx.equalsIgnoreCase(palabra) ) {
        if( valorx.compareToIgnoreCase(palabra) == 0) {
            System.out.println("Bienvenido !");
        }
        else {
            System.out.println("Clave incorrecta !");
        }
        
    }
    
}
