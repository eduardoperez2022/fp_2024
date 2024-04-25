package ejercicio402;

public class libro {
    
    public String titulo;
    public String autor;
    
    public int ejemplares;
    public int prestados;
    
    
    public libro(String ptitulo, String pautor) {
        this.titulo = ptitulo;
        this.autor = pautor;
    }
    
    public boolean prestamo() {
        
        boolean exito = false;
        
        if ( this.prestados < this.ejemplares) {
            // this.prestados = this.prestados +1;
            this.prestados++;
            exito = true;
        }
        
        return exito;
    }
    
    public void devolucion() {
        // this.prestados = this.prestados - 1;
        this.prestados--;
    }

    @Override
    public String toString() {
        return "libro{" + "titulo=" + titulo + ", autor=" + autor + ", ejemplares=" + ejemplares + ", prestados=" + prestados + '}';
    }
    
}
