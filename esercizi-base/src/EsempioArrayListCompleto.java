import java.util.ArrayList;

public class EsempioArrayListCompleto {
    public static void main(String[] args) {

        ArrayList<String> persone = new ArrayList<>();

        persone.add("Michele");
        persone.add("Valentina");
        persone.add("Vittoria");

        persone.set(2,"Dario"); // sto modificando il nome Vittoria
        // persone.remove(2);
        // persone.clear();// elimina tutte le persone


        for (int i = 0; i < persone.size(); i++) {
            System.out.println(persone.get(i));

        }

    }
}
