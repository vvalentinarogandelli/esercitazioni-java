public class MetodoReturn3 {
    public static void main(String[] args) {
        int sottrazione = calcoloeta(2026, 2000);
        System.out.println("l'età di Michele è " + sottrazione);

    }

    public static int calcoloeta(int a, int b){
       int sottrazione = a - b;
        return sottrazione;

        
    }

}

// Scrivi un programma Java chiamato MetodoReturn3 che:
// 1. Nel main richiami un metodo chiamato calcolaEta.
// 2. Passi al metodo l'anno di nascita: 2000.
// 3. Il metodo deve ricevere l'anno tramite un parametro di tipo int.
// 4. Deve calcolare l'età sottraendo l'anno di nascita dall'anno 2026.
// 5. Deve restituire il risultato utilizzando return.
// 6. Nel main deve stampare l'età.