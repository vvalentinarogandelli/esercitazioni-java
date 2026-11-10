import java.util.ArrayList;

public class PotenziamentoArraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> squadre = new ArrayList<>();

        ArrayList<String> listauno = new ArrayList<>();
        listauno.add("milan");
        listauno.add("inter");

        ArrayList<String> listadue = new ArrayList<>();
        listadue.add("roma");
        listadue.add("napoli");

        squadre.add(listauno);
        squadre.add(listadue);

        for (int i = 0; i < squadre.size(); i++) {
            System.out.println();
            for (int j = 0; j < squadre.get(i).size(); j++) {
                System.out.println(squadre.get(i).get(j));

            }
        }

    }

}

// Esercizio – Squadre di calcio ⚽
// Scrivi un programma Java che:
// 1. Crei un ArrayList multidimensionale chiamato squadre.
// 2. Crei due liste interne.
// 3. Nella prima inserisca: Milan e Inter.
// 4. Nella seconda inserisca: Roma e Napoli.
// 5. Inserisca entrambe le liste in squadre.
// 6. Stampi tutti i nomi delle squadre usando due cicli for.