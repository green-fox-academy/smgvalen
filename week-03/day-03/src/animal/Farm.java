package animal;

import java.util.ArrayList;
import java.util.List;

public class Farm {
    int slots = 12;
    List<Animal> AnimalList = new ArrayList<>();



    public Farm() {
    }

    public boolean breed() {
        if (AnimalList.size() < slots) {
            AnimalList.add(new Animal());
            return true;
        } else {
            return false;
        }
    }

    public int findHungriest(List<Animal> animals) {
        int theHungriest = animals.get(0).hunger;
        for (Animal animal : animals) {
            if (animal.hunger < theHungriest) {
                theHungriest = animal.hunger;
            }
        }
        return theHungriest;
    }

    public void slaughter() {
        for (int i = 0; i < AnimalList.size(); i++) {
            if (AnimalList.get(i).hunger == findHungriest(AnimalList)) {
                AnimalList.remove(i);
            }
        }
    }
}
