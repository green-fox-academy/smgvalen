package animal;

import java.util.ArrayList;

public class AnimalMain {

  public static void main(String[] args) {
    Animal pig = new Animal();
    Animal cow = new Animal();
    pig.hunger = 30;
    cow.hunger = 20;

    animal.Animal dog = new animal.Animal();
    dog.drink();
    System.out.println(dog.thirst);
    dog.play();

    Farm myFarm = new Farm();
    myFarm.AnimalList.add(pig);
    myFarm.AnimalList.add(cow);
    System.out.println(myFarm.AnimalList.size());
    myFarm.breed();
    System.out.println(myFarm.AnimalList.size());
    myFarm.slaughter();
    System.out.println(myFarm.AnimalList.size());




  }
}
