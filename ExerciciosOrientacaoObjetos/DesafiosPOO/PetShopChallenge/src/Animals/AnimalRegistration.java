package Animals;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.Map;

public class AnimalRegistration {
    private String animalName;
    private String ownerName;

    private int animalAge;
    private int idAnimal = 0;

    private Map<Integer, String> nameAnimals = new HashMap<>();

    public int getIdAnimal() {
        return idAnimal + 1;
    }

    public String getAnimalName() {
        return animalName;
    }

    public void setAnimalName(@NotNull String animalName) {
        if (!animalName.isEmpty())
            this.animalName = animalName;
    }

    public String getOwnerName() {
        return this.ownerName;
    }

    public void setOwnerName(@NotNull String ownerName) {
        if (!ownerName.isEmpty())
            this.ownerName = ownerName;
    }

    public int getAnimalAge() {
        return animalAge;
    }

    public void setAnimalAge(int animalAge) {
        if (animalAge >= 0)
            this.animalAge = animalAge;
    }

    public void insertNameAnimal(int idAnimal, String animalName) {
        this.nameAnimals.put(idAnimal, animalName);
    }

    public void showAnimalsRegistered() {
        for (Map.Entry<Integer, String> names: nameAnimals.entrySet()) {
            System.out.printf("Id do Pet: %s\n", names.getKey());
            System.out.printf("Nome do Pet: %s\n", names.getValue());
        }
    }
}
