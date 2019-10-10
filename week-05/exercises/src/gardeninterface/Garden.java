package gardeninterface;

import java.util.ArrayList;
import java.util.List;

public class Garden {

  private List<Waterable> flowers = new ArrayList<>();

  public void addFlower(Waterable flower) {
    flowers.add(flower);
  }
  public void water (int amount) {
    for ( Waterable flower: flowers) {
      flower.water(amount);
    }
  }
  public void printStatus () {
    for ( Waterable flower: flowers) {
      System.out.println(flower);
    }
  }
}
