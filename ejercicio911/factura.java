package ejercicio911;

public class factura {
    
    public double calcula_total( double importe, double iva ) {
        
        double resultado = 0;
        
        if (iva == 0) {
            iva = 21;
        }
        
        double impuesto = (importe * iva) / 100;
        
        resultado = importe + impuesto;
        
        return resultado;
        
    }
    
}
