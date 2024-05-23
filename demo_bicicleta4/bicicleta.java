
package demo_bicicleta4;

public class bicicleta {

    // atributos
    private int velocidadActual;
    private int platoActual;
    private int pinonActual;
    
    public bicicleta(int velocidadActual, int platoActual, int pinonActual) {
        this.velocidadActual = velocidadActual;
        this.platoActual = platoActual;
        this.pinonActual = pinonActual;
    }

    // metodos
    public void acelerar() {
        // this.velocidadActual = this.velocidadActual * 2;
        setVelocidadActual( getVelocidadActual() * 2 );
    }
    
    public void frenar() {
        // this.velocidadActual = this.velocidadActual / 2;
        setVelocidadActual( getVelocidadActual() / 2 );
    }
    
    public void cambiarPlato(int nuevoPlato) {
        // this.platoActual = nuevoPlato;
        setPlatoActual(nuevoPlato);
    }
    
    public void cambiarPinon(int nuevoPinon) {
        // this.pinonActual = nuevoPinon;
        setPinonActual(nuevoPinon);
    }

    public int getVelocidadActual() {
        return velocidadActual;
    }

    public void setVelocidadActual(int velocidadActual) {
        this.velocidadActual = velocidadActual;
    }

    public int getPlatoActual() {
        return platoActual;
    }

    public void setPlatoActual(int platoActual) {
        this.platoActual = platoActual;
    }

    public int getPinonActual() {
        return pinonActual;
    }

    public void setPinonActual(int pinonActual) {
        this.pinonActual = pinonActual;
    }

    
}
