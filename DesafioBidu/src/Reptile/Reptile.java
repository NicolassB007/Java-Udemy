package Reptile;

public class Reptile {
    private boolean isReptile = false;
    private boolean wearHooves = false;
    private boolean isCarnivorous = false;
    private boolean hasPaws = false;

    public void setReptile(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isReptile = inputUser.startsWith("S");
        }
    }

    public void setWearHooves(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.wearHooves = inputUser.startsWith("S");
        }
    }

    public void setCarnivorous(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isCarnivorous = inputUser.startsWith("S");
        }
    }

    public void setHasPaws(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.hasPaws = inputUser.startsWith("N");
        }
    }

    public boolean getReptile() {
        return this.isReptile;
    }

    public boolean getWearHooves() {
        return this.wearHooves;
    }

    public boolean getCarnivorous() {
        return this.isCarnivorous;
    }

    public boolean getPaws() {
        return this.hasPaws;
    }

    // Interaction
    public void turtleMessage() {
        System.out.println("Lentamente, mas com o coração cheio de alegria, agradeço por compartilhar comigo essa jornada de descobertas! " +
                "Seus palpites me fizeram sentir como se estivesse nadando em um oceano de conhecimento. " +
                "Espero que possamos nos encontrar novamente para explorar mais as maravilhas do mundo animal juntos. " +
                "Até a próxima!");
    }

    public void crocodileMessage() {
        System.out.println("Snarl! Que aventura emocionante! " +
                "Agradeço por se aventurar comigo nas profundezas deste rio de conhecimento. " +
                "Suas adivinhações me fizeram sentir como se estivesse caçando as respostas. " +
                "Espero que possamos nos encontrar novamente para explorar mais as maravilhas do mundo animal juntos. " +
                "Snarl!");
    }

    public void snakeMessage() {
        System.out.println("Ssssss... " +
                "Que encontro intrigante! " +
                "Agradeço por deslizar comigo pelos caminhos do conhecimento. " +
                "Suas adivinhações me surpreenderam e me fizeram sentir como se estivesse explorando novos territórios. " +
                "Espero que possamos nos encontrar novamente para desvendar mais os segredos do mundo animal juntos. " +
                "Ssssss...");
    }
}
