package ejercicio401;

public class Ejercicio401 {

    public static void main(String[] args) {
        
        // cuenta cu1 = new cuenta();
        cuenta cu1 = new cuenta("Juan Garcia", 0);
        
        double importe1 = cu1.verSaldo();
        
        // cu1.titular = "Juan Garcia";

        System.out.println("Saldo inicial: " + importe1);
        System.out.println("Titular: " + cu1.titular);
        
        cu1.agregar(5000.55);
        
        System.out.println("Agrego 5000.55, saldo : " + cu1.verSaldo());
        
        cu1.retirar(4000);

        System.out.println("Retiro 4000, saldo : " + cu1.verSaldo());
        
        cu1.retirar(2000);

        System.out.println("Retiro 2000, saldo : " + cu1.verSaldo());
        
        cu1.retirar(500);

        System.out.println("Retiro 500, saldo : " + cu1.verSaldo());
        
    }
    
}
