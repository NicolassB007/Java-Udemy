public class Aula10 {
    public static void main(String[] args) {
        // if (bool);
        // while (bool);
        // Diferente das estruturas acima que recebe um valor que será true ou false
        // no switch nós colocamos diretamente um valor

        String faixa = "Laranja";
        switch (faixa.toLowerCase()) {
            case "preta":
                System.out.println("Sei o Bassai-dai...");
            case "marrom":
                System.out.println("Sabe o Tekki Shodan");
            case "roxa":
                System.out.println("Sei o Heigan Godan");
            case "verde":
                System.out.println("Sei o Heian Yodan");
            case "laranja":
                System.out.println("Sei o Heian Sandan");
            case "vermelha":
                System.out.println("Sei o Heian Nidan");
            case "amarela":
                System.out.println("Sei o Heian Shodan");
                break;
            default:
                System.out.println("Não sei de nada");
        }
    }
}
