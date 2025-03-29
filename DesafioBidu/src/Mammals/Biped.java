package Mammals;

public class Biped {
    private boolean isBiped = false;
    private boolean isOmnivorous = false;
    private boolean isFruitful = false;
    private boolean setclassificationOfMeal;

    public void setBiped(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isBiped = inputUser.startsWith("S");
        }
    }

    public void setclassificationOfMeal(String inputUser) {
        if (inputUser.equalsIgnoreCase("Onivoro")) {
            this.isOmnivorous = true;
        }
        else if (inputUser.equalsIgnoreCase("Frutifero")) {
            this.isFruitful = true;
        }
    }

    public boolean getBiped() {
        return this.isBiped;
    }

    public boolean getOmnivorous() {
        return this.isOmnivorous;
    }

    public boolean getisFruitful() {
        return this.isFruitful;
    }

    // Interaction
    public void humanMessage() {
        System.out.println("Que jornada incrível! Agradeço de coração por essa aventura no mundo animal. " +
                "Sua companhia tornou tudo ainda mais especial. " +
                "Espero que possamos nos encontrar novamente para explorar ainda mais a natureza e seus mistérios. " +
                "Até a próxima!");
    }

    public void monkeyMessage() {
        System.out.println("Uh uh ah ah! Que diversão! " +
                "Obrigado por brincar comigo na selva! " +
                "Adorei suas charadas e sua curiosidade. " +
                "Espero que possamos balançar em cipós e descobrir mais sobre os animais juntos em breve! Uh uh ah ah!");
    }
}
