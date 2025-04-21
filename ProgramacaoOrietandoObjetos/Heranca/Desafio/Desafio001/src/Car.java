public class Car {
    double actualSpeed = 0;

    void accelerateCar() {
        if (this.actualSpeed >= 0) {
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
