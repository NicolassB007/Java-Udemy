public class Jogo {
    public static void main(String[] args) {
        Monstro monstro = new Monstro();
        monstro.x = 10;
        monstro.y = 10;

        Heroi heroi = new Heroi();
        heroi.x = 10;
        heroi.y = 11;

        System.out.println("Monstro -> Vida: " + monstro.vida);
        System.out.println("Heroi -> Vida: " + heroi.vida);

        monstro.atacar(heroi);
        heroi.atacar(monstro);

        System.out.println();
        System.out.println("Monstro -> Vida: " + monstro.vida);
        System.out.println("Heroi -> Vida: " + heroi.vida);
    }
}
