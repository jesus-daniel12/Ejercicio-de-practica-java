package ejerciciopdf;

import ejerciciopdf.planeta.Planeta.TipoPlaneta;

public class planeta {
    public class Planeta {

        String nombre = null;
        int cantidadSatelites = 0;
        double masaKilogramos = 0;
        double volumenKilometrosCubicos = 0;
        int diametroKilometros = 0;
        boolean esObservable = false;
        int distanciaSol = 0;
        TipoPlaneta tipo;

        public enum TipoPlaneta{
            GASEOSA,
            TERRESTRE, 
            ENANO
        }

        public Planeta (String nombre, int cantidadSatelites, double masaKilogramos, double volumenKilometrosCubicos, int diametroKilometros, boolean esObservable, int distanciaSol, TipoPlaneta tipoPlaneta){
            this.nombre = nombre;
            this.cantidadSatelites = cantidadSatelites;
            this.masaKilogramos = masaKilogramos;
            this.volumenKilometrosCubicos = volumenKilometrosCubicos;
            this.diametroKilometros = diametroKilometros;
            this.esObservable = esObservable;
            this.distanciaSol = distanciaSol;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getCantidadSatelites() {
            return cantidadSatelites;
        }

        public void setCantidadSatelites(int cantidadSatelites) {
            this.cantidadSatelites = cantidadSatelites;
        }

        public double getMasaKilogramos() {
            return masaKilogramos;
        }

        public void setMasaKilogramos(double masaKilogramos) {
            this.masaKilogramos = masaKilogramos;
        }

        public double getVolumenKilometrosCubicos() {
            return volumenKilometrosCubicos;
        }

        public void setVolumenKilometrosCubicos(double volumenKilometrosCubicos) {
            this.volumenKilometrosCubicos = volumenKilometrosCubicos;
        }

        public int getDiametroKilometros() {
            return diametroKilometros;
        }

        public void setDiametroKilometros(int diametroKilometros) {
            this.diametroKilometros = diametroKilometros;
        }

        public boolean isEsObservable() {
            return esObservable;
        }

        public void setEsObservable(boolean esObservable) {
            this.esObservable = esObservable;
        }
        
        public void atributosPlaneta(){
            System.out.println("Nombre: " + nombre);
            System.out.println("Cantidad de santelites: " + cantidadSatelites);
            System.out.println("Masa en kilogramos: " + masaKilogramos);
            System.out.println("Volumen en kilogramos cubicos: " + volumenKilometrosCubicos);
            System.out.println("Diametro en kilogramos: " + diametroKilometros);
            System.out.println("Es observable: " + esObservable);
        }

        public double desidadPlaneta(){
            double densidad = masaKilogramos / volumenKilometrosCubicos;
            return densidad;
        }

        public boolean planetaExterior(){

            float limite = (float)(149597870 * 3.4); 
            

            if (distanciaSol > limite) {
                return true;
            }else{
                return false;
            }
            
        }
    }

    public static void main(String[] args) {
        planeta planeta = new planeta();

        Planeta p1 = planeta.new Planeta("Tierra", 1, 5.972e24 , 1.08321e12, 12742, true, 150, TipoPlaneta.TERRESTRE);
        Planeta p2 = planeta.new Planeta("Júpiter", 95, 1.898e27, 1.4313e15 , 139820, true, 778, TipoPlaneta.GASEOSA);

        p1.atributosPlaneta();
        p2.atributosPlaneta();

        p1.desidadPlaneta();
        p2.desidadPlaneta();

        p1.planetaExterior();
        p2.planetaExterior();


    }
    
}
