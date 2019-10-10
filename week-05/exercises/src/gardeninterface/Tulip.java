package gardeninterface;

public class Tulip implements Waterable {

  private double height;

  public Tulip(double height) {
    this.height = height;
  }

  public void water (double amount) {
    height = height + (0.06 * amount);
  }
}


