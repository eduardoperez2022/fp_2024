package ejercicio911;

import java.util.Scanner;

public class Ejercicio911 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese importe(sin iva) y porcentaje de iva");
        
        double importesi = sc.nextDouble();
        
        double piva = sc.nextDouble();
        
        factura fac = new factura();
        
        double total = fac.calcula_total(importesi, piva);
        
        System.out.println("Total: " + total);
        
    }
    
}
