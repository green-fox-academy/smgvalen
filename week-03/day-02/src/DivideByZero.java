import java.util.Scanner;

public class DivideByZero {

  public static void main(String[] args) {
    division(0);
  }

  public static void division(int input) {
    try {
      //  int result = 10 / input;
      System.out.println(10 / input);
    } catch (ArithmeticException e) {
      System.out.println("fail");
    }
  }
}
// Create a function that takes a number
// divides ten with it,
// and prints the result.
// It should print "fail" if the parameter is 0
