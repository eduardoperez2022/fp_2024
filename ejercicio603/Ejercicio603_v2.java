package ejercicio603;

import java.util.Scanner;

public class Ejercicio603_v2 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese Nombre, importe, concepto y fecha:");
        
        String nombre = sc.nextLine();
        String importe = sc.nextLine();
        String concepto = sc.nextLine();
        String fecha = sc.nextLine();
        
        recibo rc = new recibo(nombre, importe, concepto, fecha);
        
        System.out.println(rc.imprime());
        
    }
    
}
