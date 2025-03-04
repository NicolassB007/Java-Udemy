import java.util.HashSet;
import java.util.Set;

public class Ex03 {
    public static void main(String[] args) {
        Set<String> stringSet = new HashSet<>();

        stringSet.add("Pietro");
        stringSet.add("Romando");
        stringSet.add("Japa");
        stringSet.add("Nicolas");
        stringSet.add("Marcos");
        stringSet.add("Mateus");

        System.out.println("CONJUNTO PADRÃO: " + stringSet);
        System.out.println("FOI POSSÍVEL FAZER A REMOÇÃO/DESLIGAMENTO DO INDIVIDUO? " + stringSet.remove("Mateus"));
        System.out.println("CONJUNTO SEM O INDIVIDIO: " + stringSet);

    }
}
