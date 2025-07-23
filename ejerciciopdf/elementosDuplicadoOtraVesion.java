package ejerciciopdf;

import java.util.ArrayList;

public class elementosDuplicadoOtraVesion {
    public static void main(String[] args) {
        int [] arrayNumeros = {1, 2, 3, 3, 4, 4, 5, 2};
        //array para guardar los duplicados
        ArrayList<Integer> duplicados = new ArrayList<>();

        //recorro la array para ver la cantidad de elementos y q numero corresponde a cual
        for (int i = 0; i < arrayNumeros.length; i++) {
            System.out.println("Numero de elemento " + i + " numero: " + arrayNumeros[i]);
        }

        // for anidado 
        // recorro por primera vez la array
        for (int i = 0; i < arrayNumeros.length - 1; i++) {
            // reccorro por segunda vez
            for (int j = i + 1; j < arrayNumeros.length; j++) {
                // if para ver si hay algun elemento duplicado en la comparativa del primero y el segundo
                if (arrayNumeros[i] == arrayNumeros[j] && (i != j)) {
                    duplicados.add(arrayNumeros[j]);
                    System.out.println(duplicados);

                   
                }
            }
        }
    }   
}
