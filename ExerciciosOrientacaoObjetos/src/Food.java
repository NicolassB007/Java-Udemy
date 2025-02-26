public class Food {
    String foodName;
    String secondFoodName;

    String foodWeightString;
    String secondFoodWeightString;
    double foodWeight;
    double secondFoodWeight;

    String wannaEat;
    int foodNumber;

    double eat(String wannaEat, double foodWeight, double secondFoodWeight, int foodNumber) {
        this.wannaEat = wannaEat;
        this.foodNumber = foodNumber;

        if (wannaEat.startsWith("s")) {
            return switch (foodNumber) {
                case 1 -> PersonTwo.weight + foodWeight;
                case 2 -> PersonTwo.weight + secondFoodWeight;
                default -> 0;
            };
        }
        else {
            return 0;
        }
    }
}
