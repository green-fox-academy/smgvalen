package gardeninterface;

public class Main {

  public static void main(String[] args) {

    Garden garden = new Garden();
    garden.addFlower(new Tulip(10));
    garden.addFlower(new Rose(30));

    garden.water(2);

    garden.printStatus();
  }


}
