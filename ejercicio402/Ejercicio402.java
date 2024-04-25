package ejercicio402;

public class Ejercicio402 {

    public static void main(String[] args) {
        
        // libro unlibro = new libro();
        
        // unlibro.titulo = "Yo Robot";
        // unlibro.autor = "Carl Saggan";

        libro unlibro = new libro("Yo Robot", "Carl Saggan");
        
        unlibro.ejemplares = 3;
        
        System.out.println("Titulo: " + unlibro.titulo);
        System.out.println("Autor: " + unlibro.autor);
        System.out.println("Disponibles: " + unlibro.ejemplares);
        System.out.println("Prestados: " + unlibro.prestados);
        
        boolean ok = unlibro.prestamo();
        
        System.out.println("");
        System.out.println("toString");
        System.out.println(unlibro.toString());
        
        if (ok == true) {
            System.out.println("");
            System.out.println("Presto 1 ");
            System.out.println("Disponibles: " + (unlibro.ejemplares - unlibro.prestados));
            System.out.println("Prestados: " + unlibro.prestados);
        }
        else {
            System.out.println("No hay mas libros para prestar");
        }
        
        unlibro.prestamo();
        unlibro.prestamo();
        
        System.out.println("");
        System.out.println("Presto 2 ");
        System.out.println("Disponibles: " + (unlibro.ejemplares - unlibro.prestados));
        System.out.println("Prestados: " + unlibro.prestados);
        
        boolean ok2 = unlibro.prestamo();

        if (ok2 == true) {
            System.out.println("");
            System.out.println("Presto 1 ");
            System.out.println("Disponibles: " + (unlibro.ejemplares - unlibro.prestados));
            System.out.println("Prestados: " + unlibro.prestados);
        }
        else {
            System.out.println("No hay mas libros para prestar");
        }
        
        System.out.println("");
        System.out.println("toString");
        System.out.println(unlibro.toString());
        
    }
    
}
