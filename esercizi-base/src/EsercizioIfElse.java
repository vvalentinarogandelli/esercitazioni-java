public class EsercizioIfElse {
    public static void main(String[] args) {
        int voto = 22;

        if (voto >= 90) {
            System.out.println(voto + " il voto è ottimo!");

        } else if (voto >= 70 && voto < 90) {
            System.out.println(voto + " il voto è buono!");

        } else if (voto >= 60 && voto < 70) {
            System.out.println(voto + " il voto è sufficente!");

        } else {
            System.out.println(voto + " il voto è insufficente!");
        }

    }
}
