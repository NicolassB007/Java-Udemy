public class Animal {
    private boolean isMammal;

    private boolean isQuadruped;
    private boolean isBiped;
    private boolean isFlying;
    private boolean isAquatic;

    private boolean isCarnivorous;
    private boolean isHerbivorous;
    private boolean isOmnivorous;
    private boolean isFruitful;

    public void setIsMammal(String hint) {
        if ((!hint.isEmpty()) && (hint.toUpperCase().startsWith("S"))) {
            this.isMammal = true;
        }
    }

    public void setisBiped(String hint) {
        if ((!hint.isEmpty()) && (hint.toUpperCase().startsWith("S"))) {
            this.isBiped = true;
        }
    }

    public void setQuadruped(String hint) {
        if ((!hint.isEmpty()) && (hint.toUpperCase().startsWith("S"))) {
            this.isQuadruped = true;
        }
    }

    public void setIsCarivorousOrHerbivorous(String hint) {
        if ((hint.equalsIgnoreCase("Carnivoro"))) {
            this.isCarnivorous = true;
        }
        else if ((hint.equalsIgnoreCase("Herbivoro"))) {
            this.isHerbivorous = true;
        }
        else {
            this.isCarnivorous = false;
            this.isHerbivorous = false;
        }
    }

    public void setisOmnivorousOrFruitful(String hint) {
        if ((hint.equalsIgnoreCase("Onivoro"))) {
            this.isOmnivorous = true;
        }
        else if ((hint.equalsIgnoreCase("Frutifero"))) {
            this.isFruitful = true;
        }
        else {
            this.isOmnivorous = false;
            this.isFruitful = false;
        }
    }

    public void setIsFlying(String hint) {
        if ((!hint.isEmpty()) && (hint.toUpperCase().startsWith("S"))) {
            this.isFlying = true;
        }
    }

    public void setIsAquatic(String hint) {
        if ((!hint.isEmpty()) && (hint.toUpperCase().startsWith("S"))) {
            this.isAquatic = true;
        }
    }

    public boolean getIsMammal() {
        return this.isMammal;
    }

    public boolean getIsBiped() {
        return this.isBiped;
    }

    public boolean getIsFlying() {
        return this.isFlying;
    }

    public boolean getIsAquatic() {
        return this.isAquatic;
    }

    public boolean getIsQuadruped() {
        return this.isQuadruped;
    }

    public boolean getIsCarnivorous() {
        return this.isCarnivorous;
    }
    public boolean getisHerbivorous() {
        return this.isHerbivorous;
    }

    public boolean getisOmnivorous() {
        return this.isOmnivorous;
    }
    public boolean getisFruitful() {
        return this.isFruitful;
    }
}
