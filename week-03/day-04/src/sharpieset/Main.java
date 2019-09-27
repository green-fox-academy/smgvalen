package sharpieset;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Sharpie pen1 = new Sharpie("green", 0.55f);
        Sharpie pen2 = new Sharpie("red", 0.42f);

        SharpieSet penbox = new SharpieSet();

        penbox.sharpieList.add(pen1);
        penbox.sharpieList.add(pen2);
        pen2.inkAmount = 1f;
        pen1.use();
        pen2.use();

        System.out.println("The amount of ink of the pen is: " + pen2.inkAmount);
        System.out.println("Is this pen still useable? " + penbox.countUsable(pen2));

        penbox.removeTrash();


    }

}
