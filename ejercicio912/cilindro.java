package ejercicio912;

public class cilindro {
    
    public double area_base(double radio) {
        
        double resultado=0;
        
        resultado =  Math.PI * radio * radio;
        
        return resultado;
        
    }
    
    public double volumen(double radio, double altura) {
        
        double resultado=0;
        
        double base = this.area_base(radio);
        
        resultado = base * altura;
        
        return resultado;
        
    }
    
}
