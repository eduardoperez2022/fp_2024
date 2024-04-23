package ejercicio_clase_string;

public class ejercicio_clase_string {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio clase String");
        System.out.println("----------------------");
        System.out.println("");
        
        // variable de prueba
        String sprueba = "esto es una prueba";
        
        // variable resultado
        String resultado = sprueba.replace("es", "no es");
        
        System.out.println("Valor original: " + sprueba);
        
        System.out.println("metodo: " + "replace");
        
        System.out.println("Valor resultado: " + resultado);

    }
    
}
