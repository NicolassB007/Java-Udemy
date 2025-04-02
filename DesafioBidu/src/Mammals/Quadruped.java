package Mammals;

public class Quadruped {
    private boolean mammal = false;
    private boolean isQuadruped = false;
    private boolean isCarnivorous = false;
    private boolean isHerbivorous = false;
    private boolean classificationOfMeal;

    public void setMammal(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.mammal = inputUser.startsWith("S");
        }
    }

    public void setQuadruped(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isQuadruped = inputUser.startsWith("S");
        }
    }

    public void setclassificationOfMeal(String inputUser) {
        if (inputUser.equalsIgnoreCase("Carnivoro") || inputUser.equalsIgnoreCase("Carnívoro")) {
            this.isCarnivorous = true;
        }
        else if (inputUser.equalsIgnoreCase("Herbivoro") || inputUser.equalsIgnoreCase("Herbívoro")) {
            this.isHerbivorous = true;
        }
    }

    public boolean getMammal() {
        return this.mammal;
    }

    public boolean getQuadruped() {
        return this.isQuadruped;
    }


    // Local to kind of meal of Animal
    public boolean getCarnivorous() {
        return this.isCarnivorous;
    }

    public boolean getHerbivorous() {
        return this.isHerbivorous;
    }

    // Interaction
    public void lionMessage() {
        System.out.println("Roar! Que caçada divertida! Sua inteligência é tão afiada quanto minhas garras. " +
                "Agradeço por se juntar a mim nesta aventura pela savana. " +
                "Espero que tenhamos muitos outros jogos emocionantes juntos, explorando o reino animal com toda a nossa força e coragem! " +
                "Que venham mais desafios e muita emoção! ");
    }

    public void horseMessage() {
        System.out.println("Relincho de alegria! Muito obrigado por jogar comigo! " +
                "Foi um galope de diversão ter você por perto. " +
                "Espero que tenhamos muitas outras aventuras juntos, explorando o mundo animal com toda a nossa energia! " +
                "Que venham mais charadas e muita emoção! ");
    }
}
