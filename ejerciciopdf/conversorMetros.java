package ejerciciopdf;

public class conversorMetros {
    public class Conversor {
        
        private double metros;
        private static final double METROS_A_CENTIMETROS = 100;
        private static final double METROS_A_MILIMETROS = 1000;
        private static final double METROS_A_PULGADAS = 39.3701;
        private static final double METROS_A_PIES = 3.28084;
        private static final double METROS_A_YARDAS = 1.09361;

        public Conversor(double metros){
            this.metros = metros;
        }

        public double getMetros() {
            return metros;
        }

        public void setMetros(double metros) {
            this.metros = metros;
        }

        public static double getMetrosACentimetros() {
            return METROS_A_CENTIMETROS;
        }

        public static double getMetrosAMilimetros() {
            return METROS_A_MILIMETROS;
        }

        public static double getMetrosAPulgadas() {
            return METROS_A_PULGADAS;
        }

        public static double getMetrosAPies() {
            return METROS_A_PIES;
        }

        public static double getMetrosAYardas() {
            return METROS_A_YARDAS;
        }

        public double convertirACentimetro(){
            double resultado = METROS_A_CENTIMETROS * metros;
            return resultado;
        }

        
        public double convertirAMilimentros(){
            double resultado = METROS_A_MILIMETROS * metros;
            return resultado;
        }

        
        public double convertirAPulgas(){
            double resultado = METROS_A_PULGADAS * metros;
            return resultado;
        }

        
        public double convertirAPies(){
            double resultado = METROS_A_PIES * metros;
            return resultado;
        }

        
        public double convertirAYardas(){
            double resultado = METROS_A_YARDAS * metros;
            return resultado;
        }
    }

    public static void main(String[] args) {
        conversorMetros conversorMetros = new conversorMetros();

        Conversor metro = conversorMetros.new Conversor(3.5);

        System.out.println("En centimentros : " + metro.convertirACentimetro());
        System.out.println("En milimetros : " + metro.convertirAMilimentros());
        System.out.println("En pulgadas : " + metro.convertirAPulgas());
        System.out.println("En pies : " + metro.convertirAPies());
        System.out.println("En yardas : " + metro.convertirAYardas());
    }
    
}
