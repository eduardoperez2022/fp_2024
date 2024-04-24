package ejercicio401;

public class cuenta {
    
    public String titular;
    public double cantidad;
    
    public cuenta (String ptitular, double psaldo){
        this.titular = ptitular;
        this.cantidad = psaldo;
    }
    
    public void agregar(double importe) {
        this.cantidad = this.cantidad + importe;
    }
    
    public void retirar(double importe) {
        
        if (importe > this.verSaldo()) {
            System.out.println("Saldo insuficiente !");
            return;
        }
        
        this.cantidad = this.cantidad - importe;
    }
    
    public double verSaldo() {
        double saldo = this.cantidad;
        return saldo;
    }
}
