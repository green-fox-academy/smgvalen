package garden;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Flower> flowers = new ArrayList<>();

  public void addFlower(Flower flower) {
    flowers.add(flower);
  }
  public void water (int amount) {
    for ( Flower flower: flowers) {
      flower.water(amount);
    }
  }
  public void printStatus () {
    for ( Flower flower: flowers) {
      System.out.println(flower);
    }
  }
}
