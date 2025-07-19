package academiasanroque;

public class ejercicio2 {

    public class CuentaBancaria {

        private int numeroCuenta;
        private int saldo;
        private String titular;

        public CuentaBancaria (int numeroCuenta, int saldo, String titular){
            this.titular = titular;
            this.saldo = saldo;
            this.numeroCuenta = numeroCuenta;
        }
        
        public String getTitular(){
            return titular;
        }

        public int getNumeroCuenta(){
            return numeroCuenta;
        }

        public int getSaldo(){
            return saldo;
        }

        public void setTitular(String titular){
            this.titular = titular;
        }

        public void setNumeroCuenta(int numeroCuenta){
            this.numeroCuenta = numeroCuenta;
        }

        public void setSaldo(int saldo){
            this.saldo = saldo;
        }

        public void depositarDinero(int dineroDeposito) {
            if (dineroDeposito > 0) {
            System.out.println("Depositar dinero, al numero de cuenta " + getNumeroCuenta() + ", con su titular " + getTitular());
            System.out.println("Saldo actual, " + getSaldo());
            System.out.println("Nuevo saldo, "+ (getSaldo() + dineroDeposito));   
            }
        }

        public void retirarDinero(int dineroRetiro) {
            if (saldo > 0 && dineroRetiro <= saldo) {
            System.out.println("Retirar dinero, de la cuenta " + getNumeroCuenta() + ", con su titular " + getTitular());
            System.out.println("Saldo actual, " + getSaldo());
            System.out.println("Nuevo saldo, " + (getSaldo() - dineroRetiro));    
            }else{
                throw new ArithmeticException ("Saldo de la cuenta no es valido");
            }
            
        }

        public void mostrarSaldo(){
            System.out.println("El saldo de la cuenta es " + getSaldo() );
        }
    }

    public static void main(String[] args) {
        ejercicio2 e2 = new ejercicio2();
        CuentaBancaria c1 = e2.new CuentaBancaria(1, 100000, "Martin");

        c1.depositarDinero(100000);
        c1.retirarDinero(100000);
        c1.mostrarSaldo();
    }
    
}
