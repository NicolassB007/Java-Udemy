import java.util.Scanner;

public class Sistem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        Person person = new Person();

        System.out.print("Informe o nome do usuário: ");
        String name = readData.nextLine();
        person.setName(name);
        // person.setName(readData.nextLine());

        System.out.println("Informe sua idade: ");
        int age = readData.nextInt();
        person.setAge(age);

        System.out.println("Seu nome é " + person.getName());
        System.out.println("Sua idade é " + person.getAge() + " anos de idade");
    }
}
