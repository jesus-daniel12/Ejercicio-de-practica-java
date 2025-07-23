package ejerciciopdf;

public class numerosAmigos {
    public static void main(String[] args) {
        
        int numero1 = 220;
        int numero2 = 284   ;

        int suma = 0;

        for (int i = 1; i < numero1; i++) {
            if (numero1 % i == 0) {
            suma = suma + i;    
            }
        }

        if (suma == numero2) {
            System.out.println(numero1 + " y " + numero2 + " son amigos" );        
        }else{
            System.out.println(numero1 + " y " + numero2 + " no son amigos" );
        }
       
    }
    
}
