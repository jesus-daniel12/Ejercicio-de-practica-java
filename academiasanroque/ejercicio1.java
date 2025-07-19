package academiasanroque;

public class ejercicio1 {

    public class persona {

        private String nombre;
        private int edad;
        private int dni;

        public persona(String nombre, int edad, int dni){
            this.nombre = nombre;
            this.edad = edad;
            this.dni = dni;
        }

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public int getEdad() {
            return edad;
        }

        public void setEdad(int edad) {
            this.edad = edad;
        }

        public int getDni() {
            return dni;
        }

        public void setDni(int dni) {
            this.dni = dni;
        }

        public void mostrarInformacion(persona p) {
        System.out.println("Nombre: " + p.getNombre() + ", Edad: " + p.getEdad() + ", DNI: " + p.getDni());
        }

    }

    public static void main(String[] args) {
        ejercicio1 e1 = new ejercicio1();
        persona p1 = e1.new persona("Martin", 18, 95874474);

        p1.mostrarInformacion(p1);

    }

      
    


  
    
}
