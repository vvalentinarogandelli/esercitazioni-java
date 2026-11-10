import java.util.ArrayList;

public class EsercizioIntermedio {
    public static void main(String[] args) {
        ArrayList<String> nomi = new ArrayList<>();
        nomi.add("Luca");
        nomi.add("Marco");
        nomi.add("Anna");
        nomi.add("sara");

        for (int i = 0; i < nomi.size(); i++) {
            System.out.println(nomi.get(i));

        }

    }
}

// Obiettivo: creare una lista di nomi e stamparli tutti.

// Scrivi un programma Java che:
// 1. Importi ArrayList.
// 2. Crei un ArrayList di tipo String.
// 3. Inserisca questi 3 nomi: Anna, Marco, Luca.
// 4. Aggiunga il nome Sara.
// 5. Stampi tutti i nomi usando un ciclo for.