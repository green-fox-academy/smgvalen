import java.util.ArrayList;
import java.util.Arrays;

public class ListIntro2 {
    public static void main(String[] args) {
        ArrayList<String> ListA = new ArrayList<>();
        ListA.add("Apple");         //made a list which contains
        ListA.add("Avocado");       //some fruits
        ListA.add("Blueberries");
        ListA.add("Durian");
        ListA.add("Lychee");

        ArrayList<String> ListB = (ArrayList<String>)ListA.clone();
        // System.out.println(ListB); cloned ListA to ListB

        System.out.println("ListA contains Durian? " + ListA.contains("Durian")); //ListA contains Durian?

        ListB.remove("Durian");  //remove Durian from ListB

        ListA.add(4, "Kiwifruit");
        // System.out.println(ListA); kiwi successfully added to ListA after index4

        int sizeLA = ListA.size();
        int sizeLB = ListB.size();
        if (sizeLA != sizeLB) {
            System.out.println("Sizes of Lists are not equal!");
        }
        else {
            System.out.println("The two lists are equal.");
        }

        System.out.println(ListA.indexOf("Avocado"));

        System.out.println(ListB.indexOf("Durian")); //result is -1 because Durian was removed before

        String[] TwoFruitsOneStatement = {"Passion Fruit", "Pomelo"};
        ListB.addAll(Arrays.asList(TwoFruitsOneStatement)); // erre kérdezz rá, nem érted, csak lelested
        System.out.println(ListB);  // it works...why?

        System.out.println(ListA.get(3));

    }
}
