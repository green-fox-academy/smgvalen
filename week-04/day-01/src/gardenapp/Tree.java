package gardenapp;

public class Tree {
    private int waterAmount = 5;
    private String treeColor;

    public Tree (String treeColor, int waterAmount) {
        this.treeColor = treeColor;
        this.waterAmount = waterAmount;
    }
    public String getTreeColor() {
        return treeColor;
    }
    public String needWater () {
        if (this.waterAmount < 10) {
            return " needs water";
        }
        else return " doesn't need water";
    }

    public void water(int receivedWater) {
        if ( this.waterAmount < 10) {
            this.waterAmount += receivedWater * 0.4;
        }
    }
}
