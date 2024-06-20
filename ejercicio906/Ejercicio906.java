
//E906 - Escribir un programa que pida al usuario un número entero y muestre por pantalla un triángulo 
//rectángulo como el de más abajo, de altura el número introducido.
//*
//**
//***
//****
//*****

package ejercicio906;

public class Ejercicio906 {

    public static void main(String[] args) {
        
        int lineas = 5;
        
        for (int c = 1  ;  c <= lineas ;  c++ ) {
            for ( int d =1 ; d <= c  ; d++ ) {
                System.out.print("*");
            }
            System.out.println("");
        }
        
        System.out.println("");

        for (int c = 1  ;  c <= lineas ;  c++ ) {
            System.out.println("*".repeat(c));
        }

    }
    
}
