package CasaB;

import CasaA.Ana;

public class Pedro extends Ana {
    void otherTestAcess() {
        // System.out.println(secret); // Private
        // System.out.println(intern); // Default (package)
        System.out.println(shapeForSpeak);
        System.out.println(everyoneKnow);
    }
}
