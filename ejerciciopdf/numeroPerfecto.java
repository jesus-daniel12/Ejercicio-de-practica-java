package ejerciciopdf;

public class numeroPerfecto {
    
    public static void main(String[] args) {
        
        int numero = 496;
        int suma = 0 ;
        int i = 1;

        do {
            if (numero % i == 0) {
                suma = suma + numero;
            }i++;
            
        } while (i <= numero / 2);

        if (suma == numero) {
            System.out.println("El numero es perfecto");
        }else{
            System.out.println("No es");
        }
    }
}
