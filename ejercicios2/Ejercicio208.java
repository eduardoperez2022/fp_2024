
//E208- Los tramos impositivos para la declaración de la renta en un determinado país son los
//siguientes:
//Renta Tipo impositivo
//Menos de 10000€ 5%
//Entre 10000€ y 20000€ 15%
//Entre 20000€ y 35000€ 20%
//Entre 35000€ y 60000€ 30%
//Más de 60000€ 45%
//Escribir un programa que pregunte al usuario su renta anual y muestre por pantalla el tipo impositivo
//que le corresponde

package ejercicios2;
 
import java.util.Scanner;
 
public class Ejercicio208 {
 
    public static void main(String[] args) {

    Scanner entrada = new Scanner (System.in);

        System.out.println("Renta: ");

        int renta = entrada.nextInt();

        if (renta < 10000) {

            System.out.println("5%");

        } else if (renta >= 10000 && renta < 20000) {

            System.out.println("15%");

        } else if (renta >= 20000 && renta < 35000){

            System.out.println("20%");

        } else if (renta >= 35000 && renta < 60000) {

            System.out.println("30%");

        } else {

            System.out.println("45%");

        }

    }

}
