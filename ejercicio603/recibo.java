package ejercicio603;

public class recibo {
    
    String nombre;
    String importe;
    String concepto;
    String fecha;

    public recibo(String nombre, String importe, String concepto, String fecha) {
        this.nombre = nombre;
        this.importe = importe;
        this.concepto = concepto;
        this.fecha = fecha;
    }


    public String imprime() {
        
        String salida="";
        
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
        
        salida = plantilla.toString();
        
        return salida;
    }
    
    
}
