public class GetterSetter {
    public static void main(String[] args) {
        Person person = new Person(31);

        person.setAge(-2); // Alterando
        person.setName("Nicolas");
        System.out.println(person.getName());
        System.out.println(person.getAge()); // Exibindo
    }
}
