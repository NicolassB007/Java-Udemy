package Modulos;

public class Gtr extends Car implements Esportivo, Luxo{
    private boolean ligarTurbo;
    private boolean ligarAr;

    public Gtr() {
        this(600);
    }

    public Gtr(int maxSpeed) {
        super(maxSpeed);
        super.setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarArCondicionado() {
        System.out.println("Ar Condicionado Ligado");
        ligarAr = true;
    }

    @Override
    public void desligarArCondicionado() {
        System.out.println("Ar Condicionado Desligado");
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if ((ligarTurbo && !ligarAr)) {
            return 35;
        }
        else if ((ligarTurbo && ligarAr)) {
            return 30;
        }
        else if ((!ligarTurbo && !ligarAr)) {
            return 20;
        }
        else {
            return 15;
        }
    }

    @Override
    public void accelerateCar() {
        if (((actualSpeed + super.getDelta()) > MAX_SPEED)) {
            actualSpeed = MAX_SPEED;
        }
        else {
            actualSpeed += super.getDelta();
        }
    }
}
