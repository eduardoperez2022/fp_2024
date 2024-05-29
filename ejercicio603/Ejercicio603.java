package ejercicio603;

import java.util.Scanner;

public class Ejercicio603 {

    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        
        System.out.println("Ingrese Nombre, importe, concepto y fecha:");
        
        String nombre = sc.nextLine();
        String importe = sc.nextLine();
        String concepto = sc.nextLine();
        String fecha = sc.nextLine();
        
        StringBuilder plantilla = new StringBuilder();
        
        plantilla.append("Recibo – Fecha <fecha>");
        plantilla.append("\n");
        plantilla.append("Recibí del Sr/a <nombre> la cantidad de pesos <importe> por el concepto de <concepto>");
        plantilla.append("\n");
        plantilla.append("\n");
        plantilla.append("\n");
        plantilla.append("------------------                                        -------------------");
        plantilla.append("\n");
        plantilla.append("Firma emisor                                                 Firma receptor");        
        
        int p1 = plantilla.indexOf("<fecha>");
        plantilla.replace(p1, p1+7, fecha);
        
        int p2 = plantilla.indexOf("<nombre>");
        plantilla.replace(p2, p2+8, nombre);
        
        int p3 = plantilla.indexOf("<importe>");
        plantilla.replace(p3, p3+9, importe);

        int p4 = plantilla.indexOf("<concepto>");
        plantilla.replace(p4, p4+10, concepto);

        System.out.println("");
        System.out.println(plantilla.toString());
        
    }
    
}
