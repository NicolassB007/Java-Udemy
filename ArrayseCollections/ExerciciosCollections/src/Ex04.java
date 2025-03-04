import java.util.ArrayList;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Ex04 {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);

        System.out.println("5 CIDADES");
        ArrayList<String> citiesList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            System.out.print("Informe o nome da cidade: ");
            citiesList.add(readData.nextLine());
        }

        Set<String> citiesSet = new TreeSet<>(citiesList); // Também funciona
        // citiesSet.addAll(); // Funciona
        System.out.println("CIDADES ARRAY LIST >>>>> " + citiesList);
        System.out.println("CIDADES SET >>>>>" + citiesSet);
    }
}
