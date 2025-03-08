import java.util.HashMap;
import java.util.Map;

public class Aula09 {
    public static void main(String[] args) {
        Map<String, Integer> usuario = new HashMap<>();

        usuario.put("Nicolas", 17);
        usuario.put("Pietro", 16);
        usuario.put("Japa", 16);
        System.out.println(usuario.size());
        // System.out.println(usuario.isEmpty());

        System.out.println(usuario.keySet());
        System.out.println(usuario.values());
        System.out.println(usuario.entrySet());

        System.out.println(usuario.containsKey("Romano"));

        System.out.println(usuario.get("Nicolas"));

        for (String users: usuario.keySet()) {
            System.out.println(users);
        }
        for (int age: usuario.values()) {
            System.out.println(age);
        }

        for (Map.Entry<String, Integer> registro: usuario.entrySet()) {
            System.out.printf("NOME: %s -> IDADE: %d\n", registro.getKey(), registro.getValue());
        }
    }
}
