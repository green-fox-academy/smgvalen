import java.util.Scanner;

public class Sum {

  public static void main(String[] args) {
    // Create the usual class wrapper and main method on your own.
    // Write a function called `sum` that returns the sum of numbers from zero to the given parameter
    System.out.println("give the number should sum from zero");
    Scanner scanner = new Scanner(System.in);
    int number = scanner.nextInt();
    System.out.println(sumAll(number));

  }

  public static int sumAll(int sum) {
    int n = 0;  // function should count from 0
    for (int i = 0; i <= sum; i++) {
      n = n + i;
    }
    return n;
  }
}
