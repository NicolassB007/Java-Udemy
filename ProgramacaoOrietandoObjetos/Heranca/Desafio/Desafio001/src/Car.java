public class Car {
    double actualSpeed = 0;
    // final int MAX_SPEED = 0;
    int delta = 5;
    int MAX_SPEED;

    Car() {

    }

    Car(int max_speed) {
        this.MAX_SPEED = max_speed;
    }

    void accelerateCar() {
        if (((this.actualSpeed + delta) > MAX_SPEED)) {
            this.actualSpeed = MAX_SPEED;
        }
        else {
            this.actualSpeed += 5.0;
        }
    }

    void brakeCar() {
        if (this.actualSpeed > 0) {
            this.actualSpeed -= 3.0;
        }
        else {
            this.actualSpeed = 0;
        }
    }
}
