package gardeninterface;

public class Rose implements Waterable {

  private double roseSpecific = 0.15;
  private double height;

  public Rose(double height) {
    this.height = height;
  }
  public void water (double amount) {
    height = height + (0.04 * amount) + roseSpecific;
  }
}
