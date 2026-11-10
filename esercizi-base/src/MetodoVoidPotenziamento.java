public class MetodoVoidPotenziamento {
    public static void main(String[] args) {
        
        moltiplicazione(6,4);
    }

    public static void moltiplicazione (int a, int b){
        int risultato = a*b;
        System.out.println("il risultato della moltiplicazione è: "+ risultato);
    }

}


// Il programma deve:
// 1. Richiamare nel main il metodo moltiplicazione.
// 2. Passare al metodo due numeri interi: 6 e 4.
// 3. Il metodo deve ricevere i due numeri tramite parametri di tipo int.
// 4. Calcolare il prodotto dei due numeri.
// 5. Stampare a video il risultato utilizzando System.out.println().