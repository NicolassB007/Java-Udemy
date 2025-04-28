package Modulos;

public class Gtr extends Car {

    public Gtr() {

    }

    public Gtr(int maxSpeed) {
        super(maxSpeed);
    }

    @Override
    public void accelerateCar() {
        double delta = 10.0;
        if (((actualSpeed + delta) > MAX_SPEED)) {
            actualSpeed = MAX_SPEED;
        }
        else {
            actualSpeed += delta;
        }
    }
}
