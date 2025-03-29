package Messages;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

public class MessagesForUser {
    private Map<Integer, String> messages = new HashMap<>();
    private int idMessages = 0;

    public void setMessages() {
        this.messages.put(idMessages++, "Computador: Aeeee! Consegui acertaar!! Que demais!");
        this.messages.put(idMessages++, "Computador: Que incrível! Acertei em cheio! Qual será o próxima dica?");
        this.messages.put(idMessages++, "Computador: Uau, você é um mestre dos animais!");
        this.messages.put(idMessages++, "Computador: Demais! Acertei! Estou adorando jogar com isso!");
        this.messages.put(idMessages++, "Computador: Que show! Você acertei! Mal posso esperar pela próxima dica!");
        this.messages.put(idMessages++, "Computador: Acho que sou um gênio dos animais hahah! Acertei! Que tal mais uma dica?");
        this.messages.put(idMessages++, "Computador: Sensacional! Acerteeii! Mal posso esperar para ver qual animal será!!");
        this.messages.put(idMessages++, "Computador: Que legal! Acertei mais uma ! Estou me divertindo muito! Vamos continuar!!");
        this.messages.put(idMessages++, "Computador: Incrível! Eu consegui acertar! Qual será o próximo desafio?");
        this.messages.put(idMessages++, "Computador: Que show! Você acertou! O próximo animal tem uma característica muito peculiar!");
    }

    public String message() {
        Random randomNumber = new Random();
        int chosenNumber = randomNumber.nextInt(idMessages - 1);
        String messageForUser = "";
        for (Map.Entry<Integer, String> messages: messages.entrySet()) {
            if (chosenNumber == messages.getKey()) {
                messageForUser = messages.getValue();
            }
        }
        return messageForUser;
    }
}
