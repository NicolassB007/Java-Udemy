public class Food {
    private double weight;

    public Food(double weight) {
        setWeight(weight);
    }

    public void setWeight(double weight) {
        if (weight >= 0) {
            this.weight = weight;
        }
    }

    public double getWeight() {
        return this.weight;
    }

    public void eatFood(Person person) {
        double weightPerson = person.getWeight();
        weightPerson += this.weight;
    }
}
