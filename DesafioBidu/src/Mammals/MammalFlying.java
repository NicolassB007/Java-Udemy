package Mammals;

public class MammalFlying {
    private boolean isFlying = false;
    private boolean isAquatic = false;

    public void setFlying(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isFlying = inputUser.startsWith("S");
        }
    }

    public void setAquatic(String inputUser) {
        if (!inputUser.isEmpty()) {
            this.isAquatic = inputUser.startsWith("S");
        }
    }

    public boolean getFlying() {
        return this.isFlying;
    }

    public boolean getAquatic() {
        return this.isAquatic;
    }

    // Interaction
    public void batMessage() {
        System.out.println("Screech! " +
                "Que noite incrível! " +
                "Agradeço por voar comigo pelos céus do conhecimento. " +
                "Suas adivinhações me fizeram sentir como se estivesse explorando cavernas secretas. " +
                "Espero que possamos nos encontrar novamente para descobrir mais os mistérios do mundo animal juntos. " +
                "Screech!");
    }

    public void whaleMessage() {
        System.out.println("Uhhhhuuuu! " +
                "Que mergulho profundo no conhecimento! " +
                "Agradeço por nadar comigo pelas ondas da sabedoria. " +
                "Suas adivinhações me fizeram sentir como se estivesse explorando as profundezas do oceano. " +
                "Espero que possamos nos encontrar novamente para descobrir mais os mistérios do mundo animal juntos. " +
                "Uhhhhuuuu!");
    }
}
