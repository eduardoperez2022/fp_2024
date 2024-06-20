
//E903 - Los alumnos de un curso se han dividido en dos grupos A y B, de acuerdo al sexo y el 
//nombre. El grupo A esta formado por las mujeres con un nombre anterior a la M y los hombres
//con un nombre posterior a la N, y el grupo B por el resto. Escribir un programa que pregunte al
//usuario su nombre y sexo, y muestre por pantalla el grupo que le corresponde.

package ejercicio903;

import java.util.Scanner;

public class Ejercicio903_v2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese nombre y sexo(F/M)");
        
        String nombre1 = sc.nextLine();
        
        String sexo1 = sc.nextLine();
        
        String letra_nombre = nombre1.substring(0, 1);
        letra_nombre = letra_nombre.toUpperCase();
        
        String elgrupo="";
        // grupo A
        if (sexo1.equalsIgnoreCase("F")  && (letra_nombre.compareToIgnoreCase("M") < 0)  ) {
            elgrupo = "A";
        }
        else if (sexo1.equalsIgnoreCase("M") && (letra_nombre.compareToIgnoreCase("N") > 0) ) {
           elgrupo = "A";
        }
        // grupo B
        else {
           elgrupo = "B";
        }
        
        System.out.println("Su grupo es " + elgrupo);
        
    }
    
}
