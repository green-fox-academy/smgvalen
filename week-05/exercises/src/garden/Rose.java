package garden;

public class Rose extends Flower{
    private double roseSpecific = 0.15;

  public Rose(int height) {
    super(height);
  }

  @Override
  public void water(int amount) {
    setHeight(getHeight() + (0.04 * amount) + roseSpecific);

  }
}
