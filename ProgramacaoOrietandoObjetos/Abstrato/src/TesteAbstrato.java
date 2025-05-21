public class TesteAbstrato {
    public static void main(String[] args) {
        Animal a1 = new Cachorro();
        System.out.println(a1.mover());
        System.out.println(a1.respirar());
    }
}
