import java.util.Scanner;

public class AnimalsAndLegs {
    public static void main(String[] args) {
        // Write a program that asks for two integers
        // The first represents the number of chickens the farmer has
        // The second represents the number of pigs owned by the farmer
        // It should print how many legs all the animals have
        System.out.println("How many chickens the farmer has?");
        Scanner scanner = new Scanner(System.in);
        int chicken = scanner.nextInt();

        System.out.println("What about pigs? Does the farmer own some?");
        int pig = scanner.nextInt();

        int allChickenLegs = chicken * 2;
        int allPigLegs = pig * 4;
        int Legs = allChickenLegs + allPigLegs;

        System.out.println("All of the animal legs are: " + Legs );

    }
}
