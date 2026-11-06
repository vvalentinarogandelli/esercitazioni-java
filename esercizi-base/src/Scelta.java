public class Scelta {
    public static void main(String[] args) {

        int scelta = 2;
        switch (scelta) {
            case 1:
                System.out.println("Avvio una partita");
                break;

            case 2:
                System.out.println("Carica partita salvata");
                break;

            case 3:
                System.out.println("Apri le impostazioni"); 
                break;
                
            case 0:
                System.out.println("uscita dal programma");    
        
            default:
                System.out.println("comando non riuscito");
                break;
        }

    }
}
