public class User {
    String name;
    String email;

    public boolean equals(Object obj) {
        // Securança, esta forma é mais segura
        if (obj instanceof User) {
            User otherUser = (User) obj;

            boolean nameIsEqual = otherUser.name.equals(this.name);
            boolean emailIsEqual = otherUser.email.equals(this.email);

            return nameIsEqual && emailIsEqual;
        }
        else {
            return false;
        }


    }
}
