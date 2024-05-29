package ejercicio602;

import java.util.Scanner;

public class Ejercicio600_v2 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 10 digitos");
        
        String numero_entrada = sc.nextLine();
        
        numero_telefono laclase = new numero_telefono();
        
        laclase.numero = numero_entrada;
        
        System.out.println("Salida:" + laclase.formateo());
        
    }
    
}
