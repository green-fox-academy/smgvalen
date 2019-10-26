import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Fox {

  private String name;
  private String color;
  private int age;

  public Fox(String name, String color, int age) {
    this.name = name;
    this.color = color;
    this.age = age;
  }

  public static void main(String[] args) {

    Fox fennec = new Fox("Desert", "sand", 10);
    Fox kit = new Fox("Joaquin", "rusty", 6);
    Fox redFox = new Fox("Mr Fox", "green", 5);
    Fox arctic = new Fox("Polar", "white", 4);
    Fox grey = new Fox("Northy", "grey", 16);
    Fox kili = new Fox("Kili", "green", 2);

    List<Fox> foxSpecies = new ArrayList<>(Arrays.asList(fennec, kit, redFox, arctic, grey, kili));

    //Write a Stream Expression to find the foxes with green color!

    List<String> whichFoxIsGreen = foxSpecies.stream()
        .filter(fox -> fox.color.equals("green"))
        .map(fox -> fox.name)
        .collect(Collectors.toList());

    System.out.println(whichFoxIsGreen);
    //Write a Stream Expression to find the foxes with green color, and age less then 5 years!

    List<String> greenAndYoungFoxes = foxSpecies
        .stream()
        .filter(fox -> fox.color.equals("green") && fox.age < 5)
        .map(fox -> fox.name)
        .collect(Collectors.toList());

    System.out.println(greenAndYoungFoxes);
    //Write a Stream Expression to find the frequency of foxes by color!

    Map<Object, Long> frequencyOfFoxesByColor = foxSpecies.stream()
        .collect(Collectors.groupingBy(fox -> fox.color, Collectors.counting()));
    System.out.println(frequencyOfFoxesByColor);
  }
}
