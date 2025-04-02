import java.util.Scanner;

import Mammals.MammalFlying;
import Messages.MessagesForUser;
import Mammals.Quadruped;
import Mammals.Biped;
import Birds.Flying;
import Reptile.Reptile;

public class MainSystem {
    public static void main(String[] args) {
        Scanner readData = new Scanner(System.in);
        MessagesForUser messages = new MessagesForUser();
        messages.setMessages();

        Quadruped quadruped = new Quadruped();
        Biped biped = new Biped();
        System.out.println("Adinhando qual é o Animal!");
        System.out.println("Ele é Mamífero?");
        System.out.print("S/N: ");
        quadruped.setMammal(readData.nextLine().toUpperCase());

        if (quadruped.getMammal()) {
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
                else if (!biped.getBiped()) {
                    MammalFlying mammalFlying = new MammalFlying();
                    System.out.println("Bom... Ele não é Quadrúpede e nem Bípede...");
                    System.out.println("Ele é Voador?");
                    System.out.print("S/N: ");
                    mammalFlying.setFlying(readData.nextLine().toUpperCase().trim());
                    if (mammalFlying.getFlying()) {
                        System.out.println("AGORA TUDO FOI CLAREADO!");
                        System.out.println(messages.message());

                        System.out.println("O ANIMAL É O " + AnimalsPossible.MORCEGO);
                        System.out.println("Nosso Querido parente do Batman tem uma mensagem!");
                        mammalFlying.batMessage();
                    }
                    else if (!mammalFlying.getFlying()) {
                        System.out.println("BEM... Ele não é Quadrúpede, Bípede e nem Voador...");
                        System.out.println("Ele é Aquático?");
                        System.out.print("S/N: ");
                        mammalFlying.setAquatic(readData.nextLine().toUpperCase().trim());
                        if (mammalFlying.getAquatic()) {
                            System.out.println("AGORA EU FUI CERTEIRO!");
                            System.out.println(messages.message());
                            System.out.println("O ANIMAL É A " + AnimalsPossible.BALEIA);
                            System.out.println("Nosso maior mamífero Aquático e mais Belo, quer te dizer algo!");
                            mammalFlying.whaleMessage();
                        }
                        else {
                            System.out.println("Parece que você ficou indeciso e acabou respondendo apenas não...");
                            System.out.println("Seu jogo termina aqui.");
                        }
                    }
                    else {
                        System.out.println("As informações fornecidas podem estar incorretas.");
                        System.out.println("Tente refazer o quiz...");
                    }
                }
            }
        }
        else {
            Flying flying = new Flying();
            System.out.println("O Animal é uma Ave?");
            System.out.print("S/N: ");
            flying.setIsFlying(readData.nextLine().toUpperCase());

            if ((flying.getFlying())) {
                System.out.println("Interessante, é uma Ave.");
                System.out.println("Ele é um Não-Voador? ");
                System.out.print("S/N: ");
                flying.setIsNonFlying(readData.nextLine().toUpperCase().trim());
                if (flying.getIsNonFlying()) {
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
                    } else if (flying.getPolar()) {
                        System.out.println("PARECE QUE ESTE FOI MAIS DIFÍCIL, MESMO ASSIM VOCÊ CHEGOU NA RESPOSTA");
                        System.out.println("O ANIMAL É O " + AnimalsPossible.PINGUIN);

                        System.out.println("Ela tem uma mensagem para você.");
                        flying.penguimMessage();
                    }
                }
                else if (!flying.getIsNonFlying()) {
                    System.out.println("Qual a espécie da Ave?");
                    System.out.println("Dependendo da resposta ele será um Pato ou uma Águia");
                    System.out.println("ESCREVA A RESPOSTA POR EXTENSO.");
                    System.out.print("Nadador ou Rapina? ");
                    flying.setClassificationSpecie(readData.nextLine().trim());
                    if (flying.getSwimmer()) {
                        System.out.println("VOCÊ CHEGOU NA RESPOSTA!");
                        System.out.println("O ANIMAL É O " + AnimalsPossible.PATO);

                        System.out.println("Ele tem uma mensagem para você.");
                        flying.duckMessage();
                    }
                    else if ((flying.getFox())) {
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
            else if (!flying.getFlying()) {
                System.out.println("Muito interessante! O Animal não é Mamífero e nem uma Ave...");
                Reptile reptile = new Reptile();
                System.out.println("O Animal é um Réptil?");
                System.out.print("S/N: ");
                reptile.setReptile(readData.nextLine().toUpperCase().trim());

                if ((reptile.getReptile())) {
                    System.out.println("O Animal é um Réptil!");
                    System.out.println(messages.message());
                    System.out.println("Estou sentindo que descobrir o Animal será fácil!");

                    System.out.println("PERGUNTA DECISIVA!");
                    System.out.println("Ele usa Cascos? ");
                    System.out.print("S/N: ");
                    reptile.setWearHooves(readData.nextLine().toUpperCase().trim());
                    if (reptile.getWearHooves()) {
                        System.out.println("MUITOO FÁCILL!");
                        System.out.println(messages.message());
                        System.out.println("O ANIMAL É A " + AnimalsPossible.TARTARUGA);

                        System.out.println("A Tartaruga muito querida que agradecer você!");
                        reptile.turtleMessage();
                    }
                    else if (!reptile.getWearHooves()) {
                        System.out.println("HMMM... Ele não usa Casco...");
                        System.out.println("Ele é Carnívoro?");
                        System.out.print("S/N: ");
                        reptile.setCarnivorous(readData.nextLine().toUpperCase().trim());
                        if (reptile.getCarnivorous()) {
                            System.out.println("Quase errei hahahah");
                            System.out.println("JÁ SEI QUAL É O ANIMAL!!");
                            System.out.println("O ANIMAL É O " + AnimalsPossible.CROCODILO);

                            System.out.println("Nosso Crocodilo quer lhe falar uma coisa!!");
                            reptile.crocodileMessage();
                        }
                        else if (!reptile.getCarnivorous()) {
                            System.out.println("UAU, ELE NÃO USA CASCO E NEM É CARNÍVORO...");
                            System.out.println("Complicado");
                            System.out.println("Meu último palpite!");
                            System.out.println("Ele possui Patas?");
                            System.out.print("S/N: ");
                            reptile.setHasPaws(readData.nextLine().toUpperCase().trim());
                            if (reptile.getPaws()) {
                                System.out.println("AGORA SIM TENHO MINHA CONCLUSÃO!");
                                System.out.println(messages.message());
                                System.out.println("O ANIMAL É A " + AnimalsPossible.COBRA);
                                reptile.snakeMessage();
                            }
                            else {
                                System.out.println("Não consegui descobrir o animal ;<");
                            }
                        }
                    }
                }
                else  {
                    System.out.println("Aparentemente você não quer participar do nosso jogo de adivinha...");
                    System.out.println("Espero que possamos jogar e nos divertir juntos na próxima!");
                    System.out.println("Até a próxima!");
                }
            }
        }
    }
}
