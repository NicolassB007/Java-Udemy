import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Objects;

public class Aula06 {

    static public class User {
        String name;

        User(String name) {
            this.name = name;
        }

        @Override
        public boolean equals(Object o) {
            if (o == null || getClass() != o.getClass()) return false;
            User user = (User) o;
            return Objects.equals(name, user.name);
        }

        @Override
        public int hashCode() {
            return Objects.hashCode(name);
        }
    }

    public static void main(String[] args) {
        ArrayList<User> lista = new ArrayList<>();

        lista.add(new User("Nicolas"));
        lista.add(new User("Pietro"));
        lista.add(new User("Japa"));
        lista.add(new User("Marcos"));
        lista.add(new User("Romano"));

        // System.out.println(lista.get(2).name); // Acessando pelo índice
        System.out.println(lista.remove(3).name);
        System.out.println(lista.contains(new User("Nicolas")));
        System.out.println();

        for (User names: lista) {
            System.out.println(names.name);
        }
    }
}
