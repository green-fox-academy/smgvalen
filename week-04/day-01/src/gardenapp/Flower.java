package gardenapp;

public class Flower {
    private int waterAmount = 5;
    private String flowerColor;

    public int getWaterAmount() {
        return waterAmount;
    }

    public Flower (String flowerColor, int waterAmount) {
        this.flowerColor = flowerColor;
        this.waterAmount = waterAmount;
    }
    public String getFlowerColor() {
        return flowerColor;
    }
    public String needWater () {
        if (this.waterAmount < 5) {
            return " needs water";
        } else return " doesn't need water";
    }

    public void water(int receivedWater) {
        if ( this.waterAmount < 5) {
            this.waterAmount += receivedWater * 0.75;
        }
    }
}
