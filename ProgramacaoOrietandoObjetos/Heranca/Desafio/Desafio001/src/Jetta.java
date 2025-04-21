public class Jetta extends Car{

    Jetta() {

    }

    Jetta(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    void accelerateCar() {
        double delta = 7.0;
        if (((actualSpeed + delta) > MAX_SPEED)) {
            actualSpeed = MAX_SPEED;
        }
        else {
            actualSpeed += delta;
        }
    }
}
