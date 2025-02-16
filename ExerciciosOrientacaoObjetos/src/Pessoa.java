public class Pessoa {
    int age;
    String name;
    String profession;

    String getFormatation() {
        return String.format("Nome: %s\nIdade: %d\nProfissão: %s", name, age, profession);
    }
}