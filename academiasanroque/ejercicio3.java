package academiasanroque;

public class ejercicio3 {

    public abstract class Figura {
        public abstract void calcularArea();
    }

    public class Circulo extends Figura {
        
        double radio;

        public Circulo(int radio){
            this.radio = radio;
        }

        public double getRadio(){
            return radio;
        }

        public void setRadio(int radio){
            this.radio = radio;
        }

        public void calcularArea(){
            double areaCirculo;

            areaCirculo = Math.PI * Math.pow(getRadio(),2);

            System.out.println("Area del circulo es: " + areaCirculo );
        }   
    }

    public static void main(String[] args) {
        ejercicio3 e3 = new ejercicio3();
        Circulo c1 = e3.new Circulo(30);

        c1.calcularArea();
    }


    
}
