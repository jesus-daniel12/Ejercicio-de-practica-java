package ejerciciopdf;

import ejerciciopdf.cuentaBancarria.Cuenta.TipoCuenta;

public class cuentaBancarria {

    public class Cuenta {
        String nombre, apellido;
        int numeroCuenta;
        int saldoCuenta = 0;
        TipoCuenta tipoCuenta;
        
        public enum TipoCuenta{
            AHORRO,
            CORRIENTE
        }

        public Cuenta(String nombre, String apellido, int numeroCuenta, TipoCuenta tipoCuenta) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroCuenta = numeroCuenta;
            this.tipoCuenta = tipoCuenta;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public int getNumeroCuenta() {
            return numeroCuenta;
        }

        public void setNumeroCuenta(int numeroCuenta) {
            this.numeroCuenta = numeroCuenta;
        }

        public int getSaldoCuenta() {
            return saldoCuenta;
        }

        public void setSaldoCuenta(int saldoCuenta) {
            this.saldoCuenta = saldoCuenta;
        }

        public TipoCuenta getTipoCuenta() {
            return tipoCuenta;
        }

        public void setTipoCuenta(TipoCuenta tipoCuenta) {
            this.tipoCuenta = tipoCuenta;
        }
        
        public void imprimir(){
            System.out.println("Nombre: " + nombre);
            System.err.println("Apellido: " + apellido);
            System.out.println("Numero de cuenta: " + numeroCuenta);
            System.out.println("Tipo de cuenta: " + tipoCuenta);
            System.out.println("Saldo de cuenta: " + saldoCuenta);
        }

        public void consultaSaldoCuenta(){
            System.out.println("El saldo de la cuenta es: " + saldoCuenta);
        }

        public void actualizarSaldoCuenta(int nuevoSaldo){
            if (nuevoSaldo > 0) {
                System.out.println("El saldo de cuenta actual es: " + saldoCuenta);
                saldoCuenta = saldoCuenta + nuevoSaldo;
                System.out.println("El nuevo saldo de cuenta es: " + saldoCuenta);
            }
        }

        public boolean retirarDinero(int retiro){
            if (retiro > 0 && retiro <  saldoCuenta) {
                System.out.println("El saldo de cuenta actual es: " + saldoCuenta);
                saldoCuenta = saldoCuenta - retiro;
                System.out.println("El nuevo saldo de cuenta es: " + saldoCuenta);
                return true;
            }else{
                System.out.println("el valor solicitado supera el saldo actual de la cuenta.");
                return false;
            }
        }

        public boolean compararCuenta(Cuenta cuentaComparar){
            if (saldoCuenta >= cuentaComparar.saldoCuenta) {
                return true;
            }
            return false;
        }

        public void tranferencia(Cuenta cDestino, int valorTranferir){
            if (retirarDinero(valorTranferir)) {
                cDestino.actualizarSaldoCuenta(valorTranferir);
            }
            
        }
    }

    public static void main(String[] args) {
        cuentaBancarria cuenta = new cuentaBancarria();

        Cuenta cOringen = cuenta.new Cuenta("Pedro", "Perez", 123456789, TipoCuenta.AHORRO);
        Cuenta cDestino = cuenta.new Cuenta("Pablo", "Pizon", 44556677, TipoCuenta.AHORRO);

        cOringen.actualizarSaldoCuenta(200000);
        cDestino.actualizarSaldoCuenta(100000);

        cOringen.compararCuenta(cDestino);
        cOringen.tranferencia(cDestino, 50000);
        cOringen.consultaSaldoCuenta();
        cDestino.consultaSaldoCuenta();

    }
}
