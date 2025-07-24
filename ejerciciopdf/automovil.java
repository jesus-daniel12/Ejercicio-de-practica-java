package ejerciciopdf;

public class automovil {
    public class Automovil {
        
        String marca;// el nombre del fabricante.
        String modelo;// año de fabricación.
        double motor;// volumen en litros del cilindraje del motor de un automóvil.
        TipoCombustible combustibleTipo;
        TipoAutomovil automovilTipo;
        TipoColor colorTipo;
        int numeroPuertas;
        int cantidadAsientos;
        int velocidadMaxima;
        int velocidadActual = 0;
        
        public enum TipoCombustible{
            GASOLINA,
            BIOETANOL,
            DIESEL, 
            BIODIESEL, 
            GASNATURAL
        }

        public enum TipoColor{
            BLANCO,
            NEGRO, 
            ROJO, 
            NARANJA, 
            AMARILLO, 
            VERDE, 
            AZUL, 
            VIOLETA
        }

        public enum TipoAutomovil{
            CARROCIUDAD,
            SUBCAMPO, 
            COMPACTO, 
            FAMILIAR, 
            EJECUTIVO, 
            SUV
        }

        public Automovil(String marca, String modelo, double motor, TipoCombustible combustibleTipo,
                TipoAutomovil automovilTipo, TipoColor colorTipo, int numeroPuertas, int cantidadAsientos,
                int velocidadMaxima) {
            this.marca = marca;
            this.modelo = modelo;
            this.motor = motor;
            this.combustibleTipo = combustibleTipo;
            this.automovilTipo = automovilTipo;
            this.colorTipo = colorTipo;
            this.numeroPuertas = numeroPuertas;
            this.cantidadAsientos = cantidadAsientos;
            this.velocidadMaxima = velocidadMaxima;
            
        }

        public String getMarca() {
            return marca;
        }

        public void setMarca(String marca) {
            this.marca = marca;
        }

        public String getModelo() {
            return modelo;
        }

        public void setModelo(String modelo) {
            this.modelo = modelo;
        }

        public double getMotor() {
            return motor;
        }

        public void setMotor(double motor) {
            this.motor = motor;
        }

        public TipoCombustible getCombustibleTipo() {
            return combustibleTipo;
        }

        public void setCombustibleTipo(TipoCombustible combustibleTipo) {
            this.combustibleTipo = combustibleTipo;
        }

        public TipoAutomovil getAutomovilTipo() {
            return automovilTipo;
        }

        public void setAutomovilTipo(TipoAutomovil automovilTipo) {
            this.automovilTipo = automovilTipo;
        }

        public TipoColor getColorTipo() {
            return colorTipo;
        }

        public void setColorTipo(TipoColor colorTipo) {
            this.colorTipo = colorTipo;
        }

        public int getNumeroPuertas() {
            return numeroPuertas;
        }

        public void setNumeroPuertas(int numeroPuertas) {
            this.numeroPuertas = numeroPuertas;
        }

        public int getCantidadAsientos() {
            return cantidadAsientos;
        }

        public void setCantidadAsientos(int cantidadAsientos) {
            this.cantidadAsientos = cantidadAsientos;
        }

        public int getVelocidadMaxima() {
            return velocidadMaxima;
        }

        public void setVelocidadMaxima(int velocidadMaxima) {
            this.velocidadMaxima = velocidadMaxima;
        }

        public int getVelocidadActual() {
            return velocidadActual;
        }

        public void setVelocidadActual(int velocidadActual) {
            this.velocidadActual = velocidadActual;
        }

        public void mostrarAtributos(){
            System.out.println("Marca: " + marca);
            System.out.println("Modelo: " + modelo);
            System.out.println("Motor: " + motor);
            System.out.println("Tipo de combustible: " + combustibleTipo);
            System.out.println("Tipo de automovil: " + automovilTipo);
            System.out.println("Tipo de color: " + colorTipo);
            System.out.println("Numero de puertas: " + numeroPuertas);
            System.out.println("Cantidad de Asientos: " + cantidadAsientos);
            System.out.println("Velocidad maxima de vehiculo: " + velocidadMaxima);
           
        }

        public void acelerarVehiculo(int acelerarVehiculo){
            if (acelerarVehiculo > 0 && acelerarVehiculo < velocidadMaxima && (velocidadActual + acelerarVehiculo) <= velocidadMaxima) {
                System.out.println("Velocidad actual: " + velocidadActual);
                velocidadActual =  velocidadActual + acelerarVehiculo;
                System.out.println("Nueva velocidad: " + velocidadActual);
            }else{
                System.out.println("No se puede acelerar mas de la velocidad maxima de vehiculo, y no puede acerlerar el vehiculo ser menor a cero o igual.");
            }
        }

         public void desacelerarVehiculo(int desacelerarVehiculo){
            if (desacelerarVehiculo > 0 && (velocidadActual - desacelerarVehiculo) > 0) {
                System.out.println("Velocidad actual: " + velocidadActual);
                velocidadActual = velocidadActual - desacelerarVehiculo;
                System.out.println("Nueva velocidad: " + velocidadActual);
            }else{
                System.out.println("No se puede desacelerar a una velocidad negativa el vehiculo, y  no puede desacelerar el vehiculo menor a cero o igual.");
            }
        }

        public void frenarVehiculo(){
            velocidadActual = 0;
            System.out.println("Vehiculo quieto.");
        }

        public int calcularDistancia(int distancia){// distancia en Kilometros
            int tiempoTarda = distancia / velocidadActual;
            return tiempoTarda;
        }
        
    }

    
        public static void main(String[] args) {
            automovil automovil = new automovil();

            Automovil auto1 = automovil.new Automovil("FORD", "2018", 3,  Automovil.TipoCombustible.DIESEL, Automovil.TipoAutomovil.EJECUTIVO,  Automovil.TipoColor.NEGRO, 5, 6, 250);

            auto1.mostrarAtributos();

            auto1.setVelocidadActual(100);

            auto1.acelerarVehiculo(20);
            auto1.desacelerarVehiculo(50);
            auto1.frenarVehiculo();
        }
}
