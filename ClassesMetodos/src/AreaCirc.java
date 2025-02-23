public class AreaCirc {
    double raio;
    final static double PI = 3.14;

    AreaCirc(double raioIncial) {
        raio = raioIncial;
    }

    double calcArea() {
        return Math.pow(raio, 2) * PI;
    }
}
