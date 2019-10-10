package garden;

public class Tulip extends Flower {

  public Tulip(double height) {
    super(height);
  }

  @Override
  public void water(int amount) {
    setHeight(getHeight() + 0.06 * amount);
  }
}
