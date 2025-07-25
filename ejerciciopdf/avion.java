package ejerciciopdf;

public class avion {
    public class Avion {
        private String fabricante;
        private int numeroMotores;
        
        private Avion (String fabricante, int numeroMotores){
            this.fabricante = fabricante;
            this.numeroMotores = numeroMotores;
        }

        public String getFabricante() {
            return fabricante;
        }

        private void setFabricante(String fabricante) {
            this.fabricante = fabricante;
        }

        public int getNumeroMotores() {
            return numeroMotores;
        }

        private void setNumeroMotores(int numeroMotores) {
            this.numeroMotores = numeroMotores;
        }

        public void imprimirFabricante(){
            System.out.println("Fabricante es: " + fabricante);
        }

        public void cambiarFabricante(Avion a){
            a.setFabricante("Lookhead");
        }
    }    

    public static void main(String[] args) {
        avion aviones = new avion();

        Avion a1 = aviones.new Avion("Airbus", 4);
        Avion a2 = aviones.new Avion("Lookheed", 4);

        a1.imprimirFabricante();
        a2.imprimirFabricante();
        System.out.println();
        a2.cambiarFabricante(a2);
        a2.imprimirFabricante();
    }
}
