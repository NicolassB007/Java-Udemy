import java.util.Date;

public class EqualsEHashcode {
    public static void main(String[] args) {
        User firstUser = new User();
        firstUser.name = "Nicolas";
        firstUser.email = "nicolas.silva@ezemail.com";

        User secondUser = new User();
        secondUser.name = "Nicolas";
        secondUser.email = "nicolas.silva@ezemail.com";

        System.out.println(firstUser == secondUser);
        System.out.println(secondUser.equals(new Date()));
        System.out.println(firstUser.equals(secondUser));
        System.out.println(secondUser.equals(firstUser));
    }
}
