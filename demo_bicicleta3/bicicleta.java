
package demo_bicicleta3;

public class bicicleta {

    public bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

//    public bicicleta(int velocidad, int plato, int pinon){
//        this.velocidadActual = velocidad;
//        this.platoActual = plato;
//        this.pinonActual = pinon;
//    }
    
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
