package ejercicio919;

public class llamada {
    
    public double calcula_costo(int minutos) {
        
        double resultado=0;
        
        double costo_full = 1 + 0.8 + 0.7 + 0.5;
        double costo_tramo1 = 1;
        double costo_tramo2 = 1 + 0.8;
        double costo_tramo3 = 1 + 0.8 + 0.7;
        
        if (minutos <= 5 ) {
            resultado = costo_tramo1;
        }
        else if (minutos > 5 && minutos <= 8) {
            resultado = costo_tramo2;
        }
        else if (minutos > 8 && minutos <= 10) {
            resultado = costo_tramo3;
        }
        else if (minutos > 10 ) {
            resultado = costo_full;
        }
        
        return resultado;
        
    }

}
