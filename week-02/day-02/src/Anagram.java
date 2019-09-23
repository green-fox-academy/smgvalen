import java.util.Scanner;

public class Anagram {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("give me a word");
    String inputString1 = scanner.next();
    System.out.println("give me another one to compare to each othergod");
    String inputString = scanner.next();
    if (inputString1.equals(wordReverser(inputString))) {
      System.out.println("yeesss, anagram");
    } else {
      System.out.println("nope");
    }

  }

  public static String wordReverser(String input) {
    String temp = "";
    int inputLength = input.length();
    for (int i = inputLength -1; i > -1; i--) {
      input.charAt(i);
      temp = temp + input.charAt(i);
    } return temp;

  }

}
