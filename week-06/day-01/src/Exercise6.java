import static java.lang.Character.isUpperCase;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Exercise6 {

  public static void main(String[] args) {

    String string = "My name is Valentin G Sumegi";

    Stream<Character> x = string.codePoints().mapToObj(c -> (char) c);
    Stream<Character> y = x.filter(character -> isUpperCase(character));

    List<Character> uppercasedCharacters = y.collect(Collectors.toList());

    System.out.println(uppercasedCharacters);

    //Write a Stream Expression to find the strings which starts with a given letter(as parameter), in the following list:

    List<String> cities = Arrays
        .asList("ROME", "LONDON", "NAIROBI", "CALIFORNIA", "ZURICH", "NEW DELHI", "AMSTERDAM",
            "ABU DHABI", "PARIS");

    cities.stream().filter(city -> city.startsWith("A"))
        .forEach(System.out::println);

    System.out.println("=========which is better?=============");

    List<String> citiesStartWithGivenParameter =
        cities.stream().filter(city -> city.startsWith("A"))
            .collect(Collectors.toList());
    System.out.println(citiesStartWithGivenParameter);

    System.out.println("===========================");

    //Write a Stream Expression to concatenate a Character list to a string!
    List<Character> chars = Arrays.asList('T', 'e', 'c', 'h', 'i', 'e');

    String charsToString = chars.stream()
        .map(String::valueOf)
        .collect(Collectors.joining());
    System.out.println(charsToString);

    System.out.println("==============================");

    //Write a Stream Expression to find the frequency of characters in a given string!
    String inputString = "My name is Valentin George Sumegi";
    Map<Character, Long> frequency = inputString.chars()
        .mapToObj(c -> (char) c)
        .collect(Collectors.groupingBy(Function.identity(),
            Collectors.counting()));
    System.out.println(frequency);

    System.out.println("==============================");


  }
}
