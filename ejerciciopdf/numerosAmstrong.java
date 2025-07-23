package ejerciciopdf;

public class numerosAmstrong {
    public static void main(String[] args) {
        
        String numero = "371";
        int subIndice = numero.length();
        int indice = 0;
        double suma = 0;
        

        while (indice <= subIndice - 1) {
            String subString = numero.substring(indice, indice + 1);
            int digito = Integer.parseInt(subString);
            suma = suma + Math.pow(digito, subIndice);

            indice = indice + 1;
        }

        if (suma == Integer.parseInt(numero)) {
            System.out.println("Es un numero de Amstrong.");
        }else{
            System.out.println("no es un numero de Amstrong.");
        }

        
    }

    
}
