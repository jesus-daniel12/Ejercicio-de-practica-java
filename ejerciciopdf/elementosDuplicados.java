package ejerciciopdf;

import java.util.ArrayList;


public class elementosDuplicados {
    public static void main(String[] args) {
        
        int [] numerosArray = {1, 3, 3, 4, 5, 6, 7, 8, 9, 10};

        // una arrayList q sirve para guardar a los duplicados 
        ArrayList<Integer> duplicados = new ArrayList<>();
        // una arrarList q sirve para guardar los numeros recorrido
        ArrayList<Integer> recorrido = new ArrayList<>();

        // for para recorre el numerosArray uno por uno
        for (Integer numero : numerosArray) {
            // si numero no existe en recorrido lo guarda en recorrido.
            if (recorrido.contains(numero)) {
                // si numero existe en recorrido pero no existe en duplicado lo guarde en duplicado
                if (!duplicados.contains(numero)) {
                    duplicados.add(numero);
                }
            }else{
                recorrido.add(numero);
            }
        }

        recorrido.clear();
        System.out.println(duplicados);

       
        
    }    
}
