public class Switch {
    public static void main(String[] args) {

        int giorno = 2;
        
        switch (giorno) {
            case 1:
                System.out.println("lunedi");
                break;

            case 2:
                System.out.println("martedi");
                break;

            case 3:
                System.out.println("mercoledi");    
                    break;
        
            default:
                System.out.println("giorno non valido!");
            break;    
                
        }
    }

}
