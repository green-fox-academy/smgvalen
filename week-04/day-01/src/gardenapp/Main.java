package gardenapp;

public class Main {
    public static void main(String[] args) {
        Garden garden = new Garden();

        garden.printStatus();

        System.out.println();

        garden.water(40);

        garden.printStatus();

        System.out.println();

        garden.water(70);

        garden.printStatus();

    }
}
