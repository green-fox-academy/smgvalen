import java.util.ArrayList;

public class ListIntro1 {
    public static void main(String[] args) {
        // Create an empty list which will contain names (strings)
        ArrayList<String> name = new ArrayList<>();
        // Print out the number of elements in the list
        System.out.println(name.size());
        // Add William to the list
        name.add("William");
        // Print out whether the list is empty or not
        System.out.println(name.isEmpty());
        // Add John and Amanda to the list
        name.add("John");
        name.add("Amanada");
        //Print out the number of elements in the list
        System.out.println(name.size());
        //Print out the 3rd element
        System.out.println(name.get(2));
        // Iterate through the list and print out each name
        for (int i = 0; i < name.size(); i++) {
            System.out.println(i + name.get(i));
        }
        // Iterate through the list and print
        for (int i = 0; i < name.size(); i++) {
            System.out.println(i + 1 + ". " + name.get(i));
        }
        //Remove the 2nd element
        name.remove(1);
        System.out.println();
        // Iterate through the list in a reversed order and print out each name
        for (int i = name.size()-1; i >= 0; i--) {
            System.out.println(name.get(i));
        }
        // Remove all elements
        name.clear();
    }
}
