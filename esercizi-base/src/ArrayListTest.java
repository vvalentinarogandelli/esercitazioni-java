import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> studenti = new ArrayList<>();
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("anna");
        lista1.add("marco");

        ArrayList<String> lista2 = new ArrayList<>();
        lista2.add("luca");
        lista2.add("sara");

        studenti.add(lista1);
        studenti.add(lista2);

        for(int i = 0; i<studenti.size();i++){
            System.out.println();
            for(int y = 0; y < studenti.get(i).size();y++){
                System.out.println(studenti.get(i).get(y) );
            }
        }


    }

}


// Esercizio – ArrayList multidimensionale
// Scrivi un programma Java che gestisca i nomi di alcuni studenti.
// 1. Crea un ArrayList multidimensionale chiamato studenti.
// 2. Crea due liste interne.
// 3. Nella prima inserisci: Anna e Marco.
// 4. Nella seconda inserisci: Luca e Sara.
// 5. Inserisci entrambe le liste in studenti.
// 6. Stampa tutti i nomi utilizzando due cicli for.