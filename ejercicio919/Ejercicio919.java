//E919 - La política de cobro de una compañía telefónica es:
//Cuando se realiza una llamada, el cobro es por el tiempo que esta dura, de tal forma que los primeros 
//cinco minutos cuestan 1 euro, los siguientes tres, 80 céntimos, los siguientes dos minutos a 70 
//céntimos y a partir del décimo minuto, 50 céntimos.
//Además, se carga un impuesto de 3% cuando es domingo.
//Realiza un algoritmo para determinar cuánto debe pagar por cada concepto una persona que realiza 
//una llamada.


package ejercicio919;

import java.util.Scanner;

public class Ejercicio919 {

    public static void main(String[] args) {
        
       Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese minutos de llamada");
        
        int min1 = sc.nextInt();
         
        llamada llam =new llamada();
        
        double costo = llam.calcula_costo(min1);
        
        System.out.println("El costo es " + costo);

    }
    
}
