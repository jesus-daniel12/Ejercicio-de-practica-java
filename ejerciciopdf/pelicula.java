package ejerciciopdf;


import ejerciciopdf.pelicula.Pelicula.Genero;

public class pelicula {
    
    public class Pelicula {
        
        private String nombre, director;
        private Genero[] generos;
        private int duracion;
        private int anio;//minutos
        private double calificaion;

        public enum Genero{
            ACCIÓN, 
            COMEDIA, 
            DRAMA, 
            SUSPENSO
        }

        public Pelicula(String nombre, String director, Genero[] generos, int duracion, int anio, double calificaion) {
            this.nombre = nombre;
            this.director = director;
            this.generos = generos;
            this.duracion = duracion;
            this.anio = anio;
            this.calificaion = calificaion;
        }

        public String getNombre() {
            return nombre;
        }

        private void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getDirector() {
            return director;
        }

        private void setDirector(String director) {
            this.director = director;
        }

        public Genero[] getGenero() {
            return generos;
        }

        private void setGenero(Genero[] genero) {
            this.generos = genero;
        }

        public int getDuracion() {
            return duracion;
        }

        private void setDuracion(int duracion) {
            this.duracion = duracion;
        }

        public int getAnio() {
            return anio;
        }

        private void setAnio(int anio) {
            this.anio = anio;
        }

        public double getCalificaion() {
            return calificaion;
        }

        private void setCalificaion(double calificaion) {
            this.calificaion = calificaion;
        }
        
        public void imprimir(){
            System.out.println("El nombre de la pelicula es : " + nombre);
            System.out.println("El nombre del director de la pelicula es : " + director);
            System.out.println("La duracion de la pelicula es : " + duracion);
            System.out.println("El anio en que se estreno la pelicula es : " + anio);
            System.out.print("Géneros: ");
            for (Genero genero : generos) {
                System.out.print(genero + " ");
            }       
        }

        private boolean esPeliculaEpica(){
            if (duracion >= 180) {
                return true;
            }
            return false;
            
            
        }

        private String calcularValoracion(){
            if (calificaion > 0 && calificaion < 2 ) {
                return "*";
            }else if (calificaion >= 2 && calificaion < 5) {
                return "**";
            }else if (calificaion >= 5 && calificaion < 7) {
                return "***";
            }else if (calificaion >= 7 && calificaion < 8) {
                return "****";
            }else if (calificaion >= 8 && calificaion < 10) {
                return "*****";
            }else{
                return "La pelicula no se puede valorar";
            }
        }

        private boolean esSimilar(Pelicula similar){
            if (similar.generos == generos && similar.calificaion == calificaion) {
                return true;
            }
            return false;
        }     

        private void imprimirCartel(Pelicula pelicula){
            System.out.println("-----" + pelicula.nombre + "-----");
            System.out.println("     " + pelicula.calcularValoracion() + "     ");
            System.out.println("     " + pelicula.anio + "     ");
            for (Genero genero : generos) {
                System.out.println("     " + genero);
            }
            System.out.println("     " + pelicula.director + "     ");
        }
    }

    public static void main(String[] args) {
        pelicula peliculas = new pelicula();

        Pelicula.Genero[] generos = {Pelicula.Genero.DRAMA, Pelicula.Genero.ACCIÓN, Pelicula.Genero.SUSPENSO, Pelicula.Genero.COMEDIA};

        Pelicula pelicula1 = peliculas.new Pelicula("El Padrino", "Francis Ford Coppola", new Pelicula.Genero[]{generos[2]}, 175, 1972, 9.2);
        Pelicula pelicula2 = peliculas.new Pelicula("El Señor de los Anillos: El Retorno del Rey", "Peter Jackson", new Pelicula.Genero[]{generos[1]}, 201, 2003, 8.9);

        pelicula1.imprimir();
        System.out.println();
        pelicula2.imprimir();
        System.out.println();
        System.out.println("La pelicula " + pelicula1.nombre + " es epica " + pelicula1.esPeliculaEpica());
        System.out.println("La pelicula " + pelicula2.nombre + " es epica " + pelicula2.esPeliculaEpica());
        System.out.println("La pelicuala " + pelicula1.nombre + " y la pelicula " + pelicula2.nombre + " son similares " + pelicula1.esSimilar(pelicula2));
        System.out.println();
        System.out.println( pelicula1.calcularValoracion());
        System.out.println(pelicula2.calcularValoracion());
        System.out.println();
        pelicula1.imprimirCartel(pelicula1);
    }
}
