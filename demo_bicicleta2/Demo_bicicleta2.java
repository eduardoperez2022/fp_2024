package demo_bicicleta2;

import java.util.Scanner;

public class Demo_bicicleta2 {

    public static void main(String[] args) {
        
        // prueba de clase bicicleta
        bicicleta bici1 = new bicicleta();
        bici1.velocidadActual = 5; 
        
        System.out.println("Ingrese accion: 1-acelera, 2-frena, 3-plato, 4-pinon, 0-salir");
        
        Scanner sc =new Scanner(System.in);
        
        int accion = -1;
        
        while (accion != 0) {
            
            System.out.println("Accion ? ");
            accion = sc.nextInt();

            if (accion == 1) {
                bici1.acelerar();
            }

            else if (accion == 2) {
                bici1.frenar();
            }
            
            else if (accion == 3) {
                System.out.println("Plato ? ");
                int plato = sc.nextInt();
                bici1.cambiarPlato(plato);
            }
            
            else if (accion == 4) {
                System.out.println("Pinon ? ");
                int pinon = sc.nextInt();
                bici1.cambiarPinon(pinon); 
            }

            System.out.println("Velocidad actual: " + bici1.velocidadActual);
            System.out.println("Plato actual: " + bici1.platoActual);
            System.out.println("Pinon actual: " + bici1.pinonActual);
            
        }
        
    }
    
    
    
    
    
    
}
