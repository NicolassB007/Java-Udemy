package Modulos;

public class Jetta extends Car {

    public Jetta() {

    }

    public Jetta(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerateCar() {
        double delta = 7.0;
        if (((actualSpeed + delta) > MAX_SPEED)) {
            actualSpeed = MAX_SPEED;
        }
        else {
            actualSpeed += delta;
        }
    }
}
