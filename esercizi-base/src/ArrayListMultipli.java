import java.util.ArrayList;

public class ArrayListMultipli {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> classi = new ArrayList<>();

        ArrayList<String> classe1 = new ArrayList<String>();
        classe1.add("michele");
        classe1.add("valentina");

        ArrayList<String> classe2 = new ArrayList<String>();
        classe2.add("francesca");
        classe2.add("anna");

        classi.add(classe1);
        classi.add(classe2);

        for (int i = 0; i < classi.size(); i++) {
            System.out.println();
            for (int j = 0; j < classi.get(i).size(); j++) {
                System.out.println(classi.get(i).get(j) + " ");
            }

        }

    }
}
