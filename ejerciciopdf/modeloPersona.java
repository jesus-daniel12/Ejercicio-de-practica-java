package ejerciciopdf;

public class modeloPersona {

    public class Persona {

        String nombre, apellido;
        int numeroDocumento;
        int aniNacimineto;

        public Persona (String nombre, String apellido, int numeroDocumento, int aniNacimineto){
            this.nombre = nombre;
            this.apellido = apellido;
            this.numeroDocumento = numeroDocumento;
            this.aniNacimineto = aniNacimineto;
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

        public int getNumeroDocumento() {
            return numeroDocumento;
        }

        public void setNumeroDocumento(int numeroDocumento) {
            this.numeroDocumento = numeroDocumento;
        }

        public int getAniNacimineto() {
            return aniNacimineto;
        }

        public void setAniNacimineto(int aniNacimineto) {
            this.aniNacimineto = aniNacimineto;
        }
        
        public void valoresAtributos(){
            System.out.println("Nombre: " + getNombre() + ", Apellido: " + getApellido() + ", Numero de documento: " + getNumeroDocumento() + ", anio de nacimiento: " + getAniNacimineto() );
        }

    }

     public static void main(String[] args) {
            modeloPersona mp1 = new modeloPersona();
            Persona p1 = mp1.new Persona("Jesus", "Sanchez", 1, 1);

            p1.valoresAtributos();
        }
}
