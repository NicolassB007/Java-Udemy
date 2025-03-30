package Birds;

public class Flying {
    private boolean isFlying = false;
    private boolean isNonFlying = false;
    private boolean isSwimmer = false;
    private boolean isFox = false;
    // private boolean classificationOfMeal;
    private boolean isTropical = false;
    private boolean isPolar = false;

    public void setIsFlying(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isFlying = inputUser.startsWith("S");
        }
    }

    public void setIsNonFlying(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isNonFlying = inputUser.startsWith("S");
        }
    }

    public void setHabitat(String inputUser) {
        if (inputUser.equalsIgnoreCase("Tropical")) {
            this.isTropical = true;
        }
        else if (inputUser.equalsIgnoreCase("Polar")) {
            this.isPolar = true;
        }
    }

    public void setClassificationSpecie(String inputUser) {
        if (inputUser.equalsIgnoreCase("Nadador")) {
            this.isSwimmer = true;
        }
        else if (inputUser.equalsIgnoreCase("Rapina")) {
            this.isFox = true;
        }
    }

    public boolean getFlying() {
        return this.isFlying;
    }

    public boolean getIsNonFlying() {
        return this.isNonFlying;
    }

    public boolean getTropical() {
        return this.isTropical;
    }

    public boolean getPolar() {
        return this.isPolar;
    }

    public boolean getSwimmer() {
        return this.isSwimmer;
    }

    public boolean getFox() {
        return this.isFox;
    }

    // Interaction

    public void ostrichMessage() {
        System.out.println("Oo-oo! Que aventura incrível! " +
                "Agradeço por correr comigo pela savana e por compartilhar sua inteligência comigo. " +
                "Foi uma experiência inesquecível! " +
                "Espero que possamos nos encontrar novamente para explorar mais a beleza da natureza juntos. " +
                "Até a próxima!");
    }

    public void penguimMessage() {
        System.out.println("Waddle waddle! " +
                "Que dia incrível! Agradeço por deslizar comigo no gelo da diversão. " +
                "Suas adivinhações me fizeram sentir como se estivesse nadando em um mar de conhecimento. " +
                "Espero que possamos nos encontrar novamente para explorar mais as maravilhas do mundo animal juntos. " +
                "Waddle waddle!");
    }

    public void duckMessage() {
        System.out.println("Quack! Que dia divertido! " +
                "Agradeço por nadar comigo neste lago de conhecimento. " +
                "Suas respostas me fizeram mergulhar fundo em meus pensamentos. " +
                "Espero que possamos nos encontrar novamente para explorar mais as maravilhas do mundo animal juntos. " +
                "Quack, quack!");
    }

    public void eagleMessage() {
        System.out.println("Planando alto e com gratidão no coração, agradeço por compartilhar comigo essa jornada de descobertas! " +
                "Seus palpites certeiros me fizeram voar mais alto e me sentir ainda mais conectado ao mundo animal. " +
                "Espero que nossos caminhos se cruzem novamente em futuras expedições!");
    }
}
