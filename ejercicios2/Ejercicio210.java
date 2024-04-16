
// E210- En la tienda MegaPlaza se hace un 20% de descuento a los clientes cuya compra supere los
// 300€. Hacer un programa que calcule e informe el importe a pagar, en base al monto de su compra

package ejercicios2;
 
import java.util.Scanner;
 
 
public class Ejercicio210 {
 
    public static void main(String[] args) {

        Scanner entrada = new Scanner (System.in);

        System.out.println("Ingrese el monto de su compra");

        float ValorCompra = entrada.nextInt ();

        if (ValorCompra > 300) {

            float PrecioDesc = (float) (ValorCompra - (ValorCompra * 0.20));

            System.out.println("Debe abonar: " + PrecioDesc);

        } else {

            System.out.println("Abona: " + ValorCompra);

        }

    }

}
