package ejerciciopdf;

public class figurasGeometricas {

    public class Circulo {
        
        double radio; // centimentros
        
        public Circulo (double radio){
            this.radio = radio;
        }

        public double getRadio() {
            return radio;
        }

        public void setRadio(double radio) {
            this.radio = radio;
        }

        public double areaCirculo(){
            return Math.PI * Math.pow(radio, 2); 
        }

        public double perimetroCirculo(){
            return 2 * Math.PI * radio;
        }
    }

    public class Rectangulo {

        double base; // centimentos
        double altura; // centimentos
        
        public Rectangulo (double base, double altura){
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        public double calcularArea(){
            return (base * altura) / 2;
        }

        public double calcularPerimetro(){
            return (base * 2) + (altura * 2);
        }
    }

    public class Cuadrado {
        
        double lado;

        public Cuadrado (double lado){
            this.lado = lado;
        }

        public double getLado() {
            return lado;
        }

        public void setLado(double lado) {
            this.lado = lado;
        }

        public double areaCuadrado(){
            return Math.pow(lado, 2);
        }

        public double perimetroCuadrado(){
            return lado + lado + lado + lado;
        }
    }

    public class Triangulo {

        double base;
        double altura;

        public Triangulo (double base, double altura){
            this.base = base;
            this.altura = altura;
        }

        public double getBase() {
            return base;
        }

        public void setBase(double base) {
            this.base = base;
        }

        public double getAltura() {
            return altura;
        }

        public void setAltura(double altura) {
            this.altura = altura;
        }
        
        public double areaTriangulo(){
            return (base * altura) / 2;
        }

        public double calcularHipotenusa(){
            return Math.pow(base * base + altura * altura, 0.5);
        }

        public double perimetroTriangulo(){
            return base + altura + calcularHipotenusa();
        }

        public void tipoTriangulo(){
            if (base == altura && base == calcularHipotenusa() && altura == calcularHipotenusa()) {
                System.out.println("Es un triangulo equilatero");
            } else if (base != altura && base != calcularHipotenusa() && altura != calcularHipotenusa()) {
                System.out.println("El triangulo es escaleno");
            }else{
                System.out.println("Es un triangulo isoceles");
            }
        }
    }

    public static void main(String[] args) {
        figurasGeometricas figuras = new figurasGeometricas();

        Circulo figura1 = figuras.new Circulo(2);
        Rectangulo figura2 = figuras.new Rectangulo(1, 2);
        Cuadrado figura3 = figuras.new Cuadrado(3);
        Triangulo figura4 = figuras.new Triangulo(3, 5);

        System.out.println("El área del círculo es =" + figura1.areaCirculo() ); 
        System.out.println("El perímetro del círculo es = " + figura1.perimetroCirculo());
        System.out.println();
         System.out.println("El área del rectángulo es = " + figura2.calcularArea()); 
        System.out.println("El perímetro del rectángulo es = " + figura2. calcularPerimetro());
        System.out.println(); 
        System.out.println("El área del cuadrado es = " + figura3.areaCuadrado()); 
        System.out.println("El perímetro del cuadrado es = " + figura3.perimetroCuadrado());
        System.out.println();
        System.out.println("El área del triángulo es = " + figura4.areaTriangulo());
        System.out.println("El perímetro del triángulo es = " + figura4.perimetroTriangulo()); 
        figura4.tipoTriangulo();


    }

    
}
