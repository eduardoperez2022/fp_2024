package ejercicio307;
 
import java.util.Scanner;
 
public class Ejercicio307 {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numeros: ");
        int numero=0;
        int suma=0;
        while( suma <= 1000 ) {
            numero = sc.nextInt();
            suma = suma + numero;
            System.out.println("Suma:" + suma);
        }
    }
}