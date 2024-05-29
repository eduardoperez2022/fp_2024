package ejercicio602;

import java.util.Scanner;

public class Ejercicio602 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese un numero de 10 digitos");
        
        String numero = sc.nextLine();
        
        StringBuilder sb = new StringBuilder();
                
        sb.append("(");
        sb.append(numero.substring(0, 2));
        sb.append(")-");
        sb.append(numero.substring(2, 3));
        sb.append("-");
        sb.append(numero.substring(3));
        
        
        System.out.println("Salida:" + sb.toString());
        
    }
    
}
