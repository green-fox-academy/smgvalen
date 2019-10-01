package gardenapp;

import java.util.ArrayList;

public class Garden {
    private ArrayList<Flower> gardenFlower = new ArrayList<>();
    private ArrayList<Tree> gardenTree = new ArrayList<>();

    public Garden () {
        Flower yellowFlower = new Flower("yellow", 0);
        gardenFlower.add(yellowFlower);
        Flower blueFlower = new Flower("blue", 0);
        gardenFlower.add(blueFlower);
        Tree purpleTree = new Tree("purple", 0);
        gardenTree.add(purpleTree);
        Tree orangeTree = new Tree("orange", 0);
        gardenTree.add(orangeTree);
    }
    public void printStatus () {
        for (Flower flower : gardenFlower) {
            System.out.println("The " + flower.getFlowerColor() + " " + flower.getClass().getSimpleName() + flower.needWater());

        }
        for (Tree tree : gardenTree) {
            System.out.println("The " + tree.getTreeColor() + " " + tree.getClass().getSimpleName() + tree.needWater());
        }
    }
    public void watering(int receivedWater) {

        }

}
// The yellow Flower needs water
//The blue Flower needs water
//The purple Tree needs water
//The orange Tree needs water
