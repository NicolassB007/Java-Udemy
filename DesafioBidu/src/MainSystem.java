import java.util.Scanner;
import Messages.MessagesForUser;
import Mammals.Quadruped;
import Mammals.Biped;
import Birds.Flying;

public class MainSystem {
    public static void main(String[] args) {
        boolean restrict = false;
        Scanner readData = new Scanner(System.in);
        MessagesForUser messages = new MessagesForUser();
        messages.setMessages();

        Quadruped quadruped = new Quadruped();
        System.out.println("Adinhando qual é o Animal!");
        System.out.println("Ele é Mamífero?");
        System.out.print("S/N: ");
        quadruped.setMammal(readData.nextLine().toUpperCase());

        if (quadruped.getMammal()) {
            restrict = true;
            System.out.println("Jogador: Muito bom!! Ele é um Mamífero!");
            System.out.println(messages.message());
            System.out.println("Próxima pergunta: Ele é um quadrúpede?");
            System.out.print("S/N: ");

            quadruped.setQuadruped(readData.nextLine().toUpperCase().trim());
            if (quadruped.getQuadruped()) {
                System.out.println("SENSACIONAL!! Ele é Quadrúpede");
                System.out.println(messages.message());

                System.out.println("PRESTE ATENÇÃO AGORA!");
                System.out.println("NESTA ÚLTIMA PERGUNTA, ESCREVA A RESPOSTA POR EXTENSO E SEM ACENTUAÇÃO");
                System.out.println("Dependendo da sua resposta ele será ou um Leão ou um Cavalo");
                System.out.print("Ele é Carnívoro ou Herbívoro? ");
                quadruped.setclassificationOfMeal(readData.nextLine().trim());
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
            else if (!quadruped.getQuadruped()) {
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
                    System.out.println("Dependendo da sua resposta ele será um Ser Humano ou um Macaco");
                    System.out.print("Ele é Onívoro ou Frutífero? ");
                    biped.setclassificationOfMeal(readData.nextLine().trim());
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

        Flying flying = new Flying();
        System.out.println("O Animal é uma Ave?");
        System.out.print("S/N: ");
        flying.setIsFlying(readData.nextLine().toUpperCase());

        if ((flying.getFlying()) && (!restrict)) {
            System.out.println("Interessante, é uma Ave.");
            System.out.println("Ele é um Não-Voador? ");
            System.out.print("S/N: ");
            flying.setIsNonFlying(readData.nextLine().toUpperCase().trim());
            restrict = false;

            if (flying.getIsNonFlying()) {
                restrict = true;
                System.out.println(messages.message());
                System.out.println("A Ave é uma Não-Voadora");

                System.out.println("PERGUNTA DECISIVA, RESPONTA POR EXTENSO");
                System.out.println("Dependendo da resposta ele será um Avestruz ou um Pinguim.");
                System.out.print("O Animal é Tropical ou Polar? ");
                flying.setHabitat(readData.nextLine().trim());

                if (flying.getTropical()) {
                    System.out.println("VOCÊ CHEGOU NA RESPOSTA!!");
                    System.out.println("O ANIMLA É O " + AnimalsPossible.AVESTRUZ);

                    System.out.println("Ele tem uma mensagem para você.");
                    flying.ostrichMessage();
                }
                else if (flying.getPolar()) {
                    System.out.println("PARECE QUE ESTE FOI MAIS DIFÍCIL, MESMO ASSIM VOCÊ CHEGOU NA RESPOSTA");
                    System.out.println("O ANIMAL É O " + AnimalsPossible.PINGUIN);

                    System.out.println("Ela tem uma mensagem para você.");
                    flying.penguimMessage();
                }
            }
            System.out.println("Qual a espécie da Ave?");
            System.out.println("Dependendo da resposta ele será um Pato ou uma Águia");
            System.out.println("ESCREVA A RESPOSTA POR EXTENSO.");
            System.out.print("Nadador ou Rapina? ");
            flying.setClassificationSpecie(readData.nextLine().trim());
            if (flying.getSwimmer() && (!restrict)) {
                System.out.println("VOCÊ CHEGOU NA RESPOSTA!");
                System.out.println("O ANIMAL É O " + AnimalsPossible.PATO);

                System.out.println("Ele tem uma mensagem para você.");
                flying.duckMessage();
            }
            else if ((flying.getFox()) && (!restrict)) {
                System.out.println("QUASE QUE VOCÊ ERRA HAAHA");
                System.out.println("O ANIMAL É A " + AnimalsPossible.AGUIA);

                System.out.println("Uma das Aves mais rápidas tem uma mensagem.");
                flying.eagleMessage();
            }
            else {
                System.out.println("O ANIMAL NÃO PODE SER DUAS COISAS AO MESMO TEMPO");
            }
        }
    }
}
