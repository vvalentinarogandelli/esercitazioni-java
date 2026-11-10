import java.util.ArrayList;

public class PotenziamentoArray {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> frutta  = new ArrayList<>();
        
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add ("mela");
        lista1.add("pera");
        lista1.add("banana");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("Fragola");
        lista2.add("Kiwi");
        lista2.add("Pesca");

        frutta.add(lista1);
        frutta.add(lista2);

    
        for (int i = 0; i < frutta.size(); i++) {
            for (int j = 0; j < frutta.get(i).size(); j++) {
                System.out.println(frutta.get(i).get(j));

            }
        }


        


    }

}


// Crea un ArrayList multidimensionale chiamato frutta.

// Crea due ArrayList interni.

// Nella prima lista inserisci: Mela, Pera, Banana.

// Nella seconda lista inserisci: Fragola, Kiwi, Pesca
// Inserisci entrambe le liste dentro frutta.


// Utilizza due cicli for per stampare tutti i frutti.