public class DinnerMain {
    public static void main(String[] args) {
        Person guest = new Person(80);
        Rice rice = new Rice(1.5);
        Beans beans = new Beans(0.500);

        System.out.println("Peso do convidado: " + guest.getWeight() + "Kg");

        System.out.println("Peso do convidado: " + guest.getWeight() + "Kg");
        guest.eat(beans);
        guest.eat(rice);

        System.out.println("Peso do convidado: " + guest.getWeight() + "Kg");

        IceCream dessert = new IceCream(0.50);
        guest.eat(dessert);

        System.out.println("Peso do convidado: " + guest.getWeight() + "Kg");
    }
}
