public class Gtr extends Car{

    Gtr() {

    }

    Gtr(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    void accelerateCar() {
        double delta = 10.0;
        if (((actualSpeed + delta) > MAX_SPEED)) {
            actualSpeed = MAX_SPEED;
        }
        else {
            actualSpeed += delta;
        }
    }
}
