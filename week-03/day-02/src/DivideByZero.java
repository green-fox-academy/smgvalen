import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int number = 10;
    int inputNumber = scanner.nextInt();
    try {
      int result = number / inputNumber;
      System.out.println(result);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
