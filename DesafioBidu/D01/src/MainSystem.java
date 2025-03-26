import java.util.Scanner;

public class MainSystem {

    public static class DefaultMessageError {
        public void messageError() {
            System.out.println("Refeição Inválida");
        }
    }

    public static void main(String[] args) {
        DefaultMessageError defaultMessageError = new DefaultMessageError();
        Messages messages = new Messages();
        messages.setPositiveMessages();

        Scanner readData = new Scanner(System.in);
        Animal animal = new Animal();

        System.out.println("Computador: É um mamífero?");
        System.out.print("s/n: ");
        animal.setIsMammal(readData.nextLine());

        if (animal.getIsMammal()) {
            System.out.println("\nUsuário: SIM! É um mamífero!");
            System.out.println(messages.messageForUser());

            System.out.println("Ele é quadrúpede?");
            System.out.print("s/n: ");
            animal.setQuadruped(readData.nextLine());

            if (animal.getIsQuadruped()) {
                System.out.println("\nUsuário: SIM! Ele é quadrúpede!");
                System.out.println(messages.messageForUser());

                System.out.println("Próxima pergunta é decisiva!");
                System.out.println("Escreva por extenso a próxima resposta.");
                System.out.println(messages.messageForUser());

                System.out.println("Ele é Carnivoro ou Herbivoro?");
                System.out.print("Resposta: ");
                animal.setIsCarivorousOrHerbivorous(readData.nextLine());

                if (animal.getIsCarnivorous()) {
                    Lion lion = new Lion();
                    System.out.println("Usuário: BOAA!! Você já tem a resposta!");
                    System.out.println("Usuário: O ANIMAL É " + PossibleAnimals.LEAO);
                    lion.roar();
                }
                else if (animal.getisHerbivorous()){
                    Horse horse = new Horse();
                    System.out.println("Usuário: BOAA!! Você já tem a resposta!");
                    System.out.println("Usuário: O ANIMAL É " + PossibleAnimals.CAVALO);
                    System.out.println("O Cavalo será recompensado com uma grama.");
                    horse.horseSound();
                    horse.horseEating();
                }
                else {
                    defaultMessageError.messageError();
                }
            }

            System.out.println("Computador: Ele é Bípede?");
            System.out.print("s/n: ");
            animal.setisBiped(readData.nextLine());

            if (animal.getIsBiped()) {
                if (!(animal.getIsQuadruped())) {
                    System.out.println("Usuário: SIM!! O Animal é Bípede.");
                    System.out.println(messages.messageForUser());

                    System.out.println("Próxima pergunta. Escreva a Resposta por extenso");
                    System.out.println("Ele é Onívoro ou Frutífero?");
                    System.out.print("Resposta: ");
                    animal.setisOmnivorousOrFruitful(readData.nextLine());
                    if (animal.getisOmnivorous()) {
                        Human human = new Human();
                        System.out.println("MUITO BOMM!!! O " + PossibleAnimals.HUMANO + " quer agradecer você.");
                        human.greeting();
                    }
                    else if (animal.getisFruitful()) {
                        Monkey monkey = new Monkey();
                        System.out.println("BRAVOOO!! Você chegou na conclusão de ser um " + PossibleAnimals.MACACO);
                        System.out.println("Macaco quer cumprimentar você e dar um alimento para você!");
                        monkey.showHapiness();
                    }
                    else {
                        defaultMessageError.messageError();
                    }
                }
                else {
                    System.out.println("Ele não pode ser Bipéde");
                }
            }

            System.out.println("Ele é voador?");
            System.out.print("s/n: ");
            animal.setIsFlying(readData.nextLine());
            if (animal.getIsFlying()) {
                if (!(animal.getIsQuadruped()) && (!(animal.getIsBiped()))) {
                    System.out.println("SIMM! Ele é voador!!");
                    System.out.println(messages.messageForUser());

                    Bat bat = new Bat();
                    System.out.println("Computador: Nossa! Essa foi fácil");
                    System.out.println("O ANIMAL É O " + PossibleAnimals.MORCEGO);
                    System.out.println("O Morcego te escutou! Ele quer falar com você");
                    bat.batGreeting();
                }
                else {
                    System.out.println("Ele não pode ser Voador");
                }
            }

            System.out.println("Ele é aquático?");
            System.out.print("s/n: ");
            animal.setIsAquatic(readData.nextLine());
            if (animal.getIsAquatic()) {
                // Checando se ele é diferente de Quadrúpede, Bípede e Voador
                if (!(animal.getIsQuadruped()) && (!(animal.getIsBiped())) && (!(animal.getIsFlying()))) {
                    System.out.println("SIM! Ele é Aquático!");
                    System.out.println(messages.messageForUser());

                    System.out.println("UAU! Essa foi a mais fácil!");
                    Whale whale = new Whale();
                    System.out.println("Sem dúvidas o animal é " + PossibleAnimals.BALEIA);
                    System.out.println("A baleia tem um recado para você.");
                    whale.whaleSound();
                }
                else {
                    System.out.println("Ele não pode ser aquático.");
                }
            }
        }
    }
}
