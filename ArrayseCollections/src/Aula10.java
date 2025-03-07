import java.util.HashSet;

public class Aula10 {
    public static void main(String[] args) {
        HashSet<Aula06.User> usuarios = new HashSet<Aula06.User>();

        Aula06.User user1 = new Aula06.User();
        usuarios.add(new Aula06.User("Nicolas"));
        usuarios.add(new Aula06.User("Marcos"));
        usuarios.add(new Aula06.User("Japa"));
        usuarios.add(new Aula06.User("Pietro"));

        System.out.println(usuarios.contains(new Aula06.User("Japa")));
    }
}
