package ejercicio912;

import java.util.Scanner;

public class Ejercicio912 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese radio de la base y altura del cilindro");
        
        double base1 = sc.nextDouble();
        
        double altura1 = sc.nextDouble();

        cilindro cil = new cilindro();
        
        double sup = cil.area_base(base1);
        
        double vol = cil.volumen(base1, altura1);
        
        System.out.println("La superficie: " + sup);
        System.out.println("El volumen: " + vol);
        
    }
    
}
