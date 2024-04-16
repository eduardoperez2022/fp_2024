package ejercicios2;


//E206- Realiza un programa que calcule la aceptación de una solicitud en base a los siguientes
//parámetros: edad, nota y sexo.
//a) Mínimo: Nota (5), edad (18), sexo M -> PENDIENTE
//b) Mínimo: Nota (5), edad (18), sexo F -> ACEPTADA
//c) Otros casos -> NO ACEPTADA

import java.util.Scanner;

public class ejercicio_206 {
       
// Ejercicio 206 (Camila Colombo, Yanina Puyo, Micalea, Ponce, Gloria Fulguera y Luca Simonetti)
public static void main(String[] args) {    
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su sexo (M o F)");
        String sexo = entrada.next();
        System.out.println("Ingrese su edad:");
        int edad = entrada.nextInt();
        System.out.println("Ingrese su nota:");
        int nota = entrada.nextInt();
        System.out.println("Ingrese su sexo (M o F)");
 
        String sexo1 = "M";
        String sexo2 = "F";
 
        if ((nota >= 5) && (edad >= 18) && (sexo.equals("F"))) {
            System.out.println("Aceptada");
        } else if (nota >= 5 && edad >= 18 && sexo.equals("M")) {
            System.out.println("Pendiente");
        } else {
            System.out.println("No aceptada");
        } 
    }
}
