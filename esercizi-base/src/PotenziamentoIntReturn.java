public class PotenziamentoIntReturn {
    public static void main(String[] args) {
        int risultato = somma (29,9);
        System.out.println("il risultato della somma è " + risultato);

    }

    public static int somma (int a, int b){
        int risultato = a + b;
        return risultato;
        
    }

}



// Scrivi un programma Java che:
// 1. Si chiama MetodoReturn.
// 2. Nel main richiama un metodo chiamato somma.
// 3. Passa due numeri interi: 20 e 10.
// 4. Il metodo deve ricevere i due numeri.
// 5. Deve calcolare la somma.
// 6. Deve restituire il risultato usando return.
// 7. Nel main deve stampare il risultato.