package animal;

public class AnimalMain {

  public static void main(String[] args) {

    Animal dog = new Animal();
    dog.drink();
    System.out.println(dog.thirst);
    dog.play();
  }

}
