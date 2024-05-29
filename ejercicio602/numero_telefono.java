package ejercicio602;

public class numero_telefono {
    
    String numero="";
    
    public String formateo() {
        
        String salida="";
        
        StringBuilder sb = new StringBuilder();
        sb.append("(");
        sb.append(numero.substring(0, 2));
        sb.append(")-");
        sb.append(numero.substring(2, 3));
        sb.append("-");
        sb.append(numero.substring(3));
        
        salida = sb.toString();
        
        return salida;
        
    }
    
    
}
