import java.util.Scanner;
import Messages.MessagesForUser;
import Mammals.Quadruped;
import Mammals.Biped;

public class MainSystem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        MessagesForUser messages = new MessagesForUser();
        messages.setMessages();

        Quadruped quadruped = new Quadruped();
        System.out.println("Adinhando qual é o Animal!");
        System.out.println("Ele é Mamífero?");
        System.out.print("S/N: ");
        quadruped.setMammal(readData.nextLine().toUpperCase());

        if (quadruped.getMammal()) {
            System.out.println("Jogador: Muito bom!! Ele é um Mamífero!");
            System.out.println(messages.message());
            System.out.println("Próxima pergunta: Ele é um quadrúpede?");
            System.out.print("S/N: ");

            quadruped.setQuadruped(readData.nextLine().toUpperCase());
            if (quadruped.getQuadruped()) {
                System.out.println("SENSACIONAL!! Ele é Quadrúpede");
                System.out.println(messages.message());

                System.out.println("PRESTE ATENÇÃO AGORA!");
                System.out.println("NESTA ÚLTIMA PERGUNTA, ESCREVA A RESPOSTA POR EXTENSO E SEM ACENTUAÇÃO");
                System.out.print("Ele é Carnívoro ou Herbívoro? ");
                quadruped.setclassificationOfMeal(readData.nextLine());
                if (quadruped.getCarnivorous()) {
                    System.out.println("VOCÊ CHEGOU NA RESPOSTAA!!!");
                    System.out.println(messages.message());
                    System.out.println("O ANIMAL É O " + AnimalsPossible.LEAO + " PARABÉNSSS PELO ACERTO!!!");
                    System.out.println("O Leão tem uma mensagem para você.");
                    quadruped.lionMessage();
                }
                else if (quadruped.getHerbivorous()) {
                    System.out.println("VOCÊ CHEGOU EM UMA RESPOSTAA!!!");
                    System.out.println(messages.message());
                    System.out.println("O ANIMAL É O " + AnimalsPossible.CAVALO + " PARABÉNSSS PELO ACERTO!!!");
                    System.out.println("Nosso Cavalo tem uma mensagem para você!!");
                    quadruped.horseMessage();
                }
                else {
                    System.out.println("Você informou uma resposta inválida");
                }
            }
        }
        if (!quadruped.getQuadruped()) {
            Biped biped = new Biped();
            System.out.println("OK, O animal não é quadrúpede.");
            System.out.println("Ele é Bípede?");
            System.out.print("S/N: ");
            biped.setBiped(readData.nextLine().toUpperCase());
            if (biped.getBiped()) {
                System.out.println("Interessante, ele é Bípede");
                System.out.println(messages.message());
                System.out.println("PRESTE ATENÇÃO AGORA!");
                System.out.println("NESTA ÚLTIMA PERGUNTA, ESCREVA A RESPOSTA POR EXTENSO E SEM ACENTUAÇÃO");
                System.out.print("Ele é Onívoro ou Frutífero? ");
                biped.setclassificationOfMeal(readData.nextLine());
                if (biped.getOmnivorous()) {
                    System.out.println("AGORA FICOU FÁCIL!");
                    System.out.println("O ANIMAL É O " + AnimalsPossible.HOMEM + " VOCÊ CONSEGUIU!!");
                    System.out.println("O Animal que obteve o intelecto com o passar do tempo que ter dizer uma coisa...");
                    biped.humanMessage();
                }
                else if (biped.getisFruitful()) {
                    System.out.println("ESTAVA DIFÍCIL, MAS AGORA FICOU FÁCIL!");
                    System.out.println("O ANIMAL É O " + AnimalsPossible.MACACO + " PARABÉNS!!");
                    System.out.println("Um dos animais mais fortes e ágeis tem uma mensagem para vossa pessoa!");
                    biped.monkeyMessage();
                }
                else {
                    System.out.println("O tipo de refeição informado é inválido!");
                }
            }
        }
    }
}
