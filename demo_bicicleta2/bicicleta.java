
package demo_bicicleta2;

public class bicicleta {
    
    // atributos
    public int velocidadActual;
    
    public int platoActual;
    
    public int pinonActual;
    
    // metodos
    public void acelerar() {
        this.velocidadActual = this.velocidadActual * 2;
    }
    
    public void frenar() {
        this.velocidadActual = this.velocidadActual / 2;
    }
    
    public void cambiarPlato(int nuevoPlato) {
        this.platoActual = nuevoPlato;
    }
    
    public void cambiarPinon(int nuevoPinon) {
        this.pinonActual = nuevoPinon;
    }
    
}
