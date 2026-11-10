import java.util.ArrayList;

public class ArrayListPotenziamento {
    public static void main(String[] args) {
        ArrayList<Integer> numeri = new ArrayList<>();

        numeri.add(5);
        numeri.add(10);
        numeri.add(15);
        numeri.add(20);

        for (int i = 0; i < numeri.size(); i++) {
            System.out.println(numeri.get(i));

        }

        numeri.remove(1);

        for (int i = 0; i < numeri.size(); i++) {
            System.out.println(numeri.get(i));

        }
    }
}

// Scrivi un programma Java che:
// 1. Crei un ArrayList di tipo Integer.
// 2. Inserisca i numeri 5, 10, 15, 20.
// 3. Stampi quanti elementi contiene la lista.
// 4. Rimuova il numero 10.
// 5. Stampi nuovamente tutti gli elementi.