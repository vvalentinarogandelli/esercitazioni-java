public class ArrayMultidimenzionali {
    public static void main(String[] args) {
        String [][] classi = {
                                {"luca", "Anna", "Marco"},
                                {"Edoardo", "Leonardo", "Antonio"},
                                {"Arianna", "Paolo", "Andrea"}

                            };
        for(String[] classe: classi) {
            System.out.println();
             for(String studente : classe){
                System.out.println(studente + " ");
            }

        }                   

        
    }

}
