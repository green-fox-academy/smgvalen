package garden;

public abstract class Flower {

  private double height;

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public Flower(double height) {
    this.height = height;
  }

  public abstract void water(int amount);

  @Override
  public String toString() {
    return String.valueOf(height);
  }
}
