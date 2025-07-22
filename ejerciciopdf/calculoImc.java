package ejerciciopdf;


public class calculoImc {

    public static class Persona {
        
        private double peso; // kilogramos
        private double estatura; // metros
        private double imc;
        
        public  Persona (double peso, double estatura){
            this.estatura = estatura;
            this.imc = calcularImc();
            this.peso = peso;
        }

        public double getPeso() {
            return peso;
        }

        public void setPeso(int peso) {
            this.peso = peso;
        }

        public double getEstatura() {
            return estatura;
        }

        public void setEstatura(int estatura) {
            this.estatura = estatura;
        }

        public double getImc() {
            return imc;
        }

        public double calcularImc (){
            return peso / Math.pow(estatura, 2);
        }

        public static void main(String[] args) {

            Persona p1 = new Persona(92, 1.72);

            boolean delgadezSevera = p1.calcularImc() < 16;
            boolean delgadezModerada = p1.calcularImc() >= 16 && p1.calcularImc() < 17;
            boolean delgadezLeve = p1.calcularImc() >= 17 && p1.calcularImc() < 18.5;
            boolean pesoNormal = p1.calcularImc() >= 18.5 && p1.calcularImc() < 25;
            boolean sobrePeso = p1.calcularImc() >= 25 && p1.calcularImc() < 30;
            boolean obesidadLeve = p1.calcularImc() >= 30 && p1.calcularImc() < 35;
            boolean obesidadModerada = p1.calcularImc() >= 35 && p1.calcularImc() < 40;
            boolean obesidadMorbidada = p1.calcularImc() >= 40;

            System.out.println("La persona tiene un peso: " + p1.getPeso() + " y tiene una estatura de " + p1.getEstatura() + "  metros");

            if (delgadezSevera) {
                System.out.println("Uste sufre de desnutricio.");
            }
            else if (delgadezModerada) {
                System.out.println("Uste sufre de una desnutricion moderada.");
            }
            else if (delgadezLeve) {
                System.out.println("Uste sufre de una desnutricio muy leve.");
            }
            else if (pesoNormal) {
                System.out.println("Uste tiene un peso normal.");
            }
            else if (sobrePeso) {
                System.out.println("Uste tiene un ligero sobrepeso.");
            }
            else if (obesidadLeve) {
                System.out.println("Uste tiene una obesidad leve.");
            }
            else if (obesidadModerada) {
                System.out.println("Uste tiene una obesidad moderada.");
            }
            else if (obesidadMorbidada) {
                System.out.println("Uste tiene una obesidad morbida");
            }


        }


    }
    
}
