import Animals.Animal;
import Animals.AnimalRegistration;

import java.util.Scanner;

public class MainSystem {
    public static void main(String[] args) {
        System.out.println("=============");
        System.out.println("  PET SHOP!!");
        System.out.println("=============");
        System.out.println("SEJA BEM-VINDO!");
        System.out.println("[ 1 ] -> Cadastre seu animal");
        System.out.println("[ 2 ] -> Veja como está a fila");
        System.out.println("[ 3 ] -> Ver preços");
        System.out.println("[ 4 ] -> Sair");

        Scanner readData = new Scanner(System.in);
        System.out.print("Qual será sua escolha? ");
        int choiceUserFunctionInSystem = readData.nextInt();
        if (choiceUserFunctionInSystem == 1) {
            AnimalRegistration animalRegistration;
            System.out.println("=-=-=-=-=-=-=-=");
            System.out.println("   CADASTRO!!");
            System.out.println("=-=-=-=-=-=-=-=");

            System.out.println("Você quer registrar seu Pet?");
            readData.nextLine();
            System.out.print("S/N: ");
            String wannaRegisterYourPet = readData.nextLine().toUpperCase().trim();
            while ((wannaRegisterYourPet.startsWith("S")) || (wannaRegisterYourPet.equalsIgnoreCase("SIM"))) {
                animalRegistration = new AnimalRegistration();
                System.out.print("Informe o nome do Pet: ");
                animalRegistration.setAnimalName(readData.nextLine().toUpperCase().trim());
                System.out.print("Quantos anos tem o Pet: ");
                animalRegistration.setAnimalAge(readData.nextInt());
                readData.nextLine();
                System.out.print("Qual o nome do Dono: ");
                animalRegistration.setOwnerName(readData.nextLine().toUpperCase().trim());

                if (animalRegistration.getAnimalName() == null) {
                    System.out.println("Animal sem nome.");
                    System.out.println("Você quer manter o seu animal sem nome?");
                    String wannaChooseNameAnimal = readData.nextLine().toUpperCase().trim();
                    if ((wannaChooseNameAnimal.startsWith("N")) || (wannaChooseNameAnimal.equalsIgnoreCase("Nao"))) {
                        System.out.println("Informe o nome: ");
                    }
                    else {
                        animalRegistration.setAnimalName("Animal sem nome");
                    }
                }

                System.out.println("Nome do Pet: " + animalRegistration.getAnimalName());
                System.out.println("Idade do Pet: " + animalRegistration.getAnimalAge());
                if (animalRegistration.getOwnerName() == null) {
                    System.out.println("Sem Dono.");
                }
                else {
                    System.out.println("Dono: " + animalRegistration.getOwnerName());
                }

                animalRegistration.insertNameAnimal(animalRegistration.getIdAnimal(), animalRegistration.getAnimalName());

                System.out.println("Você quer inserir mais Pets?");
                System.out.print("S/N: ");
                wannaRegisterYourPet = readData.nextLine().toUpperCase().trim();
                animalRegistration.showAnimalsRegistered();
            }
        }
    }
}