
//E209- Escribir un programa para una empresa que tiene salas de juegos para todas las edades y
//quiere calcular de forma automática el precio que debe cobrar a sus clientes por entrar. El programa
//debe preguntar al usuario la edad del cliente y mostrar el precio de la entrada. Si el cliente es menor
//de 4 años puede entrar gratis, si tiene entre 4 y 18 años debe pagar 5€ y si es mayor de 18 años, 10€

package ejercicios2;

import java.util.Scanner;

/**
 *
 * @author eduardo
 */
public class Ejercicio209 {
    
    public static void main(String[] args) {
    
          Scanner entrada = new Scanner (System.in);
      System.out.println("Ingrese su edad, la entrada paras menores de 4 años es gratis, si tiene de 4 a 18 son 5 euros, si es mayor de 18 es 10 euros.");
      int edad = entrada.nextInt();
      if (edad < 4){
          System.out.println("Su entrada es gratis.");
      }
      else if (edad >= 4  && edad <= 18){
          System.out.println("Su entrada cuesta 5 euros.");
      }
      else {
          System.out.println("Su entrada cuesta 10 euros.");
      }                               
    
    }
    
}
