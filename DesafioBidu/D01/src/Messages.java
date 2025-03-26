import java.util.Random;
import java.util.HashMap;
import java.util.Map;

public class Messages {
    private int counter = 0;
    final private Map<Integer, String> positiveMessages = new HashMap<>();
    // private int randomNumber = 0;

    public void setPositiveMessages() {
        this.positiveMessages.put(counter += 1, "Computador: Excelente! Estou quase lá.");
        this.positiveMessages.put(counter += 1, "Computador: Aqui vai mais uma resposta hahaha:");
        this.positiveMessages.put(counter += 1, "Computador: Acho que preciso de mais uma dica.");
        this.positiveMessages.put(counter += 1, "Computador: Cada dica me deixa mais curioso!");
        this.positiveMessages.put(counter += 1, "Computador: Dê mais dica!!");
        this.positiveMessages.put(counter += 1, "Computador: Estou gostando disso!!");
        this.positiveMessages.put(counter += 1, "Computador: É NESSA QUE EU ACERTO!!");
    }

    public String messageForUser() {
        Random generator = new Random();
        int randomNumber;
        randomNumber = Math.abs(generator.nextInt(this.counter - 1));

        for (Map.Entry<Integer, String> message: positiveMessages.entrySet()) {
            if (message.getKey() == randomNumber) {
                return message.getValue();
            }
        }
        return "As dicas estão muito boas! Estou quase lá.";
    }
}
