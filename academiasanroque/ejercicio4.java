package academiasanroque;

public class ejercicio4 {

    public abstract class Empleado {

        private String nombre;
        private int salarioBase;

        public Empleado (String nombre, int salarioBase){
            this.nombre = nombre;
            this.salarioBase = salarioBase;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getSalario() {
            return salarioBase;
        }

        public void setSalario(int salarioBase) {
            this.salarioBase = salarioBase;
        }

        public abstract void calcularSalario();
    }

    public class EmpleadoPorHora extends ejercicio4.Empleado {

        private int tarifa;
        private int horasTrabajadas;

        public EmpleadoPorHora (String nombre, int salarioBase, int tarifa, int horasTrabajadas){
            super(nombre, salarioBase);
            this.tarifa = tarifa;
            this.horasTrabajadas = horasTrabajadas;     
        }

        public int getTarifa() {
            return tarifa;
        }

        public void setTarifa(int tarifa) {
            this.tarifa = tarifa;
        }

        public int getHorasTrabajadas() {
            return horasTrabajadas;
        }

        public void setHorasTrabajadas(int horasTrabajadas) {
            this.horasTrabajadas = horasTrabajadas;
        }

        public void calcularSalario() {;

            super.setSalario(getHorasTrabajadas() * getTarifa());
        }   

        public static void main(String[] args) {
            ejercicio4 e4 = new ejercicio4();

            Empleado empleado1 = e4.new EmpleadoPorHora("Martin", 0, 20, 100);

            empleado1.calcularSalario();

            System.out.println("El salario de " + empleado1.getNombre() + " es: " + empleado1.getSalario());
        }

        
    }
    
}
 