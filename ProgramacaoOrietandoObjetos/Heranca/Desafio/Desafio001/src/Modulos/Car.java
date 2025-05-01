package Modulos;

public class Car {
    public double actualSpeed = 0;
    private int delta;
    public final int MAX_SPEED;

    protected Car(int max_speed) {
        this.MAX_SPEED = max_speed;
    }

    public void accelerateCar() {
        if (((this.actualSpeed + getDelta()) > MAX_SPEED)) {
            this.actualSpeed = MAX_SPEED;
        }
        else {
            this.actualSpeed += getDelta();
        }
    }

    public void brakeCar() {
        if (this.actualSpeed > 0) {
            this.actualSpeed -= 3.0;
        }
        else {
            this.actualSpeed = 0;
        }
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    public int getDelta() {
        return this.delta;
    }
}
